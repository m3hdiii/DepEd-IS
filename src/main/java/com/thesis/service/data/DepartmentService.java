package com.thesis.service.data;

import com.thesis.model.location.office.Department;

import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */
public interface DepartmentService {

    boolean addDepartment(Department department);
    boolean removeDepartment(Long departmentId);
    boolean editDepartment(Department department);
    List<Department> fetchDepartments();
}
