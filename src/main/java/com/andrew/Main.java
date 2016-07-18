package com.andrew;

import com.andrew.dao.AttributeDao;
import com.andrew.dao.CategoryDao;
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


        categoryService.add("cat");





    }

}
