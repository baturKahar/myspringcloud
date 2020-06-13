package com.batur.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batur.entity.Student;
import com.batur.feign.FeignProviderClient;

@RestController
@RequestMapping("/feign")
public class FeignHandler {

	@Autowired
	private FeignProviderClient feignProviderClient;
	
	@GetMapping("/findAll")
	public Collection<Student> findAll(){
		return feignProviderClient.findAll();
	}
	
	@GetMapping("/index")
	public String index() {
		return feignProviderClient.index();
	}
}
