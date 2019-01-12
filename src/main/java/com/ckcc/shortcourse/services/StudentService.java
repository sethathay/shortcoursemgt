package com.ckcc.shortcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckcc.shortcourse.models.Student;
import com.ckcc.shortcourse.repositories.StudentInterface;

@Service
public class StudentService {

	@Autowired
	private StudentInterface stuINF;
	
	public void save(Student stuData){
		stuINF.save(stuData);
	}
	
	public Iterable<Student> list(){
		return stuINF.findAll();
	}
	
	public void deleteStu(int stuID){
		stuINF.deleteById(stuID);;
	}
	
}
