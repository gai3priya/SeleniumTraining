package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithDropdowns {

	static ChromeDriver driver;

	public static void main(String[] args) {
		loadBrowser();
		selectByIndexAttribute();
		selectByTextAttribute();
		selectByValueAttribute();
		returnAllOptions();
		sendKeysToDropDown();
		multiSelectDropDowns();
	}

	public static void loadBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
	}

	public static void selectByIndexAttribute() {
		Select dropDown = new Select(driver.findElementById("dropdown1"));
		dropDown.selectByIndex(1);
		System.out.println("The selected value is : " + dropDown.getFirstSelectedOption().getText());
	}

	private static void selectByTextAttribute() {
		Select dropDown = new Select(driver.findElementByName("dropdown2"));
		dropDown.selectByVisibleText("Selenium");
		System.out.println("The selected value is : " + dropDown.getFirstSelectedOption().getText());
	}

	private static void selectByValueAttribute() {

		Select dropDown = new Select(driver.findElementById("dropdown3"));
		dropDown.selectByValue("1");
		System.out.println("The selected value is : " + dropDown.getFirstSelectedOption().getText());
	}

	private static void returnAllOptions() {

		Select dropDown = new Select(driver.findElementByXPath("//select[@class='dropdown']"));
		List<WebElement> allSelectedOptions = dropDown.getOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());

		}
	}

	private static void sendKeysToDropDown() {

		driver.findElementByXPath("//option[contains(text(),'sendKeys')]/parent::select").sendKeys("Selenium");

	}

	private static void multiSelectDropDowns() {

		Select dropDown = new Select(driver.findElementByXPath("//option[contains(text(),'programs')]/parent::select"));
		if (dropDown.isMultiple()) {
			dropDown.selectByVisibleText("Selenium");
			dropDown.selectByVisibleText("Appium");
		} else
			System.out.println("Dropdown is not Multiselect");
		//driver.close();
	}
	
	

}
