//Assignment2:
//=============
//     Package   :org.college
//     Class        :College
//     Methods   :collegeName(),collegeCode(),collegeRank()
//
//     Package   :org.department
//     Class        :Department
//     Methods   :deptName()
// 
//     Package   :org.student
//     Class        :Student
//     Methods   :studentName(),studentDept(),studentId()
//  
//Description:
//create above 3 class and call all your class methods into the Student using multilevel inheritance.

package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student class: from student name Method");
	}

	public void studentDept() {
		System.out.println("Student class: from student name Method");
	}

	public void studentId() {
		System.out.println("Student class: from student name Method");
	}
	
	
	public static void main(String[] args) {
		//College college = new College();
		//Department department = new Department();
		Student student = new Student();
		
		student.collegeCode();// base class object is enough to access all super class; however the reverse is not true
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentDept();
		student.studentId();
		student.studentName();		
		
	}
}
