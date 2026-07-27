package com.sist.commons;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CommonsException {
	@ExceptionHandler(Exception.class)
	public void exception(Exception ex) {
		System.out.println("====================예외발생(Exception)=======================");
		ex.printStackTrace();
	}
	@ExceptionHandler(Throwable.class)
	public void throwable(Throwable ex) {
		System.out.println("====================예외발생(Throwable)=======================");
		ex.printStackTrace();
	}
}
