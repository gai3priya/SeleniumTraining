package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai/search");
		driver.manage().window().maximize();
		driver.findElementByXPath("//div[@class='selectedCity']").click();
		driver.findElementByXPath("//input[@placeholder ='Enter city'] ").sendKeys("c");

		Actions dropDown = new Actions(driver);
		Action builder = dropDown.moveToElement(driver.findElementByXPath("//li[text()='Chandigarh']")).click().build();
		builder.perform();

	}

}
