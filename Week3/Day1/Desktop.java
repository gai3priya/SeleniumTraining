
//	Assignment 1:
//	     Interface :HardWare
//	     Methods   :hardwareResources()
//
//	     Interface :Software
//	     Methods   :softwareResources()
//
//	     Class     :Desktop
//	     Methods   :desktopModel()
//
//	Description:
//	create 2 Interface and archieve multiple inheritance.





package Week3.Day1;

public class Desktop implements  HardWare, Software{

	public void desktopModel() {
		System.out.println("Main class implementation");
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Main class implementation");
		
	}
	
	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Main class implementation");
		
	}
	
	
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		
		obj.desktopModel();
		obj.softwareResources();
		obj.hardwareResources();
		obj.hardwareRepair();
	}

	

}
