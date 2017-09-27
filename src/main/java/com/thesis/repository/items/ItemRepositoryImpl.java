package com.thesis.repository.items;

import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemRepositoryImpl implements ItemRepository {

    @Autowired
    private HibernateFacade hibernateFacade;
    private SessionFactory sessionFactory = hibernateFacade.getSessionFactory();

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
