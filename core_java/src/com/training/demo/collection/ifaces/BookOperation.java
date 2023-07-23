package com.training.demo.collection.ifaces;

import com.training.demo.collection.exceptions.ElementNotFoundException;

public interface BookOperation<T> extends CrudOperation<T> {

    public T changePrice(int id, double newPrice) throws ElementNotFoundException;

}
