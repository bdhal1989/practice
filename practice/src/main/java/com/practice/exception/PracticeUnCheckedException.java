package com.practice.exception;

import java.util.Map;

public class PracticeUnCheckedException extends RuntimeException{
	
	private Map<String, String>errors;
	private String message;
	public PracticeUnCheckedException(String message, Map<String, String> of) {
		super(message);
		this.errors = of;
		this.message=message;
	}
	
	

	 public Map<String, String> getErrors() {
	        return errors;
	    }

}
