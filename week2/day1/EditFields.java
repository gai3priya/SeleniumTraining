package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("text");
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean displayed = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
		if (displayed == true)
			System.out.println("Element is disabled");
		Thread.sleep(5000);
		driver.close();

	}

}
