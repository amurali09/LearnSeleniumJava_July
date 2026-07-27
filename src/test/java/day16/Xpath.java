package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Using Absolute xpath
		//driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div[2]/div/input")).sendKeys("Mobile",Keys.ENTER);

		// Relative Xpath
		
		// Attribute based
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile",Keys.ENTER);
		
		// Text Based
		String text = driver.findElement(By.xpath("//span[text()='Up to 40% off | Must-have kitchen appliances']")).getText();
		System.out.println(text);
	}

}
