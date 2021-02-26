package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Ford Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Haribabu");

		Select sourceDropDown = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		sourceDropDown.selectByVisibleText("Employee");

		Select marketingCampaignDropdown = new Select(driver.findElement(By.name("marketingCampaignId")));
		marketingCampaignDropdown.selectByValue("9001");

		Select ownershipDropdown = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownershipDropdown.selectByIndex(5);

		Select countryDropdown = new Select(driver.findElement(By.name("generalCountryGeoId")));
		countryDropdown.selectByVisibleText("India");

		driver.findElement(By.name("submitButton")).click();
		String pageTitle = driver.getTitle();
		System.out.println("Creation successful, current page tile is " + pageTitle);
		driver.close();
	}

}
