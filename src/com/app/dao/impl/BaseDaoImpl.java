package com.app.dao.impl;

import com.app.SpringAnnotationDef;
import com.app.dao.BaseDao;
import com.app.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: mosg
 * Date: 12-3-3
 * Time: 下午5:07
 * To change this template use File | Settings | File Templates.
 */
@Scope(SpringAnnotationDef.SCOPE_PROTOTYPE)
@Transactional
public  class BaseDaoImpl<T extends Serializable,ID extends Serializable> implements BaseDao<T,ID> {


    protected Class<T> entity;

    @Resource(name="sessionFactory")
    private SessionFactory sessionFactory;

    public BaseDaoImpl(Class<T> entityClass){
        this.entity = entityClass;
    }

    @Override
    public T save(T model) {
        return (T)getSession().save(model);
    }

    @Override
    public void saveOrUpdate(T model) {
        getSession().saveOrUpdate(model);
    }

    @Override
    public void update(T model) {
        getSession().update(model);
    }

    @Override
    public void merge(T model) {
        getSession().merge(model);
    }

    @Override
    public void delete(ID id) {
        getSession().delete(this.get(id));
    }

    @Override
    public void deleteObject(T model) {
        getSession().delete(model);
    }

    @Override
    public T get(ID id) {
        return (T)getSession().get(this.entity,id);
    }

    @Override
    public int countAll() {


        return  0;
    }

    @Override
    public List<T> listAll() {
        return (List<T>)getSession().createCriteria(this.entity).list();
    }

    @Override
    public List<T> listAll(int pageNum, int pageSize) {
        Criteria criteria = getSession().createCriteria(this.entity);
        criteria.setFirstResult( (pageNum-1) * pageSize + 1 );
        criteria.setMaxResults( pageSize );
        return (List<T>)criteria.list();//(List<T>)getSession().createCriteria(this.entity).setFirstResult().list();
    }

    @Override
    public List<T> pre(ID id, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public List<T> next(ID id, int pageNum, int pageSize) {
        return null;
    }

    @Override
    public boolean exists(ID id) {
        return get(id)!=null;
    }

    @Override
    public void flush() {
        getSession().flush();
    }

    @Override
    public void clear() {
        getSession().clear();
    }


    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
