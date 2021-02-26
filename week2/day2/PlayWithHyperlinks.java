package week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("http://leafground.com/pages/Link.html");

		// Goto home page.
		driver.findElementByLinkText("Go to Home Page").click();
		if (driver.getCurrentUrl().contains("home"))
			System.out.println("Navigated to home page ");	
		driver.navigate().back();

		// Find href without clicking it
		String attribute = driver.findElementByPartialLinkText("clicking me?").getAttribute("href");
		System.out.println("The page this link navigates to is " + attribute);

		// Verify if link is broken
		driver.findElementByLinkText("Verify am I broken?").click();
		String text = driver.findElementByXPath("//h1").getText();
		//System.out.println(Integer.parseInt(text));
		if (text.contains("404"))
			System.out.println("The link Errors");
		else
			System.out.println("There are no errors");
		driver.navigate().back();

		// How many links are present in the page

		List<WebElement> findElementsByXPath = driver.findElementsByXPath("//a");

		System.out.println("Total links presnt in the page are :" + findElementsByXPath.size());

		/*
		 * for (WebElement webElement : findElementsByXPath) {
		 * 
		 * System.out.println( webElement.getAttribute("href"));
		 * 
		 * }
		 */

		Iterator<WebElement> itr = findElementsByXPath.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getAttribute("href"));
		}

	}

}
