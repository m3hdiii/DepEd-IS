package com.deped.controller.places;

import com.deped.controller.AbstractMainController;
import com.deped.model.location.office.Section;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.JstlView;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class SectionController extends AbstractMainController<Section, Long> {

    private static final String BASE_NAME = "section";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String RENDER_UPDATE_MAPPING = BASE_NAME + RENDER_UPDATE_PATTERN;
    private static final String RENDER_LIST_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String RENDER_LIST_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String RENDER_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    private static final String BASE_SHOW_PAGE = JSP_PAGES + URL_SEPARATOR + BASE_NAME;
    private static final String CREATE_VIEW_PAGE = BASE_SHOW_PAGE + CREATE_PAGE;
    private static final String INFO_VIEW_PAGE = BASE_SHOW_PAGE + UPDATE_PAGE;
    private static final String UPDATE_VIEW_PAGE = BASE_SHOW_PAGE + UPDATE_PAGE;
    private static final String LIST_VIEW_PAGE = BASE_SHOW_PAGE + SHOW_PAGE;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = GET)
    public ModelAndView renderCreatePage(@Valid Section entity) {
        return new ModelAndView(new JstlView(CREATE_VIEW_PAGE));
    }

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = POST)
    public ModelAndView createAction(@Valid Section entity) {
        return null;
    }

    @Override
    @RequestMapping(value = RENDER_BY_ID_MAPPING, method = GET)
    public ModelAndView renderInfo(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return new ModelAndView(new JstlView(INFO_VIEW_PAGE));
    }

    @Override
    @RequestMapping(value = RENDER_UPDATE_MAPPING, method = GET)
    public ModelAndView renderUpdatePage(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return new ModelAndView(new JstlView(UPDATE_VIEW_PAGE));
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = POST)
    public ModelAndView updateAction(@Valid Section entity) {
        return null;
    }

    @Override
    @RequestMapping(value = RENDER_LIST_MAPPING, method = GET)
    public ModelAndView renderListPage() {
        return new ModelAndView(new JstlView(LIST_VIEW_PAGE));
    }

    @Override
    @RequestMapping(value = RENDER_LIST_BY_RANGE_MAPPING, method = GET)
    public ModelAndView renderListPage(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return new ModelAndView(new JstlView(LIST_VIEW_PAGE));
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = POST)
    public ModelAndView removeAction(@Valid Section... entity) {
        return null;
    }
}
