package com.example.Dao;

import com.example.entity.Student;

public interface IStudentDao {
	
	public void saveStudent(Student student);
	public Student getStudent(Long id) ;
}