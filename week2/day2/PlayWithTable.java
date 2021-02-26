package week2.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithTable {
	static ChromeDriver driver;

	public static void main(String[] args) {
		loadBrowser();
		getTotalRow();
		getTotalColumn();
		getProgressValue();
		leastCompletedTask();
	}

	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();

	}

	public static void getTotalRow() {

		List<WebElement> findElementsByXPath = driver.findElementsByXPath("//tbody/tr");
		System.out.println("The total count of rows in the table : " + findElementsByXPath.size());
	}

	public static void getTotalColumn() {

		List<WebElement> findElementsByXPath = driver.findElementsByXPath("//tbody/tr[1]/th");
		System.out.println("The total count of columns in the table : " + findElementsByXPath.size());
	}

	public static void getProgressValue() {
		String text = driver.findElementByXPath("//tbody/tr[3]/td[2]").getText();
		System.out.println("The progress of Learn to interact with Elements is  : " + text);
	}

	public static void leastCompletedTask() {

		List<String> stringList = new ArrayList<String>();
		List<WebElement> findElementsByXPath = driver.findElementsByXPath("//tbody/tr/td[2]");

		for (int i = 0; i < findElementsByXPath.size(); i++) {
			stringList.add(i, findElementsByXPath.get(i).getText().replace('%', ' '));
		}
		int lowest = 200;
		for (int i = 0; i < stringList.size(); i++) {
			int current = Integer.parseInt(stringList.get(i).trim());
			if (current < lowest)
				lowest = current;

		}
		System.out.println("The least completed Progress is : " + lowest + '%');

		driver.findElementByXPath("//td[contains(text(),'" + lowest + "')]/following-sibling::td[1]/input").click();
	}
}
