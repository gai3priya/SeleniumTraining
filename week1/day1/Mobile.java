package week1.day1;

public class Mobile {

	String brand = "iPhone";
	String model = "6 Plus";
	String memory = "128 GB";
	boolean is100Pixel = true;
	int price = 50000;
	float costPrice = 35000.00F;
	char symbol = 'c';

	public static void main(String[] args) {
		Mobile m = new Mobile();
		System.out.println("I am inside main method");
		System.out.println("The price of the mobile is " + m.getPrice(1));
		m.getModel();
		m.printPicture();

	}

	public int getPrice(int type) {
		if (type == 1) {
			return 10000;
		} else if (type == 2) {
			return 20000;
		} else if (type == 3) {
			return 30000;
		} else {
			return 40000;
		}
	}

	public String getModel() {
		System.out.println("The model of the Phone is " + model);
		return model;
	}

	private void printPicture() {

		System.out.println("Picture on the wallpaper is a Cat");
	}

}
