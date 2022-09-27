package com.sopra.Homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employee
{
		@RequestMapping(value= "/jyoti")
		public String home()
		{
			return "home";
		}

}
