package com.thesis.controller.places;

import com.thesis.controller.AbstractMainController;
import com.thesis.controller.Operation;
import com.thesis.model.Response;
import com.thesis.model.location.office.Section;
import com.thesis.repository.utils.Range;
import com.thesis.service.places.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SectionController extends AbstractMainController<Section, Long> {

    private static final String BASE_NAME = "section";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;
    private static final String SHOW_CREATE_MAPPING = CREATE_MAPPING;
    private static final String SHOW_LIST_MAPPING = BASE_NAME + SHOW_PREFIX;
    private static final String SHOW_UPDATE_MAPPING = UPDATE_MAPPING;

    @Autowired
    private SectionService sectionService;


    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Section create(@RequestBody Section entity) {
        Section savedSection = sectionService.create(entity);
        return savedSection;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Section entity) {
        Boolean isUpdated = sectionService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Section.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Section> fetchAll() {
        List<Section> sections = sectionService.fetchAll();
        return sections;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Section> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Section> sections = sectionService.fetchByRange(new Range(from, to));
        return sections;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
    public Section fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Section section = sectionService.fetchById(aLong);
        return section;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Section... entities) {
        Boolean isRemoved = sectionService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Section.class);
    }

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING)
    public String showCreatePage(@Valid Section entity, Model model) {
        return "";
    }


    @Override
    @RequestMapping(value = SHOW_LIST_MAPPING, method = RequestMethod.GET)
    public String showListPage(Model model) {
        model.addAttribute("sections", sectionService.fetchAll());
        return "";
    }


    @Override
    @RequestMapping(value = SHOW_UPDATE_MAPPING, method = RequestMethod.GET)
    public String showUpdatePage() {
        return "";
    }
}
