package com.deped.restcontroller.pack;

import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.model.Response;
import com.deped.model.items.Pack;
import com.deped.service.pack.PackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PackRestController extends AbstractMainRestController<Pack, Long> {

    private static final String BASE_NAME = "pack";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private PackService packService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Pack create(@RequestBody Pack entity) {
        Pack savedPack = packService.create(entity);
        return savedPack;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Pack entity) {
        Boolean isUpdated = packService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Pack.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    List<Pack> fetchAll() {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    List<Pack> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Pack fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Pack pack = packService.fetchById(aLong);
        return pack;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Pack... entities) {
        Boolean isRemoved = packService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Pack.class);
    }
}
