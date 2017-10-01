package com.deped.controller.supply;

import com.deped.controller.AbstractMainController;
import com.deped.controller.Operation;
import com.deped.model.Response;
import com.deped.model.supply.Supply;
import com.deped.repository.utils.Range;
import com.deped.service.supply.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplyController extends AbstractMainController<Supply, Long> {

    private static final String BASE_NAME = "supply";
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
    private SupplyService supplyService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Supply create(@RequestBody Supply entity) {
        Supply supply = supplyService.create(entity);
        return supply;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Supply entity) {
        Boolean isUpdated = supplyService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Supply.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Supply> fetchAll() {
        return supplyService.fetchAll();
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public List<Supply> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return supplyService.fetchByRange(new Range(from, to));
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
    public Supply fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return supplyService.fetchById(aLong);
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Supply... entities) {
        Boolean isRemoved = supplyService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Supply.class);
    }

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING, method = RequestMethod.GET)
    public String showCreatePage(Supply entity, Model model) {
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
