package com.AirAsia.demo.ServiceInt;

import java.util.List;
import com.AirAsia.demo.model.Student;

public interface AirServiceInt {

	public void saveStudent(Student a);

	public Iterable displayAllData();

	public List<Student> deleteEmp(int id);

	public Student updatestu(int id, Student s);


}
