package com.BikkadIT.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Student;

@RestController
public class StudentController {

	@PostMapping (value="/add",consumes="application/json")
	public ResponseEntity<String> addStudent(@RequestBody Student student){
		
		if(student !=null) {
			return new ResponseEntity<String>("Student saved",HttpStatus.OK);
		}
		
		
		return new ResponseEntity<String>("Student not saved",HttpStatus.BAD_REQUEST);
		
		
	}
}
