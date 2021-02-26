package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadEdit {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Gopi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-grid3-viewport']/div[2]//a").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Ford");
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(3000);
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		text.replaceAll("[0-9()]", "");
		if(text.equalsIgnoreCase("Ford"))
			System.out.println("Company Name updated Successfully");
		String pageTitle = driver.getTitle();
		System.out.println("current page tile is " + pageTitle);
		driver.close();
	}

}
