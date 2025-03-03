package com.example.advice;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exception.AuthourNotFoundException;
import com.example.exception.BookNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(exception = 
		{ BookNotFoundException.class,AuthourNotFoundException.class})
	public ResponseEntity<String> handle(Exception e) {
		System.out.println("Exception handled...");
		return  new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler (exception = MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidation(MethodArgumentNotValidException e){
		System.out.println(e.getMessage());
		Map<String, String> map=new HashMap<>();
		
		e.getFieldErrors().forEach(f-> map.put(f.getField(), f.getDefaultMessage()));
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
}
