package com.practice.exception.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practice.exception.service.ExceptionService;

import lombok.AllArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
public class ExceptionController {

	private ExceptionService exr;
	
	@GetMapping("/exception")
	public ResponseEntity<String> getException() {
		 String entity="bikash";
		exr.getExcetion(entity);
		return ResponseEntity.ok().body(entity);
	}
	
}
