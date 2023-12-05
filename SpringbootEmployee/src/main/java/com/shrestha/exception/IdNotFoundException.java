package com.shrestha.exception;

public class IdNotFoundException extends RuntimeException {

    public IdNotFoundException(int id) {

        super(String.format("%d not found", id));
    }
}
