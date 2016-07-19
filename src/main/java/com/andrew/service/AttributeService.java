package com.andrew.service;

import com.andrew.domain.Attribute;

public interface AttributeService {

    void add(String name);

    void rename(Attribute attribute, String name);

    boolean isExist(String name);
}
