package com.datapackage.model;

public class AdminMessageModel {
	private String message;
	
	public AdminMessageModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
