package com.example.weatherapi.exception;

public class ServiceUnAvailableException extends RuntimeException {


    public ServiceUnAvailableException(String message) {
        super(message);
    }
}
