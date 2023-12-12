package com.AirAsia.demo.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AirAsia.demo.ServiceInt.AirServiceInt;
import com.AirAsia.demo.exception.StudentNotFoundExcep;
import com.AirAsia.demo.model.Student;
import com.AirAsia.demo.repo.HomeRepo;


@Service
public class AirServiceImp implements AirServiceInt {

	@Autowired
	HomeRepo hr;

	@Override
	public void saveStudent(Student a) {
		hr.save(a);	
	}

	@Override
	public Iterable displayAllData() {
		return (List<Student>) hr.findAll();
	}

	@Override
	public List<Student> deleteEmp(int id) {
		hr.deleteById(id);
		return (List<Student>) hr.findAll();
	}

	@Override
	public Student updatestu(int id, Student s) {
		Optional<Student> opstu=hr.findById(id);
		if(opstu.isPresent())
		{
			return hr.save(s);
		}
		else
		{
			throw new StudentNotFoundExcep("Student Detail you are serching is not present");
		}
		}

	
}
