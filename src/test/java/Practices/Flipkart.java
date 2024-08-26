package Practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
		@Test
		public void getData() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//String parent = driver.getWindowHandle();
			
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 14", Keys.ENTER);
			driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Midnight, 128 GB)']")).click();
			Thread.sleep(2000);
			String parent = driver.getWindowHandle();
			Set<String> child=driver.getWindowHandles();
			 for(String s:child) {
				
			 String url = driver.switchTo().window(s).getCurrentUrl();
				 if(url.contains("https://www.flipkart.com/apple-iphone-14-plus-midnight-128-gb")) {
					 WebElement price = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus (Midnight, 128 GB)']/../../../..//div[@class='Nx9bqj CxhGGd']"));
						System.out.println(price.getText());
						break;
				 }
			 }
			 
			
	   
		}	
	}



