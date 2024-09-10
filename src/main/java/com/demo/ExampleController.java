package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class ExampleController {

	@RequestMapping("/")
	public String getExampleTest() {
		return "index";
	}
}
