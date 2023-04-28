package com.hotel.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource not found");
    };

    public ResourceNotFoundException(String resourceNotFound) {
        super(resourceNotFound);
    }
}
