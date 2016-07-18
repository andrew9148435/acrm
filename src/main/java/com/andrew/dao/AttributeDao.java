package com.andrew.dao;

import com.andrew.domain.Attribute;

public interface AttributeDao extends GenericDao<Attribute, Integer> {

    boolean removeAttribute(Attribute attribute);

}
