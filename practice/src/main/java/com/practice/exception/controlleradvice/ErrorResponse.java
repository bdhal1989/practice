package com.practice.exception.controlleradvice;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ErrorResponse {
	
	private String message;
	private Map<String,String> error;
	private int errorcode;
	private String service;
	

}
