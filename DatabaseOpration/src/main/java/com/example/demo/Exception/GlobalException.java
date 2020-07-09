package com.example.demo.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.Dto.Errordto;

import javassist.NotFoundException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> generateException(NotFoundException re) {
		Errordto dto = new Errordto();
		dto.setTime(new Date().toString());
		dto.setStatus("404");
		dto.setMassage(re.getMessage());
		return new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> generateException(RuntimeException re) {
		Errordto dto = new Errordto();
		dto.setTime(new Date().toString());
		dto.setStatus("900");
		dto.setMassage(re.getMessage());
		return new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
