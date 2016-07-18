package com.andrew.service;

import com.andrew.domain.Category;

public interface CategoryService {

    Category getByName(String name);
    void rename(Category category);
    void add(Category category);
    void remove(Category category);

}
