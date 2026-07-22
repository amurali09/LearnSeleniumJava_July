package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserAndNavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Launch the browser
		
		WebDriver driver = new EdgeDriver();
		
		// Step 2: Load the url
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  // Using Browser command
		
		
		// Step 3: Maximize the browser
		driver.manage().window().maximize();
		
		// Browser Command
		
		// Get Title
		
		String ExpectedTitle = "Orang";
		String alternativeTitle ="OrangeHRM";
		
		String Actualtitle = driver.getTitle();
		
		// If - else condition
		
		if(ExpectedTitle.equals(Actualtitle)) {
			System.out.println("The title matched!!! " + Actualtitle);
		} else if(alternativeTitle.equals(Actualtitle)) {
			System.out.println("Title matched NOW");
		} else {
			System.out.println("Still not matched!!!");
		}
		
		//System.out.println("The title of the webpage is: " +Actualtitle);
		
		// Get current url
		String url = driver.getCurrentUrl();
		System.out.println("The url of the webpage is: " +url);
		
		// Get Page Source
		String source = driver.getPageSource();
		System.out.println("The page source is: " +source);
		
		// Locate Sign in button
		//driver.findElement(By.xpath("//div[text()='Signup']")).click();
		
		
		// Navigate Commands
		
		driver.navigate().to("https://www.google.com");
		
		// to move back
		
		driver.navigate().back();
		
		// to move foward
		driver.navigate().forward();
		
		// to refresh
		driver.navigate().refresh();
		
		
		// Close browser
		driver.quit();
		
		
	}

}
