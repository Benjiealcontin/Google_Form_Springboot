package com.googleform.FormService.Exception;

public class FormNotFoundException extends RuntimeException {

    public FormNotFoundException(String message) {
        super(message);
    }
}

