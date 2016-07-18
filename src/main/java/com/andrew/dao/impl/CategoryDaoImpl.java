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
import java.util.List;

@Repository("categoryDao")
public class CategoryDaoImpl extends HibernateDao<Category, Integer> implements CategoryDao {

    public CategoryDaoImpl() {

    }

    @Override
    public boolean ifExist(String name) {
        //change to hql
        CriteriaBuilder builder = currentSession().getCriteriaBuilder();
        CriteriaQuery<Category> criteria = builder.createQuery(Category.class);
        Root<Category> root = criteria.from(Category.class);
        criteria.select(root);
        criteria.where(builder.equal( root.get("name"), name));
        return !currentSession().createQuery(criteria).setMaxResults(1).getResultList().isEmpty();
    }

    @Override
    public void add(Category category) {
        if (!ifExist(category.getName())) super.add(category);
    }

    @Override
    public void rename(Category category, String name) {
        if (!ifExist(name)) {
            category.setName(name);
            update(category);
        }
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
