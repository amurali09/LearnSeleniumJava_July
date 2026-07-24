package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); // This is a selenium wait that helps you to wait for all the elements upto 25 seconds
		
		// Find the element
		
		// Locating using ID attribute
//		driver.findElement(By.id("signin2")).click();  // click action
//		driver.findElement(By.id("sign-username")).sendKeys("demouser1822");  // type text
//		driver.findElement(By.id("sign-password")).sendKeys("demouser1822");
//		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		// By Class name - Don't use class name attribute if the attribute values has space in between
		// driver.findElement(By.className("btn btn-primary")).click();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// Locating using name attribute
		
		String text = driver.findElement(By.tagName("h5")).getText();   // This will return the visible text
		
		if(text.equalsIgnoreCase("Login")) {
			System.out.println("We are in the login page");
		} else {
			System.out.println("We are in different page");
		}
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		
		
		
	}

}
