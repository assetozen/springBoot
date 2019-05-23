package com.assegd.exceptionHandler;

public class ConstraintViolationException extends RuntimeException {

    public ConstraintViolationException(){
    }
    public ConstraintViolationException(String message, Throwable cause) {
        super(message, cause);
    }
    // ...
}
