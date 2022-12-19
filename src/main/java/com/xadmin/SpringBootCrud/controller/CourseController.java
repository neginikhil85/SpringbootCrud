package com.xadmin.SpringBootCrud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.entity.Course;
import com.xadmin.SpringBootCrud.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	private final CourseService courseService;
	
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}
	
	@PostMapping
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@GetMapping("/{id}")
	public Course getCourse(@PathVariable("id") String id) {
		return courseService.getCourse(id);
	
	}
	
	@PutMapping("/{id}")
	public void putCourse(@RequestBody Course course,@PathVariable("id") String id) {
		courseService.putCourse(course, id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCourse(@PathVariable("id") String id) {
		courseService.deleteCourse(id);
	}
}
