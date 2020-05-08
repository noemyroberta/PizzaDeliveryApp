package com.pizzadeliveryapp.dao;

import java.util.List;

public interface BasicDAO {

    public void add(Object bean);
    public void update(Object bean);
    public void delete(int id);
    public Object getById(int id);
    public List<Object> getAll();

}
