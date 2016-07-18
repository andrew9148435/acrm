package com.andrew.service.impl;

import com.andrew.dao.CategoryDao;
import com.andrew.domain.Category;
import com.andrew.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void add(Category category) {
        categoryDao.update(category);
    }

    public Category getByName(String name) {
        return categoryDao.getByName(name);
    }

    public void remove(Category category) {
        categoryDao.update(category);
    }
}
