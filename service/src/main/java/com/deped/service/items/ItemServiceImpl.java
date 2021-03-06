package com.deped.service.items;

import com.deped.model.Operation;
import com.deped.model.Response;
import com.deped.model.items.semigoods.Item;
import com.deped.repository.items.ItemRepository;
import com.deped.repository.utils.Range;
import com.deped.service.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ResponseEntity<Item> create(Item entity) {
        Item savedEntity = itemRepository.create(entity);
        ResponseEntity<Item> responseEntity = new ResponseEntity<>(savedEntity, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> update(Item entity) {
        Boolean isUpdated = itemRepository.update(entity);
        Response response = ServiceUtils.makeResponse(isUpdated, Operation.UPDATE, Item.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Item>> fetchAll() {
        List<Item> items = itemRepository.fetchAll();
        ResponseEntity<List<Item>> responseEntity = new ResponseEntity<>(items, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Item>> fetchByRange(Range range) {
        List<Item> items = itemRepository.fetchByRange(range);
        ResponseEntity<List<Item>> responseEntity = new ResponseEntity<>(items, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Item> fetchById(Object id) {
        Item item = itemRepository.fetchById(id);
        ResponseEntity<Item> responseEntity = new ResponseEntity<>(item, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> remove(Item... entities) {
        Boolean isRemoved = itemRepository.remove(entities);
        Response response = ServiceUtils.makeResponse(isRemoved, Operation.DELETE, Item.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Item>> fetchAllGoods() {
        List<Item> items = itemRepository.fetchAllGoods();
        ResponseEntity<List<Item>> responseEntity = new ResponseEntity<>(items, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Item>> fetchAllSemiExpendable() {
        List<Item> items = itemRepository.fetchAllSemiExpendable();
        ResponseEntity<List<Item>> responseEntity = new ResponseEntity<>(items, OK);
        return responseEntity;
    }
}
