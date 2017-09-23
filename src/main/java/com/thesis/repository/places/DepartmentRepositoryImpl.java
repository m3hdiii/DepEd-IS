package com.thesis.repository.places;

import com.thesis.model.location.office.Department;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @Autowired
    private HibernateFacade hibernateFacade;
    private SessionFactory sessionFactory = hibernateFacade.getSessionFactory();

    @Override
    public Boolean createDepartment(Department department) {
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
            hibernateSession.save("Department", department);
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

        return true;
    }

    @Override
    public Boolean removeDepartment(Department department) {
        return false;
    }

    @Override
    public Boolean removeDepartment(Long departmentId) {
        return false;
    }

    @Override
    public List<Department> fetchAllDepartments() {
        Session hibernateSession;
        List<Department> departments = null;
        try {
            hibernateSession = sessionFactory.openSession();
            Query<Department> query = hibernateSession.createNamedQuery("fetchAllDepartments", Department.class);
            departments = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return departments;
    }

    @Override
    public List<Department> fetchDepartment(int from, int to) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }
}
