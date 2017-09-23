package com.thesis.controller.profile;

import com.thesis.model.location.office.Section;
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

    @RequestMapping(value = "add-section", method = RequestMethod.POST)
    public String createNewSection(@RequestBody Section section){

        return null;

    }

    @RequestMapping(value = "/get-json" , method = RequestMethod.GET)
    public String showFetchJsonPage(){
        return "center/fetch-json";
    }

    @RequestMapping(value= "/section-list", method = RequestMethod.POST)
    public @ResponseBody List<Section> getSectionList(){
        List<Section> sections = new ArrayList<Section>(){{
            add(new Section("IT Section","Sir Harris Description", null, new Date()));
            add(new Section("Manager Section","Manager Section Description", null, new Date()));
            add(new Section("Accounting Section","Accounting Section Description", null, new Date()));
            add(new Section("CID Section","CID Section Description", null, new Date()));
            add(new Section("SGOD Section","SGOD Section Description", null, new Date()));
        }};

        return sections;
    }
}
