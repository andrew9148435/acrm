package com.andrew;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import com.andrew.domain.Category;
import com.andrew.service.AttributeService;
import com.andrew.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("qq")
public class Main {

    @Autowired
    public AttributeService attributeService;

    @Autowired
    public AttributeDao attributeDao;

    @Autowired
    public CategoryService categoryService;

    public void perform() {


//        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
//        AttributeService attributeService = context.getBean(AttributeService.class);



        Attribute attribute = new Attribute();
        attribute.setName("attr");

        Category category = new Category();
//        category.setName("cat");
//        categoryService.add(category);

        System.out.println(categoryService.getByName("cat").getName());


//        AttributeServiceImpl attributeServiceImpl = new AttributeServiceImpl();
//        attributeService.add(attribute);


    }

}
