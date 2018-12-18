package com.assegd;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // use this to tell that this class is a controller/resource class
public class AlienResource 
{
	@Autowired  //just create the object and it will take care of the rest(eg. no need to say new . . )
	AlienRepository  repo;
	
	@RequestMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>) repo.findAll();
		
		
		
		return aliens;
	}
}
