package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		SnapDeal obj = new SnapDeal();
		obj.loadBrowser();
		obj.clickLoafer();
		obj.clickQuickView();
		obj.closeBrowser();

	}

	private void closeBrowser() {
		driver.quit();

	}

	private void clickQuickView() throws InterruptedException {
		// TODO Auto-generated method stub
		WebElement firstResult = driver.findElementByXPath("(//section[@data-dpidt='pdt_grd']/div)[1]/div[2]");
		Actions builder = new Actions(driver);
		builder.moveToElement(firstResult).moveToElement(driver.findElementByXPath("//div[contains(@class,'center quick-view-bar')]")).click().perform();
		Thread.sleep(2000);

	}

	private void clickLoafer() {
		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		WebElement loafersElement = driver.findElementByXPath("//span[contains(text(),'Loafers')]");

		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion).moveToElement(loafersElement).click().perform();

	}

	private void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}

//1. Load https://www.snapdeal.com/
//2. Mouse hover on Men's Fashion and Click Loafers
//3. Mouse hover on the first product and Click on Quick View
//4. Close all the browsers