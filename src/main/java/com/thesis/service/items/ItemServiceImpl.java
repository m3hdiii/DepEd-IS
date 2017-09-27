package com.thesis.service.items;

import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.items.ItemRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item create(Item entity) {
        return itemRepository.create(entity);
    }

    @Override
    public Boolean update(Item entity) {
        return itemRepository.update(entity);
    }

    @Override
    public List<Item> fetchAll() {
        return itemRepository.fetchAll();
    }

    @Override
    public List<Item> fetchByRange(Range range) {
        return itemRepository.fetchByRange(range);
    }

    @Override
    public Item fetchById(Object id) {
        return itemRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Item... entities) {
        return itemRepository.remove(entities);
    }
}
