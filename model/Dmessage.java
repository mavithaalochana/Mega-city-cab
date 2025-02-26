package com.datapackage.model;

/**
 * Represents a driver message entity
 */
public class Dmessage {
    private String message;

    public Dmessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
