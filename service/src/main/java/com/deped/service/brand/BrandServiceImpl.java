package com.deped.service.brand;

import com.deped.model.items.Brand;
import com.deped.repository.brand.BrandRepository;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand entity) {
        return brandRepository.create(entity);
    }

    @Override
    public Boolean update(Brand entity) {
        return brandRepository.update(entity);
    }

    @Override
    public List<Brand> fetchAll() {
        return brandRepository.fetchAll();
    }

    @Override
    public List<Brand> fetchByRange(Range range) {
        return brandRepository.fetchByRange(range);
    }

    @Override
    public Brand fetchById(Object id) {
        return brandRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Brand... entities) {
        return brandRepository.remove(entities);
    }
}
