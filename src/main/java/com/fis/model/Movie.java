package com.fis.model;

import java.io.Serializable;
/*
 * Movie entity
 * 
 * Returns movie info
 * 
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
 * Movie info entity class
 */
@Entity
@Table(name="movie")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	int id;
	String name;
	String description;
	
	public Movie()
	{
		
	}
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
