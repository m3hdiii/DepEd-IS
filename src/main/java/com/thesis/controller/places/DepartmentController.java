package com.thesis.controller.places;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.location.office.Department;
import com.thesis.service.places.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController extends AbstractMainController<Department, Long> {

    @Autowired
    private DepartmentService departmentService;


    @Override
    @RequestMapping(value = "/add-department", method = RequestMethod.POST)
    public @ResponseBody
    Department create(@RequestBody Department entity) {
        Department savedDepartment = departmentService.create(entity);
        if (savedDepartment.getDepartmentId() == null) {
            return null;
        }
        return savedDepartment;
    }

    @Override
    public Response update(Department entity) {
        return null;
    }

    @Override
    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public @ResponseBody
    List<Department> fetchAll() {
        return departmentService.fetchAll();
    }

    @Override
    public List<Department> fetchByRange(int from, int to) {
        return null;
    }

    @Override
    public Department fetchById(Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = "remove-departments")
    public Response remove(Department... entities) {
        Boolean isRemoved = departmentService.remove(entities);
        return makeResponse(isRemoved, "all departments removed", "failed to remove departments");
    }

    @Override
    public String renderCreatePage(Department entity, Model model) {
        return null;
    }

    @Override
    public String renderListPage(Model model) {
        return null;
    }

    @Override
    public String renderUpdatePage() {
        return null;
    }
}
