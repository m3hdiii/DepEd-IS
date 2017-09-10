package com.thesis.repository;

import com.thesis.model.location.officeplace.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/13/17.
 */

class SaveDepartments {

    public static List<Department> fetchDepartments(){

        return new ArrayList<Department>(){{
//            add(new Department(1L, "Education", "Educational Problems and new Announcement", "Sir. Loui"));
//            add(new Department(2L, "Natural Disaster", "School Disaster recovery", "Sir. Amoriyo"));
//            add(new Department(3L, "School Supply", "Measurement and Supply items into diffrent schools", "Sir. Gomborza"));
        }};
    }
}

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {


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
        return SaveDepartments.fetchDepartments();
    }
}
