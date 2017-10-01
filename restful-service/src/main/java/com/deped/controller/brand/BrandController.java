package com.deped.controller.brand;

import com.deped.controller.AbstractMainController;
import com.deped.controller.Operation;
import com.deped.model.Response;
import com.deped.model.items.Brand;
import com.deped.repository.utils.Range;
import com.deped.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController extends AbstractMainController<Brand, Long> {

    private static final String BASE_NAME = "brand";
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
    private BrandService brandService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Brand create(@RequestBody Brand entity) {
        Brand savedBrand = brandService.create(entity);
        return savedBrand;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(@RequestBody Brand entity) {
        Boolean isUpdated = brandService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Brand.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Brand> fetchAll() {
        List<Brand> brands = brandService.fetchAll();
        return brands;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public List<Brand> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Brand> brands = brandService.fetchByRange(new Range(from, to));
        return brands;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING)
    public @ResponseBody
    Brand fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Brand brand = brandService.fetchById(aLong);
        return brand;
    }

    @Override
    public @ResponseBody
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    Response remove(@RequestBody Brand... entities) {
        Boolean isRemoved = brandService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Brand.class);
    }

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING, method = RequestMethod.GET)
    public String showCreatePage(Brand entity, Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = SHOW_LIST_MAPPING, method = RequestMethod.GET)
    public String showListPage(Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = SHOW_UPDATE_MAPPING, method = RequestMethod.GET)
    public String showUpdatePage() {
        return "";
    }
}
