package com.rudra.jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rudra.jpa_hibernate.jpa.CourseRepository;
import com.rudra.jpa_hibernate.model.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseRepository rpc;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1, "Learn AWS now", "Vipan Kumar"));
		repository.insert(new Course(2, "Learn Azure now", "Vipan Kumar"));
		repository.insert(new Course(3, "Learn Java now", "Vipan Kumar"));
		repository.insert(new Course(4, "Learn PHP	 now", "Vipan Kumar"));
		
		repository.delete(1);
		
		System.out.println(repository.findById(2));
		
		
		rpc.insert(new Course(11, "Learn JPA", "RudraComputer"));
		rpc.insert(new Course(12, "Learn JPA1", "RudraComputer"));
		rpc.insert(new Course(13, "Learn JPA2", "RudraComputer"));
		
	}	

}
