package com.assegd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This Controller will trigger the contactus.jsp page when called on the browser with http://localhost:8080/contactus
 * @author a.asfaw
 *
 */
@Controller
public class ContactUsController 
{
	@RequestMapping("contactus")
	public String contatUs()
	{
		return("contactus");  
	}
}
