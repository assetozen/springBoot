package com.assegd.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assegd.demo.dao.AlienRepo;
import com.assegd.demo.model.Alien;

@RestController
public class AlienController {
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@PostMapping("/alien")
	public Alien addAlien(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

	@GetMapping(path="/aliens")
	public List<Alien> getAlien() {
		return repo.findAll();
	}
	
	
	@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	@PutMapping("/alien")
	public Alien updateAlien(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid)
	{
		// Option1: if you want to retrieve the object of given id and delete the object itself
		Alien a = repo.getOne(aid);
		repo.delete(a);
		
		// Option2: if you want to delete by using the default method
		//repo.deleteById(aid);	
		return "Deleted";
	}
}


