package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
//Create Chrome Driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
//Click button to travel home page
		driver.findElement(By.id("home")).click();
		System.out.println("Navigated to " + driver.getTitle());
		driver.navigate().back();
//Find position of button (x,y)
		Point location = driver.findElement(By.id("position")).getLocation();
		System.out.println("Location is " + location);
//Find button color
		String attribute = driver.findElement(By.id("color")).getAttribute("style");
		String[] splitStr = attribute.split(":");
		System.out.println("Colour of the button is " + splitStr[1]);
//Find the height and width- size
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println("The size of the button is " + size);
		driver.close();
	}

}
