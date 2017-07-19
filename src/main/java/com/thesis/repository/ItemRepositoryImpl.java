package com.thesis.repository;

import com.thesis.model.Item;
import com.thesis.model.ItemType;
import com.thesis.model.Visibility;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */

class SaveItem{

    public static List<Item> getItemList(){
        return new ArrayList<Item>(){{
            add(new Item(1L, "book", "book 1", ItemType.SEMI_EXPENDABLE, Visibility.EVERYONE, 10, 200, null));
            add(new Item(2L, "book1", "book 2", ItemType.SEMI_EXPENDABLE, Visibility.EVERYONE, 10, 100, null));
            add(new Item(3L, "book2", "book 3", ItemType.SEMI_EXPENDABLE, Visibility.EVERYONE, 10, 50, null));
            add(new Item(4L, "book3", "book 4", ItemType.SEMI_EXPENDABLE, Visibility.EVERYONE, 10, 30, null));
            add(new Item(5L, "book4", "book 5", ItemType.SEMI_EXPENDABLE, Visibility.EVERYONE, 10, 20, null));
        }};
    }
}


@Repository
public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public List<Item> fetchItems() {
        return SaveItem.getItemList();
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
