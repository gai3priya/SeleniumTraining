package week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithRadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// div[@id ='first']//input[@id = 'yes']

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		// Select Yes for Are you enjoying the class radio button
		driver.findElementByXPath("//div[@id ='first']//input[@id = 'yes']").click();

		// Get the selected value

		List<WebElement> findElementsByXPath = driver
				.findElementsByXPath("//label[contains(text(),'Find default')]/following-sibling::label/input");
		System.out.println(findElementsByXPath.size());

		for (int i = 0; i < findElementsByXPath.size(); i++) {
			if (findElementsByXPath.get(i).isSelected())
				System.out.println(driver
						.findElementByXPath(
								"(//label[contains(text(),'Find default')]/following-sibling::label)[" + (i + 1) + "]")
						.getText() + " is Selected");
		}

		
		//Select your age group (Only if choice wasn't selected)
		
		 WebElement findElementByXPath = driver.findElementByXPath("(//input[@name = 'age'])[2]");
		
			 if(findElementByXPath.isSelected())
				 System.out.println("Age is Selected already" +findElementByXPath.getText());
			 else
				 findElementByXPath.click();
				 
	}

}
