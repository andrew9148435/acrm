package com.andrew;

import com.andrew.dao.AttributeDao;
import com.andrew.dao.CategoryDao;
import com.andrew.domain.Category;
import com.andrew.service.AttributeService;
import com.andrew.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test")
public class Main {

    @Autowired
    public AttributeService attributeService;

    @Autowired
    public AttributeDao attributeDao;

    @Autowired
    public CategoryService categoryService;

    @Autowired
    public CategoryDao categoryDao;

    public void perform() {

        Category category = new Category();
        category.setName("cat");

        System.out.println(categoryDao.ifExist("catz"));




    }

}
