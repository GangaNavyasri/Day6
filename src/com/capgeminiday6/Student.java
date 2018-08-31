package com.capgeminiday6;

public class Student implements Comparable<Student>{
	String Name;
	int rollno;
	String Branch;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollno, String branch) {
		super();
		Name = name;
		this.rollno = rollno;
		Branch = branch;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollno=" + rollno + ", Branch=" + Branch + "]";
	}
	@Override
	public int compareTo(Student s2) {

		int result=this.Name.compareTo(s2.Name);
//		if(result==0)
//			return this.Branch.compareTo(s2.Branch);
		return result;
	}

	
	
	
}


	