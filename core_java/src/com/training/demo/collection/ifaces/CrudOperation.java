package com.training.demo.collection.ifaces;

import java.util.Collection;
import java.util.Optional;

import com.training.demo.collection.exceptions.ElementNotFoundException;

public interface CrudOperation<T> {

    public boolean add(T obj);
    public Optional<T> findById(int id) throws ElementNotFoundException;

    public Collection<T> findAll();

    public void deleteById(int id) throws ElementNotFoundException;



}
