
package Week3.Assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RedBus {

	public ChromeDriver driver;
	int i = 1;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		RedBus obj = new RedBus();
		ChromeOptions preference = obj.ignoreAlerts();
		obj.loadDriver(preference);
		obj.enterFrom();
		obj.enterTo();
		obj.selectNextDay();
		obj.clickSearch();
		obj.getTotalBusses();
		obj.printBuses();
		obj.clickViewSeats();
		obj.takeScreenShot();
		obj.closeBrowser();

	}

	private void closeBrowser() {
		driver.quit();
		
	}

	private void takeScreenShot() throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/screenshot.png");
		FileUtils.copyFile(source, dest);
	}

	private void clickViewSeats() throws InterruptedException {
		driver.findElementByXPath("//i[@class='icon icon-close c-fs']").click();
		driver.findElementByXPath("(//div[text()='View Seats'])[1]").click();
		Thread.sleep(3000);
	}

	private void printBuses() {
		List<WebElement> findElementsByXPath = driver
				.findElementsByXPath("//div[@class='clearfix row-one']//div[contains(@class, 'travels')]");
		List<String> elementText = new ArrayList<String>();
		for (WebElement webElement : findElementsByXPath) {
			elementText.add(webElement.getText());

		}
		Set<String> uniqueBusses = new LinkedHashSet<String>(elementText);
		List<String> finalList = new ArrayList<String>(uniqueBusses);
		System.out.println("Travel available eliminating the duplicates:");
		for (String string : finalList) {
			System.out.println(i + " " + string);
			i++;
		}
	}

	private void getTotalBusses() throws InterruptedException {
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		String str = text.replaceAll("[a-zA-Z]", "");
		System.out.println("Total busses available:" + str);
	}

	private void clickSearch() throws InterruptedException {
		Thread.sleep(1000);
		WebElement searchButton = driver.findElementByXPath("//button[@id='search_btn']");
		searchButton.click();
	}

	private void selectNextDay() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@id='onward_cal']").click();
		WebElement nextDate = driver.findElementByXPath("//td[@class='current day']/following-sibling::td[1]");
		nextDate.click();
	}

	private void enterTo() throws InterruptedException {
		Thread.sleep(1000);
		WebElement toLocation = driver.findElementByXPath("//input[@id='dest']");
		toLocation.sendKeys("Madurai (All Locations)");
	}

	private void enterFrom() throws InterruptedException {
		WebElement fromLocation = driver.findElementByXPath("//input[@id='src']");
		fromLocation.sendKeys("Koyambedu, Chennai");
	}

	private ChromeOptions ignoreAlerts() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.DISMISS);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.merge(cap);
		return options;
	}

	private void loadDriver(ChromeOptions options) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}


// File Scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); - this
// in Selenium 3
/// File Scr = driver.getScreenshotAs(OutputType.FILE); - this in Selenium 4
// File Dest = new File("./snaps/screen.png");
// FileUtils.copyFile(Src,Dest);

//// Create a map to store preferences
//Map<String, Object> prefs = new HashMap<String, Object>();
//
//// add key and value to map as follow to switch off browser notification
//// Pass the argument 1 to allow and 2 to block
//prefs.put("profile.default_content_setting_values.notifications", 2);
//
//// Create an instance of ChromeOptions
//ChromeOptions options = new ChromeOptions();
//
//// set ExperimentalOption - prefs
//options.setExperimentalOption("prefs", prefs);
