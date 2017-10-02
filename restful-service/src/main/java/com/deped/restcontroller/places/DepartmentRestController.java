package com.deped.restcontroller.places;

import com.deped.model.Response;
import com.deped.model.location.office.Department;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.service.places.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentRestController extends AbstractMainRestController<Department, Long> {

    private static final String BASE_NAME = "department";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private DepartmentService departmentService;


    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public Department create(@RequestBody Department entity) {
        Department savedDepartment = departmentService.create(entity);
        return savedDepartment;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(@RequestBody Department entity) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public List<Department> fetchAll() {
        return departmentService.fetchAll();
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<Department> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public Department fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public Response remove(@RequestBody Department... entities) {
        Boolean isRemoved = departmentService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Department.class);
    }
}
