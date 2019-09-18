package com.vishal.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonResourceController {

	@RequestMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPerson() {
		return "Person Detail Page";
	}
}
