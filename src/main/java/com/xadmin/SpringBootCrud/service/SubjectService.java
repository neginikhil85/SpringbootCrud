package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepos;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects = new ArrayList<>();
		subjectRepos.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepos.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		subjectRepos.save(subject);
		
	}
	
	public void deleteSubject(String id) {
		subjectRepos.deleteById(id);
		
	}
}
