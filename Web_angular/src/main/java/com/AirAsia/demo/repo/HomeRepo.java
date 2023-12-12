package com.AirAsia.demo.repo;

import org.springframework.data.repository.CrudRepository;
import com.AirAsia.demo.model.Student;

public interface HomeRepo extends CrudRepository<Student, Integer> {

}
