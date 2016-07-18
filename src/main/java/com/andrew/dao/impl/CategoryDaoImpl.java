package com.andrew.dao.impl;

import com.andrew.dao.CategoryDao;
import com.andrew.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao")
public class CategoryDaoImpl extends HibernateDao<Category, Integer> implements CategoryDao {

    public CategoryDaoImpl() {

    }

    @Override
    public boolean removeCategory(Category category) {
        return false;
    }

    @Override
    public Category find(Integer key) {
        return null;
    }

    @Override
    public List<Category> list() {
        return null;
    }

}
