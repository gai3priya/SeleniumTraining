package week2.day2;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class interactWithImages {
	static ChromeDriver driver;

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		loadBrowser();
		// Click image to navigate to home page
		clickImageAndNavigateToHomePage();
		// Check if the image is broken
		checkImageIsBroken();
		// Click image with mouse
		clickImageWithMouse();

	}

	public static void loadBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
	}

	public static void clickImageAndNavigateToHomePage() {

		driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/img)[1]").click();
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("home"))
			System.out.println("Navigated to home page successfully");
		driver.navigate().back();
	}

	public static void checkImageIsBroken() throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(
				driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns']/img)[2]")).getAttribute("src"));
		HttpResponse response = client.execute(request);
		if (response.getStatusLine().getStatusCode() != 200)
			System.out.println("The image is broken");
		else
			System.out.println("The image is not broken");

		// System.out.println(driver.findElement(By.xpath("(//div[@class='large-6
		// small-12 columns']/img)[2]")).getSize());
	}

	public static void clickImageWithMouse() {
		Actions builder = new Actions(driver);
		Action action = builder
				.moveToElement(driver.findElementByXPath("(//div[@class='large-6 small-12 columns']/img)[3]")).click()
				.build();
		action.perform();

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("home"))
			System.out.println("Navigated to home page successfully");
		driver.navigate().back();
	}

}
