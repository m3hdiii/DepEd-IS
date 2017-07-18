package com.thesis.service;

import com.thesis.model.Item;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */
public interface ItemService {

    List<Item> fetchItems();
    boolean addItem(Item item);
    boolean editItem(Item item);
    boolean deleteItem(Item item);

}
