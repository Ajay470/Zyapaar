package com.zyapaar.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class globalExceptionHandler {
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> ExceptionHandler(Exception cm,WebRequest req){
		
		MyError er=new MyError();
		er.setDatetime(LocalDateTime.now());
		er.setMessage(cm.getMessage());
		er.setDescription(req.getDescription(false));

		return new ResponseEntity<MyError>(er,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(productException.class)
	public ResponseEntity<MyError> GlobalExceptionHandler(productException cm,WebRequest req){
		
		MyError er=new MyError();
		er.setDatetime(LocalDateTime.now());
		er.setMessage(cm.getMessage());
		er.setDescription(req.getDescription(false));

		return new ResponseEntity<MyError>(er,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError>ExceptionHandler(MethodArgumentNotValidException cm){
		
		MyError er=new MyError();
		er.setDatetime(LocalDateTime.now());
		er.setMessage("validation error");
		er.setDescription(cm.getBindingResult().getFieldError().getDefaultMessage());

		return new ResponseEntity<MyError>(er,HttpStatus.BAD_REQUEST);
	}

}
