package com.exception;

public class InvalidEntityException extends RuntimeException {

    public InvalidEntityException(String msg) {
        super(msg);
    }
}