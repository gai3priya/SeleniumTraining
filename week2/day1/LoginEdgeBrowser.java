package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginEdgeBrowser {

	
		public static void main(String[] args) {

			// Update Driver Code
			WebDriverManager.edgedriver().setup();
			// create Chrome driver object
			EdgeDriver driver = new EdgeDriver();
			// load URL
			driver.get("http://leaftaps.com/opentaps/control/main");
			// Maximise
			driver.manage().window().maximize();
//			 get title
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}


}
