package com.andrew.dao.impl;

import com.andrew.dao.CategoryDao;
import com.andrew.domain.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Repository("categoryDao")
public class CategoryDaoImpl extends HibernateDao<Category, Integer> implements CategoryDao {

    public CategoryDaoImpl() {

    }
    @Override
    public void add(Category category) {
        super.add(category);
    }

    @Override
    public boolean isExist(String name) {
        //change to hql
        CriteriaBuilder builder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Category> criteria = builder.createQuery(Category.class);
        Root<Category> root = criteria.from(Category.class);
        criteria.select(root);
        criteria.where(builder.equal( root.get("name"), name));
        return !currentSession().createQuery(criteria).setMaxResults(1).getResultList().isEmpty();
    }

    @Override
    public void removeCategory(Category category) {
        throw new UnsupportedOperationException();
    }

    public Category getByName(String name) {
        Session session = currentSession();
        Criteria categoryCriteria = session.createCriteria(Category.class);
        categoryCriteria.add(Restrictions.eq("name", name));
        Category category = (Category) categoryCriteria.uniqueResult();
        return category;
    }

}
