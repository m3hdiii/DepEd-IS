package com.thesis.service.items;

import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.items.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Boolean createItem(Item item) {
        return null;
    }

    @Override
    public Boolean updateItem(Item item) {
        return null;
    }

    @Override
    public List<Item> fetchAllItems() {
        return null;
    }

    @Override
    public List<Item> fetchItem(int from, int to) {
        return null;
    }
}
