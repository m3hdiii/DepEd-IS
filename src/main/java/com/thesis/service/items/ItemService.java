package com.thesis.service.items;

import com.thesis.model.items.semigoods.Item;

import java.util.List;

public interface ItemService {

    Boolean createItem(Item item);

    Boolean updateItem(Item item);

    List<Item> fetchAllItems();

    List<Item> fetchItem(int from, int to);

}
