package com.thesis.service.places;

import com.thesis.model.location.office.Department;
import com.thesis.repository.places.DepartmentRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department create(Department entity) {
        return departmentRepository.create(entity);
    }

    @Override
    public Boolean update(Department entity) {
        return departmentRepository.update(entity);
    }

    @Override
    public List<Department> fetchAll() {
        return departmentRepository.fetchAll();
    }

    @Override
    public List<Department> fetchByRange(Range range) {
        return departmentRepository.fetchByRange(range);
    }

    @Override
    public Department fetchById(Object id) {
        return departmentRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Department... entities) {
        return departmentRepository.remove(entities);
    }
}
