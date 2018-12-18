package com.assegd.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assegd.demo.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> 
{

}
