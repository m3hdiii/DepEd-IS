package com.thesis.service.data;

import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */

@Service(value = "ItemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> fetchItems() {
        List<Item> itemList = itemRepository.fetchItems();
        return itemList;
    }

    @Override
    public boolean addItem(Item item) {
        return false;
    }

    @Override
    public boolean editItem(Item item) {
        return false;
    }

    @Override
    public boolean deleteItem(Item item) {
        return false;
    }
}
