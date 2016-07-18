package com.andrew.service.impl;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceIApiImpl {

    private SessionFactory sessionFactory;
    private AttributeDao attributeDao;

    public void add(Attribute attribute) {
//        System.out.println("azzzz");
//        System.out.println(attributeDao.toString());
        attributeDao.add(attribute);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public AttributeDao getAttributeDao() {
        return attributeDao;
    }

    public void setAttributeDao(AttributeDao attributeDao) {
        this.attributeDao = attributeDao;
    }

}
