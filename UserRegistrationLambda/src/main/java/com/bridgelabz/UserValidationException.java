package com.bridgelabz;

public class UserValidationException extends Exception {
	String message;

	public UserValidationException(String message) {
		this.message = message;
	}
}