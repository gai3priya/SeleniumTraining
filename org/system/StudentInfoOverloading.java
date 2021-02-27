
//	Assignment4:
//		==============
//
//		      Class: Students
//		      Methods: getStudentInfo()
//
//		Description: 
//		Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber


package org.system;

public class StudentInfoOverloading {

	public void getStudentInfo(int id) {
		System.out.println("Method with student id " + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Method with student id  and name " + id +" ," + name);


	}

	public void getStudentInfo(String email, int number) {
		System.out.println("Method with student email and Phone " + email+", "+number);


	}
	
	public static void main(String[] args) {
		
		StudentInfoOverloading student = new StudentInfoOverloading();
		
		student.getStudentInfo(123456);
		student.getStudentInfo(123456, "Gayathri");
		student.getStudentInfo("test@test.com", 987456321);
		
	}

}
