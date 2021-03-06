package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsExercise {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement firstSelection = driver
				.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]");
		WebElement secondSelection = driver
				.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[3]");

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).moveToElement(firstSelection).click().moveToElement(secondSelection).click()
				.keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
