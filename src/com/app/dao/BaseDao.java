package com.app.dao;

import java.util.List;

public interface BaseDao<T,ID> {
    
    public T save(T model);

    public void saveOrUpdate(T model);
    
    public void update(T model);
    
    public void merge(T model);

    public void delete(ID id);

    public void deleteObject(T model);

    public T get(ID id);
    
    public int countAll();

    public List<T> listAll();

    public List<T> listAll(int pageNum, int pageSize);
    
    public List<T> pre(ID id, int pageNum, int pageSize);
    public List<T> next(ID id, int pageNum, int pageSize);
    
    boolean exists(ID id);
    
    public void flush();
    
    public void clear();

}
