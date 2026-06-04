package com.practice.exception;

import java.util.Map;

public class PracticeCheckedException extends Exception{
	
	private Map<String, String>errors;
	private String message;
	
	public PracticeCheckedException(String message, Map<String, String> of) {
		super(message);
		this.errors = of;
		this.message = message;
	}
	
	

	 public Map<String, String> getErrors() {
		 
	        return errors;
	    }

}
