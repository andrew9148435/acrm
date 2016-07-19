package com.andrew.dao.impl;

import com.andrew.dao.AttributeDao;
import com.andrew.domain.Attribute;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository("attributeDao")
//@Transactional(propagation= Propagation.REQUIRED, readOnly=false, value = "transactionManager")
public class AttributeDaoImpl extends HibernateDao<Attribute, Integer> implements AttributeDao {

    public AttributeDaoImpl() {

    }

    @Override
    public void add(Attribute attribute) {
        super.add(attribute);
    }

    @Override
    public boolean isExist(String name) {
        CriteriaBuilder builder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Attribute> criteria = builder.createQuery(Attribute.class);
        Root<Attribute> root = criteria.from(Attribute.class);
        criteria.select(root);
        criteria.where(builder.equal( root.get("name"), name));
        return !currentSession().createQuery(criteria).setMaxResults(1).getResultList().isEmpty();
    }

    @Override
    public boolean removeAttribute(Attribute attribute) {
        throw new UnsupportedOperationException();
    }

}
