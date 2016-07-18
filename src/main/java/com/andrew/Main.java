package com.andrew;

import com.andrew.dao.AttributeDao;
import com.andrew.dao.CategoryDao;
import com.andrew.domain.Attribute;
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



        Attribute attribute = new Attribute();
        attribute.setName("attr");

        Category category = new Category();
//        category.setName("cat");
//        categoryService.add(category);
//
        System.out.println(categoryService.getByName("cat").getName());

//        System.out.println(categoryDao.list().get(0));


    }

}
