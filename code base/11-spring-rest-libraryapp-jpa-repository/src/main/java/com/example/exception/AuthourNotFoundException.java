package com.example.exception;

public class AuthourNotFoundException  extends RuntimeException{

	public AuthourNotFoundException(String msg) {
		super(msg);
	}
}
