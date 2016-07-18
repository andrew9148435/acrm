package com.andrew;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import com.andrew.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("qq")
public class Main {

    @Autowired
    public AttributeService attributeService;

    @Autowired
    public AttributeDao attributeDao;

    public void perform() {


//        ApplicationContext context = new AnnotationConfigApplicationContext(PersistenceConfig.class);
//        AttributeService attributeService = context.getBean(AttributeService.class);



        Attribute attribute = new Attribute();
        attribute.setName("attr");


        attributeDao.add(attribute);

        System.out.println(attributeDao);


//        AttributeServiceImpl attributeServiceImpl = new AttributeServiceImpl();
//        attributeService.add(attribute);


    }

}
