package com.batur.repository.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.batur.entity.Student;
import com.batur.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
	
	private static Map<Long,Student> studentMap;
	
	static {
		studentMap = new HashMap<>();
		studentMap.put(1L, new Student(1L, "kahar", 55));
		studentMap.put(2L, new Student(2L, "juret", 34));
		studentMap.put(3L, new Student(3L, "kapr", 44));
	}

	@Override
	public Collection<Student> findAll() {
		// TODO Auto-generated method stub
		return studentMap.values();
	}

	@Override
	public Student findById(long id) {
		// TODO Auto-generated method stub
		return studentMap.get(id);
	}

	@Override
	public void saveOrUpdate(Student student) {
		// TODO Auto-generated method stub
		studentMap.put(student.getId(), student);
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		studentMap.remove(id);
	}

}
