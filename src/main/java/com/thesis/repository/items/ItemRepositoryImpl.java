package com.thesis.repository.items;

import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.utils.HibernateFacade;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.thesis.repository.utils.ConstantValues.FETCH_ALL_ITEMS;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public Item create(Item entity) {
        Item savedItem = hibernateFacade.saveEntity(Item.class, entity);
        return savedItem;
    }

    @Override
    public Boolean update(Item entity) {
        Boolean isUpdated = hibernateFacade.updateEntity(entity);
        return isUpdated;
    }

    @Override
    public List<Item> fetchAll() {
        List<Item> items = hibernateFacade.fetchAllEntity(FETCH_ALL_ITEMS, Item.class);
        return items;
    }

    @Override
    public List<Item> fetchByRange(Range range) {
        List<Item> items = hibernateFacade.fetchAllEntity(FETCH_ALL_ITEMS, range, Item.class);
        return items;
    }

    @Override
    public Item fetchById(Object id) {
        Item item = hibernateFacade.fetchEntityById(Item.class, id);
        return item;
    }

    @Override
    public Boolean remove(Item... entities) {
        Boolean isItemDeleted = hibernateFacade.removeEntities("item", "item_id", entities);
        return isItemDeleted;
    }
}
