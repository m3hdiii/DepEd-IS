package com.deped.restcontroller.brand;

import com.deped.model.Response;
import com.deped.model.items.Brand;
import com.deped.repository.utils.Range;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.service.brand.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandRestController extends AbstractMainRestController<Brand, Long> {

    private static final String BASE_NAME = "brand";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;


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
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    List<Brand> fetchAll() {
        List<Brand> brands = brandService.fetchAll();
        return brands;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<Brand> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Brand> brands = brandService.fetchByRange(new Range(from, to));
        return brands;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
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
}
