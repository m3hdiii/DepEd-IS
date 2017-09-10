package com.thesis.repository;

import com.thesis.model.items.semigoods.Item;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */
public interface ItemRepository {
    List<Item> fetchItems();
    boolean addItem(Item item);
    boolean editItem(Item item);
    boolean deleteItem(Item item);
}
