package com.practice.exception.controlleradvice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import com.practice.exception.PracticeUnCheckedException;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(PracticeUnCheckedException.class)
	public ResponseEntity<ErrorResponse>getErrorResponseForUnchecked(PracticeUnCheckedException ex){
		
		ErrorResponse err = ErrorResponse.builder()
				.error(ex.getErrors())
				.message(ex.getMessage())
				//.errorcode(HttpStatusCode.valueOf(201))
				.service(PracticeUnCheckedException.class.getName())
				.build();
		 return ResponseEntity.badRequest().body(err);
		
	}

}
