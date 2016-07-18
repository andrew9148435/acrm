package com.andrew.dao;

import com.andrew.domain.Category;

public interface CategoryDao extends GenericDao<Category, Integer> {

    Category getByName(String name);

    boolean isExist(String name);

    boolean removeCategory(Category category);

}
