package com.thesis.controller.places;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.location.office.Section;
import com.thesis.repository.utils.Range;
import com.thesis.service.places.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SectionController extends AbstractMainController<Section, Long> {

    @Autowired
    private SectionService sectionService;

    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public @ResponseBody
    List<Section> fetchAllSections() {
        return sectionService.fetchAll();
    }

    @RequestMapping(value = "/add-section", method = RequestMethod.POST)
    @Override
    public @ResponseBody
    Section create(@RequestBody Section entity) {
        Section savedSection = sectionService.create(entity);
        return savedSection;
    }

    @Override
    @RequestMapping(value = "edit-section", method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Section entity) {
        Boolean isUpdated = sectionService.update(entity);
        return makeResponse(isUpdated, "section information successfully updated", "failed to update the Section");
    }

    @Override
    public List<Section> fetchAll() {
        List<Section> sections = sectionService.fetchAll();
        return sections;
    }

    @Override
    public List<Section> fetchByRange(int from, int to) {
        List<Section> sections = sectionService.fetchByRange(new Range(from, to));
        return sections;
    }

    @Override
    public Section fetchById(Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = "/remove-section/{section-id}", method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Section... entities) {
        Boolean isRemoved = sectionService.remove(entities);
        return makeResponse(isRemoved, "Section successfully removed", "Failed to remove Section");
    }

    @Override
    @RequestMapping(value = "create-section")
    public String renderCreatePage(@Valid Section entity, Model model) {
        return "";
    }


    @Override
    @RequestMapping(value = "show-sections", method = RequestMethod.GET)
    public String renderListPage(Model model) {
        model.addAttribute("sections", sectionService.fetchAll());
        return "";
    }


    @Override
    @RequestMapping(value = "update-section", method = RequestMethod.GET)
    public String renderUpdatePage() {

        return "";
    }
}
