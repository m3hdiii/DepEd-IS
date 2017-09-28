package com.thesis.service.category;

import com.thesis.model.items.Category;
import com.thesis.repository.category.CategoryRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category create(Category entity) {
        return categoryRepository.create(entity);
    }

    @Override
    public Boolean update(Category entity) {
        return categoryRepository.update(entity);
    }

    @Override
    public List<Category> fetchAll() {
        return categoryRepository.fetchAll();
    }

    @Override
    public List<Category> fetchByRange(Range range) {
        return categoryRepository.fetchByRange(range);
    }

    @Override
    public Category fetchById(Object id) {
        return categoryRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Category... entities) {
        return categoryRepository.remove(entities);
    }
}
