package com.vivek.springbatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobLauncherRestController {
	
	@GetMapping("/launch")
	public String getJobOutput() {
		return "Hi Spring";
	}

}
