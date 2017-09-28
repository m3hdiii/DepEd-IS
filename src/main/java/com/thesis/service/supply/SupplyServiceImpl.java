package com.thesis.service.supply;

import com.thesis.model.location.office.Section;
import com.thesis.model.supplys.Supply;
import com.thesis.repository.supply.SupplyRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyServiceImpl implements SupplyService{

    @Autowired
    private SupplyRepository supplyRepository;
    @Override
    public Supply create(Supply entity) {
        return supplyRepository.create(entity);
    }

    @Override
    public Boolean update(Supply entity) {
        return supplyRepository.update(entity);
    }

    @Override
    public List<Supply> fetchAll() {
        return supplyRepository.fetchAll();
    }

    @Override
    public List<Supply> fetchByRange(Range range) {
        return supplyRepository.fetchByRange(range);
    }

    @Override
    public Supply fetchById(Object id) {
        return fetchById(id);
    }

    @Override
    public Boolean remove(Supply... entities) {
        return supplyRepository.remove(entities);
    }
}
