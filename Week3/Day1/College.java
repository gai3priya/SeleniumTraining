
//	Assignment 2:
//	     AbstractClass     :University
//	     Methods              : pg()(implemented method), ug() (unimplemented method)
//
//	     Class        :College extends University
//	     Methods   :ug()
//
//	Description:
//	ug() is just a templete in University Abstract class and You have to implement the method ug() in College class.
//	Execute both ug() & pg()
	


package Week3.Day1;

public class College extends UniversityClass{

	@Override
	public void ug() {
		System.out.println("Implemented from sub class UG method");
		
	}

	public static void main(String[] args) {
		
		College col = new College();
		
		col.ug();
		col.pg();
		
	}

}
