package com.assegd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactUsController 
{
	@RequestMapping("contactus")
	public String contatUs()
	{
		return("contactus");  
	}
}
