package com.thesis.repository.places;

import com.thesis.model.location.office.Department;
import com.thesis.repository.utils.ConstantValues;
import com.thesis.repository.utils.HibernateFacade;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.thesis.repository.utils.ConstantValues.*;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public Department create(Department entity) {
        return hibernateFacade.saveEntity(Department.class, entity);
    }

    @Override
    public Boolean update(Department entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<Department> fetchAll() {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_DEPARTMENTS, Department.class);
    }

    @Override
    public List<Department> fetchByRange(Range range) {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_DEPARTMENT_RANGES, Department.class, range);
    }

    @Override
    public Department fetchById(Object id) {
        return hibernateFacade.fetchEntityById(Department.class, id);
    }

    @Override
    public Boolean remove(Department... entities) {
        return hibernateFacade.
                removeEntities(ConstantValues.DEPARTMENT_TABLE, ConstantValues.DEPARTMENT_TABLE_ID, entities);
    }
}
