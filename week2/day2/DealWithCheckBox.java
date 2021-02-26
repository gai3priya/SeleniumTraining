package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DealWithCheckBox {

	static ChromeDriver driver;

	public static void main(String[] args) {
		// Select the languages that you know?
		loadBrowser();
		selectLanguagesYouKnow();
		confimIfChecked();
		deSelectCheckbox();
		selectAllOptions();

	}

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
	}

	public static void selectLanguagesYouKnow() {
		driver.findElementByXPath("//div[text()='Java']/input").click();
		driver.findElementByXPath("//div[text()='SQL']/input").click();
		driver.findElementByXPath("//div[text()='C']/input").click();
		driver.findElementByXPath("//div[text()='C++']/input").click();
	}

	public static void confimIfChecked() {

		if (driver.findElementByXPath("//div[text()='Selenium']/input").isSelected())
			System.out.println("Selenium is selected");
	}

	public static void deSelectCheckbox() {
		driver.findElementByXPath("//div[text()='I am Selected']/input").click();
	}

	public static void selectAllOptions() {

		List<WebElement> findElementsByXPath = driver
				.findElementsByXPath("//label[contains(text(),'Select all')]/following-sibling::div/input");
		for (WebElement webElement : findElementsByXPath) {
			webElement.click();
		}

	}

}
