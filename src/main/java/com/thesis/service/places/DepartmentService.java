package com.thesis.service.places;

import com.thesis.model.location.office.Department;

import java.util.List;

public interface DepartmentService {

    Boolean createDepartment(Department department);

    Boolean removeDepartment(Department department);

    Boolean removeDepartment(Long departmentId);

    List<Department> fetchAllDepartments();

    List<Department> fetchDepartment(int from, int to);

    Department updateDepartment(Department department);

}
