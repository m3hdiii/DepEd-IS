package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.location.office.Department;
import com.thesis.service.places.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DepartmentController {

    private DepartmentService departmentService;

    public Response addDepartment(@RequestBody Department department) {


        return null;
    }
}
