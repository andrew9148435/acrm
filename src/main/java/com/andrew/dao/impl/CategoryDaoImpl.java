package com.andrew.dao.impl;

import com.andrew.dao.CategoryDao;
import com.andrew.domain.Category;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao")
public class CategoryDaoImpl extends HibernateDao<Category, Integer> implements CategoryDao {

    public CategoryDaoImpl() {

    }

    @Override
    public boolean removeCategory(Category category) {
        return false;
    }

    @Override
    public Category find(Integer key) {
        return null;
    }

    @Override
    public List<Category> list() {
        return null;
    }

    public Category getByName(String name) {
        Session session = currentSession();
        Criteria categoryCriteria = session.createCriteria(Category.class);
        categoryCriteria.add(Restrictions.eq("name", name));
        Category category = (Category) categoryCriteria.uniqueResult();
        return category;
    }

}
