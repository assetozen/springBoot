package com.assegd;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Simple POJO class which creates our object
 * @XmlRootElement:- is used when we want to return XML file 
 * 
 * @author a.asfaw
 *
 */
@XmlRootElement
@Entity  // object class should be mentioned as an Entity when implementing Hibernate concept(in general JPA)
public class Alien 
{
	@Id
	private int id;
	private String name;
	private int points;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	@Override
	public String toString() {
		return "Alien [getId()=" + getId() + ", getName()=" + getName() + ", getPoints()=" + getPoints() + "]";
	}
	
}
