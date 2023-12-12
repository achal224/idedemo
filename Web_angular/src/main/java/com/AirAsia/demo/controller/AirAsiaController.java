package com.AirAsia.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.AirAsia.demo.ServiceInt.AirServiceInt;
import com.AirAsia.demo.model.Student;

@CrossOrigin("*")
@RestController
public class AirAsiaController {

	@Autowired
	AirServiceInt asi;
	
	@PostMapping(value = "/savedata")
	public String saveEmp(@RequestBody Student a)
	{
		asi.saveStudent(a);
		return "dada saved";
	}
	
	@RequestMapping("/getalldat")
	public Iterable getAlldata()
	{
		Iterable list=asi.displayAllData();
		return list;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStu(@PathVariable("id") int id)
	{
		asi.deleteEmp(id);
	}
	
//	@RequestMapping(value = "/edit/{id}/")
//	public Student edit(@PathVariable("id") int id)
//	{
//		Student stu =asi.editStu(id);
//		return stu;
//	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student> update(@PathVariable ("id") int id, @RequestBody Student s)
	{
	    Student stu= asi.updatestu(id,s);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
	}
}
