package com.deped.controller.category;

import com.deped.controller.AbstractMainController;
import com.deped.model.Response;
import com.deped.model.items.Category;
import com.deped.service.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CategoryController extends AbstractMainController<Category, Long> {

    private static final String BASE_NAME = "/category";
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
    private CategoryService categoryService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Category create(@RequestBody Category entity) {
        Category savedCategory = categoryService.create(entity);
        return savedCategory;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Category entity) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Category> fetchAll() {
        return categoryService.fetchAll();
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Category> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    Category fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Category... entities) {
        return null;
    }

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING, method = RequestMethod.GET)
    public String showCreatePage(Category entity, Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = SHOW_LIST_MAPPING, method = RequestMethod.GET)
    public String showListPage(Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = SHOW_UPDATE_MAPPING, method = RequestMethod.GET)
    public String showUpdatePage() {
        return null;
    }
}
