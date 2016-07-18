package com.andrew.dao;

import com.andrew.domain.Category;

public interface CategoryDao extends GenericDao<Category, Integer> {

    boolean removeCategory(Category category);

}
