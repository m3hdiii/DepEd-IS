package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.location.office.Department;
import com.thesis.service.places.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DepartmentController {


    @Autowired
    @Qualifier(value = "mainDepartmentService")
    private DepartmentService departmentService;

    @RequestMapping(value = "/add-department", method = RequestMethod.GET)
    public Response addDepartment(@RequestBody Department department) {

        departmentService.createDepartment(null);
        return null;
    }
}
