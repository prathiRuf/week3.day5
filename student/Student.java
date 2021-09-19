package org.student;
//week3.day5 Assignment OOPs concept- Assignment2-OOPs concept-multilevel inheritance
/*
 * Package   :org.college
     Class     :College
     Methods   :collegeName(),collegeCode(),collegeRank()

     Package   :org.department
     Class        :Department
     Methods   :deptName()
 
     Package   :org.student
     Class        :Student
     Methods   :studentName(),studentDept(),studentId()
  
Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.

 * */


import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The Student Name is Ananya");

	}

	public void studentDept() {
		System.out.println("The Student Department is Computer Science");

	}

	public void studentId() {
		System.out.println("The Student ID is 400005");

	}
	public static void main(String[] args) {
		Student s=new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
	}
}
