package Week3.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'leadsMain')]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Leads']")).click();
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(windowHandles);
		
		System.out.println(handleList);
		driver.switchTo().window(handleList.get(1));
		String firstEmployeeId = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstEmployeeId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.switchTo().window(handleList.get(0));
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Thread.sleep(10000);

		Set<String> newWindowHandle = driver.getWindowHandles();
		List<String> newHandleList = new ArrayList<String>(newWindowHandle);
		
//		String newHandleList = driver.getWindowHandle(); As the focus is on the main window and there is no way to get the focus to new window we alwys use getwindowhandles() when there is a multi window
//		System.out.println(newHandleList);
		driver.switchTo().window(newHandleList.get(1));
		String secondEmployeeId = driver
				.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).getText();
		driver.findElementByXPath("//input[@name='id']").sendKeys(secondEmployeeId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		driver.switchTo().window(handleList.get(0));
		driver.findElementByXPath("//a[text()='Merge']").click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstEmployeeId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (message.equals("No records to display"))
			System.out.println("Merge successful");
		driver.quit();

	}

}
