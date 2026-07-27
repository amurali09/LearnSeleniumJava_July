package day16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// By Link text - when a text is present inside <a>linktext</a>
		driver.findElement(By.linkText("Prime Video")).click();
		
		driver.navigate().back();
		
		// By Partial link text
		driver.findElement(By.partialLinkText("Home &")).click();
		
		// Capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		// Using for loop
		for(int i=0; i < links.size(); i++) {
			
			String linkText = links.get(i).getText(); // Visible Text
			String link = links.get(i).getAttribute("href"); // Links behind the text
			System.out.println(linkText+" -> "+link);
		}
		
		
		
		
//		int a =10;
//		
//		int[] arr = {10,20,30};
//		
//		String[] names = {"John" , "Test" , "user"};
//		
//		List<Integer> list = new ArrayList<Integer>(); // Wrapper class
//		list.add(10);
//		
//		List<Object> list1 = new ArrayList<Object>();
//		list1.add(10);
//		list1.add("Name");
		
		
	}

}
