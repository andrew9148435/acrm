package com.andrew.service;

import com.andrew.domain.Attribute;

public interface AttributeService {

    void add(Attribute attribute);

    boolean isExist(String name);
}
