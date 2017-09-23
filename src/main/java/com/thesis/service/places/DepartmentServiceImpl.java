package com.thesis.service.places;

import com.thesis.model.location.office.Department;
import com.thesis.repository.places.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("mainDepartmentService")
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public Boolean createDepartment(Department department) {
        return departmentRepository.createDepartment(department);
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
