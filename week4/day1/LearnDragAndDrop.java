package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	ChromeDriver driver;

	public static void main(String[] args) {
		LearnDragAndDrop obj = new LearnDragAndDrop();
		obj.loadBrowser();
		obj.dragAndDrop();
		obj.closeBrowser();
	}

	private void closeBrowser() {
		driver.quit();
	}

	private void dragAndDrop() {

		Actions builder = new Actions(driver);
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
		WebElement source = driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
		Point location = driver.findElement(By.xpath("//ul[@id='sortable']/li[4]")).getLocation();
		int xoffSet = location.getX();
		int yoffSet = location.getY();
		builder.dragAndDropBy(source, xoffSet, yoffSet).perform();

	}

	private void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}

//Assignment1:
//https://jqueryui.com/sortable/
//Drag Item1 and drop it at Item4 location