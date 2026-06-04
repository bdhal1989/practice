package com.practice.exception.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.practice.exception.PracticeUnCheckedException;

@Service
public class ExceptionService {
	
	public void getExcetion(String message) {
		
		System.out.println(message);
		throw new PracticeUnCheckedException(message,Map.of("ERROR","HELLOW ERROR"));
	}

}
