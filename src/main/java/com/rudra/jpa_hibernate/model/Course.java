package com.rudra.jpa_hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="author")
	private String author;
	
	
	
	public Course() {
		super();
	}
	
	public Course(long i, String name, String author) {
		super();
		this.id = i;
		this.name = name;
		this.author = author;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Course id="+id.toString()+", name="+name+", Author ="+author+"]";
	}
	
	
}
