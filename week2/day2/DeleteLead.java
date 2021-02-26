package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'leadsMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'findLeads')]")).click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(3000);
		String employeeID = driver.findElementByXPath("(//div[@class='x-grid3-viewport']/div[2]//a)[1]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-viewport']/div[2]//a)[1]").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElement(By.xpath("//a[contains(@href, 'findLeads')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@name='id']").sendKeys(employeeID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if (text2.equals("No records to display"))
			System.out.println(employeeID + " deleted Successfully");
		driver.close();
	}

}
