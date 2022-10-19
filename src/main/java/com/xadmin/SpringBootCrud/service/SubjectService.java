package com.xadmin.SpringBootCrud.service;

import org.springframework.stereotype.Service;
import com.xadmin.SpringBootCrud.entity.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {

	//	@Autowired
	private final SubjectRepository subjectRepos;
	
	public SubjectService(SubjectRepository subjectRepos) {
		this.subjectRepos = subjectRepos;
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

	public Subject getSubject(String id) {
		return subjectRepos.findById(id).get();
	}

	
}
