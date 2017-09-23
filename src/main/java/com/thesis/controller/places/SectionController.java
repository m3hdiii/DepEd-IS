package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.account.User;
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

    @RequestMapping(value = "sections", method = RequestMethod.GET)
    public @ResponseBody
    List<Section> showSections() {
//        List<Section> sections = sectionService.fetchAllSections();
        List<Section> sections = new ArrayList<Section>() {{
            add(new Section("IT Section", "Description", null, new Date()));
            add(new Section("CED Section", "Description", null, new Date()));
            add(new Section("SGOD Section", "Description", null, new Date()));
            add(new Section("HEAD Section", "Description", null, new Date()));
        }};

        return sections;
    }

    @RequestMapping(value = "add-section", method = RequestMethod.POST)
    public @ResponseBody
    Response addSection(@RequestBody Section section) {
        return new Response(ResponseStatus.SUCCESSFUL, "User successfully created");
    }


    @RequestMapping(value = "/get-json", method = RequestMethod.GET)
    public String showFetchJsonPage() {
        return "center/fetch-json";
    }

}
