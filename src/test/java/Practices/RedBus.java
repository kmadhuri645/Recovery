package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	@Test
	public void getData() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch1=new ChromeOptions();
		ch1.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(ch1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.xpath("//label[text()='From']/./preceding-sibling::input[@id='src']"));
		
		from.click();
		from.sendKeys("Munnar");
		from.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
	    driver.findElement(By.xpath("//text[text()='KunnamKulam']")).click();
		
	
		WebElement To = driver.findElement(By.xpath("//label[text()='To']/../input[@id='dest']"));
		To.click();
		To.sendKeys("delhi");
		To.sendKeys(Keys.ENTER);
		
		WebElement ToPlace = driver.findElement(By.xpath("//text[text()='Delhi']"));
		
		
		WebElement date = driver.findElement(By.xpath("//span[contains(@class,'fgdqFw') and text()='5']"));
		date.click();
		
		
		
		
	}

}
