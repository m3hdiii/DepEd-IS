package com.thesis.repository;

import com.thesis.model.location.officeplace.Department;

import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */
public interface DepartmentRepository {

    boolean addDepartment(Department department);
    boolean removeDepartment(Long departmentId);
    boolean editDepartment(Department department);
    List<Department> fetchDepartments();
}
