package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'leadsMain')]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'findLeads')]")).click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("test@seltest.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		 Thread.sleep(3000);
		String employeeName = driver.findElementByXPath("(//div[@class='x-grid3-viewport']/div[2]//a)[3]").getText();
		driver.findElementByXPath("(//div[@class='x-grid3-viewport']/div[2]//a)[3]").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		text.replaceAll("[0-9()]", "");
		if(text.equalsIgnoreCase(employeeName))
			System.out.println("Employee created Successfully");
		
		
		driver.close();
	}
}
