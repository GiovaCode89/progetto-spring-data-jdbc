package org.example.progettospringdata.db.dao;

import java.util.List;

public interface GeneralDao <T>{
    public void add(T object);
    public void update(T object);
    public void deleteForId(int id);
    public T selectById(int id);
    public List<T> retrieveAll();
}
