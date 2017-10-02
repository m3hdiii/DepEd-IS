package com.deped.restcontroller.requests;

import com.deped.model.Response;
import com.deped.model.request.BorrowRequest;
import com.deped.restcontroller.AbstractMainRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BorrowEquipmentRestController extends AbstractMainRestController<BorrowRequest, Long> {

    private static final String BASE_NAME = "borrow-request";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public BorrowRequest create(@RequestBody BorrowRequest entity) {
        return null;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(@RequestBody BorrowRequest entity) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public List<BorrowRequest> fetchAll() {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<BorrowRequest> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        return null;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING)
    public BorrowRequest fetchById(Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public Response remove(@RequestBody BorrowRequest... entities) {
        return null;
    }
}
