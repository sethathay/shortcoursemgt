package com.ckcc.shortcourse.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ckcc.shortcourse.models.Student;
import com.ckcc.shortcourse.services.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService stuSV;
	
	@RequestMapping("/student/new")
	public String newStudent(HttpServletRequest req){
		req.setAttribute("mode", "NEW");
		return "studentList";
	}
	
	@RequestMapping("/student/list")
	public String listStudent(HttpServletRequest request){
		request.setAttribute("stuList", stuSV.list());
		request.setAttribute("mode", "VIEW");
		return "studentList";
	}
	@PostMapping("/student/savestudent")
	public String save(@ModelAttribute Student studData, HttpServletRequest request){
		//Saving student data which is input in form (JSP)
		stuSV.save(studData);
		request.setAttribute("stuList", stuSV.list());
		request.setAttribute("mode", "VIEW");
		return "studentList";
	}
	
	@GetMapping("/student/delete")
	public void deleteStudent(@RequestParam int deleteID, HttpServletRequest request, HttpServletResponse resp) throws IOException{
		stuSV.deleteStu(deleteID);
		resp.sendRedirect("/student/list");
	}

}
