package com.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DockerController {
	
	@RequestMapping("/docker")
	public String dockerTest()
	{
		return "Hello Ramesh ! Springboot on Docker !!";
	}

}
