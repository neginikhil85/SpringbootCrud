package com.xadmin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.entity.Course;

public interface CourseRepo extends CrudRepository<Course, String> {

}
