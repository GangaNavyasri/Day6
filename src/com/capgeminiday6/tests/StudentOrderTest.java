package com.capgeminiday6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgeminiday6.Student;


class StudentOrderTest {

	@Test
	void testStudentOrder() {
		TreeSet<Student> student=new TreeSet<Student>();
		
		student.add(new Student("Akhi",12,"cse"));
		student.add(new Student("Navya",24,"IT"));
		student.add(new Student("Surya",21,"cse"));
		student.add(new Student("Bindu",10,"cse"));

        assertEquals(4, student.size());
		for(Student s:student) {
			System.out.println(s);
		}

	
	}

}
