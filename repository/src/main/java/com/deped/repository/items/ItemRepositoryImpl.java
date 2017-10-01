package com.deped.repository.items;

import com.deped.model.items.semigoods.Item;
import com.deped.repository.utils.HibernateFacade;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.deped.repository.utils.ConstantValues.FETCH_ALL_ITEMS;
import static com.deped.repository.utils.ConstantValues.ITEM_TABLE;
import static com.deped.repository.utils.ConstantValues.ITEM_TABLE_ID;

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
        Boolean isItemDeleted = hibernateFacade.removeEntities(ITEM_TABLE, ITEM_TABLE_ID, entities);
        return isItemDeleted;
    }
}
