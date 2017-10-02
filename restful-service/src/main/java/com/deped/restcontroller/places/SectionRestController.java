package com.deped.restcontroller.places;

import com.deped.model.Response;
import com.deped.model.location.office.Section;
import com.deped.repository.utils.Range;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.service.places.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SectionRestController extends AbstractMainRestController<Section, Long> {

    private static final String BASE_NAME = "section";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private SectionService sectionService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public Section create(@RequestBody Section entity) {
        Section savedSection = sectionService.create(entity);
        return savedSection;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(@RequestBody Section entity) {
        Boolean isUpdated = sectionService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Section.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public List<Section> fetchAll() {
        List<Section> sections = sectionService.fetchAll();
        return sections;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<Section> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Section> sections = sectionService.fetchByRange(new Range(from, to));
        return sections;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public Section fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Section section = sectionService.fetchById(aLong);
        return section;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public Response remove(@RequestBody Section... entities) {
        Boolean isRemoved = sectionService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Section.class);
    }
}
