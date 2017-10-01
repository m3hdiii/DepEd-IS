package com.deped.service.pack;

import com.deped.model.items.Pack;
import com.deped.repository.pack.PackRepository;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackServiceImpl implements PackService {

    @Autowired
    private PackRepository packRepository;

    @Override
    public Pack create(Pack entity) {
        return packRepository.create(entity);
    }

    @Override
    public Boolean update(Pack entity) {
        return packRepository.update(entity);
    }

    @Override
    public List<Pack> fetchAll() {
        return packRepository.fetchAll();
    }

    @Override
    public List<Pack> fetchByRange(Range range) {
        return packRepository.fetchByRange(range);
    }

    @Override
    public Pack fetchById(Object id) {
        return packRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Pack... entities) {
        return packRepository.remove(entities);
    }
}
