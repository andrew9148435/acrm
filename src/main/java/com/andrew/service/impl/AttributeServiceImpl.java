package com.andrew.service.impl;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import com.andrew.service.AttributeService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("attributeService")
public class AttributeServiceImpl implements AttributeService {

    private SessionFactory sessionFactory;
    private AttributeDao attributeDao;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public void add(Attribute attribute) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isExist(String name) {
        return attributeDao.isExist(name);
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
