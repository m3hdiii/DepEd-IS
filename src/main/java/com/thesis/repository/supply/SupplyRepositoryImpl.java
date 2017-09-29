package com.thesis.repository.supply;

import com.thesis.model.supplys.Supply;
import com.thesis.repository.utils.HibernateFacade;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SupplyRepositoryImpl implements SupplyRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public Supply create(Supply entity) {
        return hibernateFacade.saveEntity(Supply.class, entity);
    }

    @Override
    public Boolean update(Supply entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<Supply> fetchAll() {
        return hibernateFacade.fetchAllEntity("", Supply.class);
    }

    @Override
    public List<Supply> fetchByRange(Range range) {
        return hibernateFacade.fetchAllEntity("", range, Supply.class);
    }

    @Override
    public Supply fetchById(Object id) {
        return hibernateFacade.fetchEntityById(Supply.class, id);
    }

    @Override
    public Boolean remove(Supply... entities) {
        return hibernateFacade.removeEntities("supply", "supply_id", entities);
    }
}
