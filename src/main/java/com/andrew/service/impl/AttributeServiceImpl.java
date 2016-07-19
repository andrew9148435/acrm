package com.andrew.service.impl;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import com.andrew.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("attributeService")
public class AttributeServiceImpl implements AttributeService {

    private AttributeDao attributeDao;

    @Override
    public void add(String name) {
        System.out.println(attributeDao);
        if (attributeDao.isExist(name)) return;
        Attribute attribute = new Attribute();
        attribute.setName(name);
        attributeDao.add(attribute);
    }

    @Override
    public boolean isExist(String name) {
        return attributeDao.isExist(name);
    }

    @Override
    public void rename(Attribute attribute, String name) {
        if (name == null || name.isEmpty() || attribute.getName().equals(name)) return;
        if (!attributeDao.isExist(name)) {
            attribute.setName(name);
            attributeDao.update(attribute);
        }
    }

    public AttributeDao getAttributeDao() {
        return attributeDao;
    }

    @Autowired
    public void setAttributeDao(AttributeDao attributeDao) {
        this.attributeDao = attributeDao;
    }
}
