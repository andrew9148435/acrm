package com.andrew.service;

import com.andrew.domain.Category;

public interface CategoryService {

    Category getByName(String name);

    void add(Category category);

}
