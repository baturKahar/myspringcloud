package com.batur.feign.impl;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.batur.entity.Student;
import com.batur.feign.FeignProviderClient;

@Component
public class FeignError implements FeignProviderClient {

	@Override
	public Collection<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String index() {
		// TODO Auto-generated method stub
		return "服务器维护中。。。。";
	}

	
}
