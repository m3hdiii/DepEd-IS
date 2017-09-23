package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.location.office.Department;
import com.thesis.service.places.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DepartmentController {

    /**
     * {
     * "name": "SCIS Department",
     * "description" : "SCIS Department Description",
     * "departmentHead": "Kevin",
     * "creationDate" : 1506149850002
     * }
     */

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/add-department", method = RequestMethod.POST)
    public Response addDepartment(@RequestBody Department department) {

        Boolean isSaved = departmentService.createDepartment(department);
        if (isSaved == null || isSaved == false) {
            return new Response(ResponseStatus.FAILED, "The department could not created");
        }
        return new Response(ResponseStatus.FAILED, "The department successfully created");
    }

    @RequestMapping(value = "/departments", method = RequestMethod.POST)
    public @ResponseBody
    List<Department> fetchDepartments() {
        return departmentService.fetchAllDepartments();
    }
}
