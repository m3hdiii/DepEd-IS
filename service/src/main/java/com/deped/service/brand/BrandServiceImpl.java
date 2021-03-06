package com.deped.service.brand;

import com.deped.model.Operation;
import com.deped.model.Response;
import com.deped.model.items.Brand;
import com.deped.repository.brand.BrandRepository;
import com.deped.repository.utils.Range;
import com.deped.service.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {


    @Autowired
    private BrandRepository brandRepository;

    @Override
    public ResponseEntity<Brand> create(Brand entity) {
        Brand savedEntity = brandRepository.create(entity);
        ResponseEntity<Brand> responseEntity = new ResponseEntity<>(savedEntity, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> update(Brand entity) {
        Boolean isUpdated = brandRepository.update(entity);
        Response response = ServiceUtils.makeResponse(isUpdated, Operation.UPDATE, Brand.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Brand>> fetchAll() {
        List<Brand> brands = brandRepository.fetchAll();
        ResponseEntity<List<Brand>> responseEntity = new ResponseEntity<>(brands, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<Brand>> fetchByRange(Range range) {
        List<Brand> brands = brandRepository.fetchByRange(range);
        ResponseEntity<List<Brand>> responseEntity = new ResponseEntity<>(brands, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Brand> fetchById(Object id) {
        Brand brand = brandRepository.fetchById(id);
        ResponseEntity<Brand> responseEntity = new ResponseEntity<>(brand, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> remove(Brand... entities) {
        Boolean isRemoved = brandRepository.remove(entities);
        Response response = ServiceUtils.makeResponse(isRemoved, Operation.DELETE, Brand.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }
}
