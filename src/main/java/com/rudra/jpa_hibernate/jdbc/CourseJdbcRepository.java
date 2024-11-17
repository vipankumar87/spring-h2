package com.rudra.jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rudra.jpa_hibernate.model.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			""" 
			insert into course(id, name, author) 
				values(?, ?, ?)
			""";
	
	private static String DELETE_QUERY = 
			""" 
			delete from course where id=?
			""";
	
	private static String SELECT_QUERY_ID = 
			""" 
			select * from course where id=?
			""";
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, 
				course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(int i) {
		springJdbcTemplate.update(DELETE_QUERY, i);
	}
	
	public Course findById(int i) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY_ID, new BeanPropertyRowMapper<>(Course.class), i);
	}
}
