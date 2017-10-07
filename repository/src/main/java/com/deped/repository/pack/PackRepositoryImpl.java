package com.deped.repository.pack;

import com.deped.model.items.Pack;
import com.deped.repository.utils.HibernateFacade;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.deped.repository.utils.ConstantValues.*;

import java.util.List;

import static com.deped.repository.utils.ConstantValues.PACK_TABLE;
import static com.deped.repository.utils.ConstantValues.PACK_TABLE_ID;
import static com.deped.repository.utils.ConstantValues.FETCH_ALL_PACKS;

@Repository
public class PackRepositoryImpl implements PackRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public Pack create(Pack entity) {
        return hibernateFacade.saveEntity(Pack.class, entity);
    }

    @Override
    public Boolean update(Pack entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<Pack> fetchAll() {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_PACKS, Pack.class);
    }

    @Override
    public List<Pack> fetchByRange(Range range) {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_PACKS, range, Pack.class);
    }

    @Override
    public Pack fetchById(Object id) {
        return hibernateFacade.fetchEntityById(Pack.class, id);
    }

    @Override
    public Boolean remove(Pack... entities) {
        return hibernateFacade.removeEntities(PACK_TABLE, PACK_TABLE_ID, entities);
    }
}
