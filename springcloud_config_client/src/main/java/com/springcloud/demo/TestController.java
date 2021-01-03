package com.springcloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${test.message}")
	private String test;

	@RequestMapping(value = "/test")
	public String getUserInfo() {
		return "test:" + test;
	}
}