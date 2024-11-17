package com.rudra.jpa_hibernate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("/jpa-hibernate")
public class IndexController {

	@RequestMapping("/")
	public List<String> IndexAction(){
		return Arrays.asList("vipan", "kumar");
	}
}
