package com.andrew.dao.impl;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("attributeDao")
@Transactional(propagation= Propagation.REQUIRED, readOnly=false, value = "transactionManager")
public class AttributeDaoImpl extends HibernateDao<Attribute, Integer> implements AttributeDao {

    public AttributeDaoImpl() {

    }

    @Override
    public boolean removeAttribute(Attribute attribute) {
        return false;
    }

    @Override
    public Attribute find(Integer key) {
        return null;
    }

    @Override
    public List<Attribute> list() {
        return null;
    }
}
