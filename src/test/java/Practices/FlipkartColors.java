package Practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartColors {
	
	@Test
	public void getColors() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement searchText = driver.findElement(By.name("q"));
		searchText.sendKeys("iphone12" ,Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Apple iPhone 12 (Black, 64 GB)']")).click();
	    List<WebElement> colors = driver.findElements(By.xpath("//li[@id='swatch-0-color']/.."));
	    for(WebElement col:colors) {
	    	System.out.println(col.getText());
	    }
//		System.out.println(colors);
		
		
	}

}
