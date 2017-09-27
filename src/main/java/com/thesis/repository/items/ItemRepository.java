package com.thesis.repository.items;

import com.thesis.model.items.semigoods.Item;

import java.util.List;

public interface ItemRepository {

    Boolean createItem(Item item);

    Boolean updateItem(Item item);

    List<Item> fetchAllItems();

    List<Item> fetchItem(int from, int to);
}
