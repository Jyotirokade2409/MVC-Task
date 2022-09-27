package com.sopra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class about 
{
	@RequestMapping(value ="/about")
	public String About() 
	{
		return "about";
	}
}
