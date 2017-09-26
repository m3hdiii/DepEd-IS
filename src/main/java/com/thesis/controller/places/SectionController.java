package com.thesis.controller.places;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.location.office.Section;
import com.thesis.service.places.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @RequestMapping(value = "/add-section", method = RequestMethod.POST)
    public @ResponseBody
    Response addSection(@RequestBody Section section) {

        Boolean isCreated = sectionService.createSection(section);

        if (isCreated == null || isCreated == false) {
            return new Response(ResponseStatus.FAILED, "section failed to create");
        }

        return new Response(ResponseStatus.SUCCESSFUL, "section successfully created");
    }

    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public @ResponseBody
    List<Section> fetchAllSections() {
        return sectionService.fetchAllSections();
    }

    @RequestMapping(value = "/remove-section/{section-id}", method = RequestMethod.POST)
    public @ResponseBody
    Response removeSection(@PathVariable("section-id") Long sectionId) {
        Boolean isRemoved = sectionService.removeSection(sectionId);

        if (isRemoved == null || isRemoved == false) {
            return new Response(ResponseStatus.FAILED, "Failed to remove Section");
        }
        return new Response(ResponseStatus.SUCCESSFUL, "Section successfully removed");
    }

    @RequestMapping(value = "edit-section", method = RequestMethod.POST)
    public @ResponseBody
    Response editSection(@RequestBody Section section) {
        Boolean isUpdated = sectionService.updateSection(section);

        if (isUpdated == null || !isUpdated) {
            return new Response(ResponseStatus.FAILED, "failed to update the Section");
        }
        return new Response(ResponseStatus.SUCCESSFUL, "section information successfully updated");
    }
}
