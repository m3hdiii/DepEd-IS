package com.thesis.service;

import com.thesis.model.Department;
import com.thesis.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public boolean addDepartment(Department department) {
        return false;
    }

    @Override
    public boolean removeDepartment(Long departmentId) {
        return false;
    }

    @Override
    public boolean editDepartment(Department department) {
        return false;
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.fetchDepartments();
    }
}
