package com.training.demo.collection.exceptions;

public class ElementNotFoundException extends Exception {

    private String message;

    public ElementNotFoundException(String message) {
        this.message=message;

    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
