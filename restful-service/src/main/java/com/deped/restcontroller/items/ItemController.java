package com.deped.restcontroller.items;

import com.deped.restcontroller.AbstractMainController;
import com.deped.restcontroller.Operation;
import com.deped.model.Response;
import com.deped.model.items.semigoods.Item;
import com.deped.repository.utils.Range;
import com.deped.service.items.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController extends AbstractMainController<Item, Long> {

    private static final String BASE_NAME = "item";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;
    private static final String SHOW_CREATE_MAPPING = CREATE_MAPPING;
    private static final String SHOW_LIST_MAPPING = BASE_NAME + SHOW_PREFIX;
    private static final String SHOW_UPDATE_MAPPING = UPDATE_MAPPING;

    private static final String SHOW_SEMI_EXPENDABLES = BASE_NAME + URL_SEPARATOR + "semi-expendable";
    private static final String SHOW_GOODS = BASE_NAME + URL_SEPARATOR + "goods";

    @Autowired
    private ItemService itemService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public Item create(Item entity) {
        Item savedItem = itemService.create(entity);
        return savedItem;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public Response update(Item entity) {
        Boolean isUpdated = itemService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Item.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public List<Item> fetchAll() {
        List<Item> items = itemService.fetchAll();
        return items;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public List<Item> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Item> items = itemService.fetchByRange(new Range(from, to));
        return items;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
    public Item fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Item item = itemService.fetchById(aLong);
        return item;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.GET)
    public Response remove(Item... entities) {
        Boolean isRemoved = itemService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Item.class);
    }

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING, method = RequestMethod.GET)
    public String showCreatePage(Item entity, Model model) {
        return "processing/register-item";
    }

    @Override
    @RequestMapping(value = SHOW_LIST_MAPPING, method = RequestMethod.GET)
    public String showListPage(Model model) {
        return "items/item-list";
    }

    @Override
    @RequestMapping(value = SHOW_UPDATE_MAPPING, method = RequestMethod.GET)
    public String showUpdatePage() {
        return "processing/register-item";
    }

    //Additional Methods

    @RequestMapping(value = SHOW_SEMI_EXPENDABLES, method = RequestMethod.GET)
    public String getSemiExpendables() {
        return "items/semi-expendable";
    }

    @RequestMapping(value = SHOW_GOODS, method = RequestMethod.GET)
    public String getGoods() {
        return "items/goods";
    }

}