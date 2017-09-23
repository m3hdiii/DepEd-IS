package com.thesis.service.places;

import com.thesis.model.location.office.Department;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {


    @Override
    public boolean addDepartment(Department department) {
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
