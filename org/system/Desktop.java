package org.system;

public class Desktop extends Computer {

	public  void desktopSize() {
		System.out.println("The Desktop Size");

	}

	public static void main(String[] args) {
		
		
		Desktop desktop = new Desktop();
		
		desktop.computerModel();
		desktop.desktopSize();

	}

}
