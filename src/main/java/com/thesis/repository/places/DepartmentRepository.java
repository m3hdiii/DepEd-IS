package com.thesis.repository.places;

import com.thesis.model.location.office.Department;

import java.util.List;

public interface DepartmentRepository {

    boolean addDepartment(Department department);

    boolean removeDepartment(Department department);

    boolean removeDepartment(Long departmentId);

    List<Department> fetchAllDepartments();

    List<Department> fetchDepartment(int from, int to);

    Department updateDepartment(Department department);
}
