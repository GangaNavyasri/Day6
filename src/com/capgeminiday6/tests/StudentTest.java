package com.capgeminiday6.tests;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.capgeminiday6.Student;

class StudentTest {

	@Test
	void testStudent() {
		LinkedList<Student> student=new LinkedList<>();
		
		student.add(new Student("Akhi",12,"cse"));
		student.add(new Student("Navya",24,"IT"));
		student.add(new Student("Surya",21,"cse"));

		for(Student s:student) {
			System.out.println(s);
		}
		
	}

}
