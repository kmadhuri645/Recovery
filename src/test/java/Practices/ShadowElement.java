package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElement {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://demoapps.qspiders.com/ui/shadow");
		
		SearchContext root1	=driver.findElement(By.xpath("//form//div[1]")).getShadowRoot();
		root1.findElement(By.cssSelector("input[placeholder='Enter your username']")).sendKeys("Madhu");
		
		Thread.sleep(2000);
		
		SearchContext root = driver.findElement(By.xpath("//form//div[2]")).getShadowRoot();
		root.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("Madhu123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
