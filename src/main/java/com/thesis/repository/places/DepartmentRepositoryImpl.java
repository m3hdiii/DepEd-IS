package com.thesis.repository.places;

import com.thesis.model.location.office.Department;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @Autowired
    private HibernateFacade hibernateFacade;
    private SessionFactory sessionFactory = hibernateFacade.getSessionFactory();

    @Override
    public boolean addDepartment(Department department) {

        Session session = sessionFactory.openSession();


        return false;
    }

    @Override
    public boolean removeDepartment(Department department) {
        return false;
    }

    @Override
    public boolean removeDepartment(Long departmentId) {
        return false;
    }

    @Override
    public List<Department> fetchAllDepartments() {
        return null;
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
