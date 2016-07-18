package com.andrew.service;

import com.andrew.domain.Category;

public interface CategoryService {



    Category getByName(String name);

    void add(String name);

    void rename(Category category, String name);

    boolean isExist(String name);

    void remove(Category category);

}
