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
    public void add(String name) {
        if (categoryDao.isExist(name)) return;
        Category category = new Category();
        category.setName(name);
        categoryDao.add(category);
    }

    @Override
    public Category getByName(String name) {
        return categoryDao.getByName(name);
    }

    @Override
    public void rename(Category category, String name) {
        if (name == null || name.isEmpty() || category.getName().equals(name)) return;
        if (!categoryDao.isExist(name)) {
            category.setName(name);
            categoryDao.update(category);
        }
    }

    @Override
    public boolean isExist(String name) {
        return categoryDao.isExist(name);
    }

    public void remove(Category category) {
        throw new UnsupportedOperationException();
    }

}
