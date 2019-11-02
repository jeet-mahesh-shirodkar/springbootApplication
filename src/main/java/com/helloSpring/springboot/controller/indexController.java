package com.helloSpring.springboot.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController implements ErrorController{
 
	private static final String PATH ="/error";

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return PATH;
	}
	
	@RequestMapping(PATH)
	public String error() {
		return "no mapping avaiable";
	}
	
}
