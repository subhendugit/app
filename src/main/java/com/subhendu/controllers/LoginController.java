package com.subhendu.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@GetMapping(path="/testMethod",produces="application/json")
	public String testGetMethod()
	{
		
		return "Coungratulations !! You have been successfully invoked.";
	}

}
