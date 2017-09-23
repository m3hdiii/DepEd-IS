package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.account.User;
import com.thesis.model.location.office.Department;
import com.thesis.model.location.office.Section;
import com.thesis.service.places.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @RequestMapping(value = "/add-section", method = RequestMethod.POST)
    public @ResponseBody
    Response addSection(@RequestBody Section section) {

        Boolean isCreated = sectionService.createSection(section);

        if(isCreated == null || isCreated == false) {
            return new Response(ResponseStatus.FAILED, "section failed to create");
        }

        return new Response(ResponseStatus.SUCCESSFUL, "section successfully created");
    }

    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public @ResponseBody
    List<Section> fetchAllSections() {
        return sectionService.fetchAllSections();
    }
}
