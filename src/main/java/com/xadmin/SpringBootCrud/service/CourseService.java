package com.xadmin.SpringBootCrud.service;

import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.entity.Course;
import com.xadmin.SpringBootCrud.repository.CourseRepo;

@Service
public class CourseService {
	
	private final CourseRepo courseRepo;

	public CourseService(CourseRepo courseRepo) {
		this.courseRepo = courseRepo;
	}
	
	public void addCourse(Course course) {
		courseRepo.save(course);
	}
	
	public Course getCourse(String id) {
		return courseRepo.findById(id).get();
	}
	
	public void putCourse(Course course, String id) {
		courseRepo.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
	}
	
}
