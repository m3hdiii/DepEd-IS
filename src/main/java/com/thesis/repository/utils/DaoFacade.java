package com.thesis.repository.utils;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import org.hibernate.ejb.HibernateEntityManager;
import org.hibernate.transform.DistinctRootEntityResultTransformer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DaoFacade {

    public void test(){


        
    }


    @PersistenceContext
    private EntityManager entityManager;

    public <T> long countAll(Class<T> entityClass) {
        return countByCriteria(entityClass, new Criterion[0]);
    }

    public <T> void deleteById(Class<T> entityClass, Long objectId) {
        Session session = null;
        Object o = null;
        try {
            session = getHibernateSession();
            o = session.get(entityClass, objectId);
            if (o == null)
                throw new Exception("this object could not found");

        } catch (Exception e) {
            e.printStackTrace();
        }
        session.delete(o);
        session.flush();
    }

    public <T> long countByCriteria(Class<T> entityClass, Criterion... criterion) {
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);
        crit.setProjection(Projections.rowCount());

        if (criterion != null) {
            for (Criterion c : criterion) {
                crit.add(c);
            }
        }

        long result = ((Long) crit.list().get(0)).longValue();


        return result;
    }

    public <T> long countByCriteria(Class<T> entityClass, FetchInfo<T> fetchinfo) {
        Session session = getHibernateSession();

        Criteria crit = session.createCriteria(entityClass);
        crit.setProjection(Projections.rowCount());
        List<Criterion> crits = fetchinfo.getCriterions();

        if (fetchinfo.getAlias() != null) {
            for (String als : fetchinfo.getAlias().keySet()) {
                crit = crit.createAlias(als, (String) fetchinfo.getAlias().get(als));
            }
        }

        if (crits != null) {
            for (Criterion c : crits) {
                crit.add(c);
            }
        }

        long result = ((Long) crit.list().get(0)).longValue();

        return result;
    }

    public <T> long countByExample(Class<T> entityClass, T exampleInstance) {
        int result = 0;
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);
        crit.setProjection(Projections.rowCount());
        crit.add(Example.create(exampleInstance));
        result = ((Integer) crit.list().get(0)).intValue();

        return result;
    }

    public <T> List<T> findAll(Class<T> entityClass) {
        return findByCriteria(entityClass, new Criterion[0]);
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, Criterion... criterion) {
        return findByCriteria(entityClass, -1, -1, (List<Alias>) null, criterion);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByCriteria(Class<T> entityClass, FetchInfo<T> fetchinfo) {
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);
        List<Criterion> crits = fetchinfo.getCriterions();
        if (crits != null) {
            for (Criterion c : crits) {
                crit.add(c);
            }
        }

        if (fetchinfo.getAlias() != null) {
            for (String als : fetchinfo.getAlias().keySet()) {
                crit = crit.createAlias(als, (String) fetchinfo.getAlias().get(als));
            }
        }

        if (fetchinfo.getFirstResult() > 0) {
            crit.setFirstResult(fetchinfo.getFirstResult());
        }

        if (fetchinfo.getMaxResult() > 0) {
            crit.setMaxResults(fetchinfo.getMaxResult());
        }

        if (fetchinfo.getOrder() != null) {
            crit.addOrder(fetchinfo.getOrder());
        }

        List<T> result = crit.list();

        return result;
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, int firstResult, int maxResults, Criterion... criterion) {
        return findByCriteria(entityClass, firstResult, maxResults, (List<Alias>) null, criterion);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByCriteria(Class<T> entityClass, int firstResult, int maxResults, List<Alias> alias, Criterion... criterion) {

        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);

        if (alias != null) {
            for (Alias als : alias) {
                crit = crit.createAlias(als.getName(), als.getValue(), als.getJoinType());
            }
        }

        if (criterion != null) {
            for (Criterion c : criterion) {
                crit.add(c);
            }
        }

        if (firstResult > 0) {
            crit.setFirstResult(firstResult);
        }

        if (maxResults > 0) {
            crit.setMaxResults(maxResults);
        }

        List<T> result = (List<T>) crit.list();

        return result;
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, int firstResult, int maxResults, Map<String, String> alias, Criterion... criterion) {
        List<Alias> aliases = new ArrayList<Alias>();

        if (alias != null) {
            for (String als : alias.keySet()) {
                aliases.add(new Alias(als, (String) alias.get(als)));
            }
        }

        return findByCriteria(entityClass, firstResult, maxResults, aliases, criterion);
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, int firstResult, int maxResults, ProjectionList projections, Map<String, String> alias, Criterion... criterion) {
        return findByCriteria(entityClass, firstResult, maxResults, projections, alias, null, criterion);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByCriteria(Class<T> entityClass, int firstResult, int maxResults, ProjectionList projections, Map<String, String> alias, Order order, Criterion... criterion) {
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);

        if (alias != null) {
            for (String als : alias.keySet()) {
                crit = crit.createAlias(als, (String) alias.get(als));
            }
        }

        if (criterion != null) {
            for (Criterion c : criterion) {
                crit.add(c);
            }
        }

        if (firstResult > 0) {
            crit.setFirstResult(firstResult);
        }

        if (maxResults > 0) {
            crit.setMaxResults(maxResults);
        }

        if (projections != null) {
            crit.setProjection(projections);
        }

        if (order != null) {
            crit.addOrder(order);
        }

        List<T> result = crit.list();

        return result;
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, Map<String, String> alias, Criterion... criterion) {
        return findByCriteria(entityClass, -1, -1, alias, criterion);
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, ProjectionList projections, Criterion... criterion) {
        return findByCriteria(entityClass, -1, -1, projections, null, null, criterion);
    }

    public <T> List<T> findByCriteria(Class<T> entityClass, ProjectionList projections, Map<String, String> alias, Criterion... criterion) {
        return findByCriteria(entityClass, -1, -1, projections, alias, null, criterion);
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByExample(Class<T> entityClass, T exampleInstance) {
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);
        Example example = Example.create(exampleInstance).ignoreCase();
        crit.add(example);
        crit.setResultTransformer(DistinctRootEntityResultTransformer.INSTANCE);
        List<T> result = crit.list();

        return result;
    }

    @SuppressWarnings("unchecked")
    public <T, ID> T findById(Class<T> entityClass, ID id) {
        Object result = this.entityManager.find(entityClass, id);
        return (T) result;
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> findByNamedQuery(String name, Object... params) {
        Query query = this.entityManager.createNamedQuery(name);

        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                query.setParameter(i + 1, params[i]);
            }
        }
        return query.getResultList();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <T> List<T> findByNamedQueryAndNamedParams(Class<T> entityClass, String name, Map<String, ? extends Object> params) {
        Query query = this.entityManager.createNamedQuery(name);

        for (Map.Entry param : params.entrySet()) {
            query.setParameter((String) param.getKey(), param.getValue());
        }
        return query.getResultList();
    }

    @SuppressWarnings("unchecked")
    public <T> T findUniqueResult(Class<T> entityClass, ProjectionList projections, List<Alias> aliases, Criterion... criterions) {
        Session session = getHibernateSession();
        Criteria crit = session.createCriteria(entityClass);

        if (aliases != null) {
            for (Alias als : aliases) {
                crit = crit.createAlias(als.getName(), als.getValue(), als.getJoinType());
            }
        }

        if (criterions != null) {
            for (Criterion c : criterions) {
                crit.add(c);
            }
        }

        if (projections != null) {
            crit.setProjection(projections);
        }

        T t = (T) crit.uniqueResult();

        return t;
    }

    private Session getHibernateSession() {
        return entityManager.unwrap(HibernateEntityManager.class).getSession();
    }

    @SuppressWarnings("unchecked")
    public <T> List<T> getStoreProcedureQueryResultList(String name) {
        Query query = this.entityManager.createNamedQuery(name);
        return (List<T>) query.getResultList();
    }

    public Object getStoreProcedureQuerySingleResult(String name) {
        Query query = this.entityManager.createNamedQuery(name);
        query.executeUpdate();
        return null;
    }

    public <T> boolean remove(T entity) {
        try {
            Object delEntity = this.entityManager.merge(entity);
            this.entityManager.remove(delEntity);
            this.entityManager.flush();
            return true;
            // TODO LOG
        } catch (Exception e) {
            // TODO LOG
            return false;
        }
    }

    public <T> T save(T entity) {
        // Object persistedEntity = this.entityManager.merge(entity);
        Session session = getHibernateSession();
        session.save(entity);
//		this.entityManager.persist(entity);
//		entityManager.flush();
		session.flush();

        return entity;
    }

    public <T> T update(T entity) {
        entity = this.entityManager.merge(entity);
        entityManager.flush();
        return entity;
    }
}