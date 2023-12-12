package com.AirAsia.demo.exception.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.AirAsia.demo.exception.StudentNotFoundExcep;
import com.AirAsia.demo.model.ErrorResponse;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(StudentNotFoundExcep.class)
	public ResponseEntity<ErrorResponse> handleStudentNotFound()
	{
		Date d=new Date();
	
		return new ResponseEntity<ErrorResponse> (new ErrorResponse(404,"Student not Found",d),HttpStatus.NOT_FOUND);
		
	}

}
