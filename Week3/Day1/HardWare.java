package Week3.Day1;

public interface HardWare {
	
  void hardwareResources(); //public default
  
  default void hardwareRepair() {
		// Default method should have implementation all other methods are public by default
	  System.out.println("Default method in interfact");
		
	}

}
