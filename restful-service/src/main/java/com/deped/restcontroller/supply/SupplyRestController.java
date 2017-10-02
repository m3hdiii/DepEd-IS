package com.deped.restcontroller.supply;

import com.deped.model.Response;
import com.deped.model.supply.Supply;
import com.deped.repository.utils.Range;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.service.supply.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplyRestController extends AbstractMainRestController<Supply, Long> {

    private static final String BASE_NAME = "supply";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private SupplyService supplyService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public Supply create(@RequestBody Supply entity) {
        Supply supply = supplyService.create(entity);
        return supply;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(@RequestBody Supply entity) {
        Boolean isUpdated = supplyService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Supply.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public List<Supply> fetchAll() {
        return supplyService.fetchAll();
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<Supply> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return supplyService.fetchByRange(new Range(from, to));
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public Supply fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        return supplyService.fetchById(aLong);
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public Response remove(@RequestBody Supply... entities) {
        Boolean isRemoved = supplyService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Supply.class);
    }
}
