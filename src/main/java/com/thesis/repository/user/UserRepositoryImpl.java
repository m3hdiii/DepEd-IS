package com.thesis.repository.user;

import com.thesis.model.account.User;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private enum LoginMethod {
        EMAIL, USERNAME
    }

    @Autowired
    private HibernateFacade hibernateFacade;
    private SessionFactory sessionFactory = hibernateFacade.getSessionFactory();

    @Override
    public User createUser(User user) {
        Session hibernateSession;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        Transaction tx = null;

        try {
            tx = hibernateSession.beginTransaction();
            hibernateSession.save("User", user);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return null;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }

        return hibernateSession.get(User.class, user.getUserId());
    }

    @Override
    public boolean editUser(User user) {
        Session hibernateSession;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        Transaction tx = null;

        try {
            hibernateSession.update(user);
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return false;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }
        return true;
    }

    @Override
    public User loginUserByEmail(User user) {
        return loginUserGeneral(user, LoginMethod.EMAIL);
    }

    @Override
    public User loginUserByUsername(User user) {
        return loginUserGeneral(user, LoginMethod.USERNAME);
    }

    private User loginUserGeneral(User userInfo, LoginMethod loginMethod) {
        Session hibernateSession = null;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        User result = null;
        Transaction tx = null;
        String namedQueryName = null, parameterName = null, parameterValue = null;
        final String password = userInfo.getPassword();
        try {
            tx = hibernateSession.beginTransaction();

            switch (loginMethod) {
                case EMAIL:
                    namedQueryName = "findByEmailPassword";
                    parameterName = "emailAddress";
                    parameterValue = userInfo.getEmailAddress();
                    break;
                case USERNAME:
                    namedQueryName = "findByUsernamePassword";
                    parameterName = "username";
                    parameterValue = userInfo.getUsername();
                    break;
            }

            Query<User> query = hibernateSession.createNamedQuery(namedQueryName, User.class);

            result = query.setParameter(parameterName, parameterValue)
                    .setParameter("password", password)
                    .getSingleResult();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return null;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }

        return result;
    }

    @Override
    public List<User> findAllUsers() {
        return findUsersGeneral(null, null);
    }

    @Override
    public List<User> findUsers(Integer from, Integer to) {
        return findUsersGeneral(from, to);
    }

    private List<User> findUsersGeneral(Integer from, Integer to) {
        Session hibernateSession;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        Transaction tx = null;

        List<User> users;

        try {
            Query<User> namedQuery = hibernateSession.createNamedQuery("findAllUsers", User.class);
            if (from != null && to != null) {
                namedQuery.setFirstResult(from);
                namedQuery.setMaxResults(to);
            }
            users = namedQuery.list();
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return null;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }
        return users;
    }

    @Override
    public User fetchUserById(Long userId) {
        Session hibernateSession;
        try {
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        Transaction tx = null;

        User user;
        try {
            user = hibernateSession.find(User.class, userId);
        } catch (Exception e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
            return null;
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }
        return user;
    }
}
