package com.andrew.service;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Transactional(propagation= Propagation.REQUIRED, readOnly=false)
@Service("attributeService")
public class AttributeServiceImpl implements AttributeService {

//    @Autowired
    private SessionFactory sessionFactory;
//    @Autowired
    private AttributeDao attributeDao;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Override
    public void add(Attribute attribute) {
//        System.out.println("azzzz");
//        System.out.println(attributeDao.toString());
        attributeDao.add(attribute);
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
