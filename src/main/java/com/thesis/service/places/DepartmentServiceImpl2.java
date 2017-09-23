package com.thesis.service.places;

import com.thesis.model.location.office.Department;

import java.util.List;

public class DepartmentServiceImpl2 implements DepartmentService {
    @Override
    public boolean createDepartment(Department department) {
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
