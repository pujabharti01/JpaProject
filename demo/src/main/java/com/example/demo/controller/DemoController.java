package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoDto;
import com.example.demo.service.DemoService;


@RestController
@RequestMapping("/Controller")
public class DemoController {
	@Autowired
	private DemoService demoService;
	@RequestMapping(value ="/getName",method=RequestMethod.GET)
	public DemoDto getName() {
		DemoDto str = demoService.getName();
		return str;
	}
}
