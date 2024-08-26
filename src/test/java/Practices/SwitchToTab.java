package Practices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToTab {
	
	@Test
	public void switchToTab() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.google.com/");
		
		String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();

		   for(String s:child) {
			   if(driver.getCurrentUrl().contains("https://www.google.com/")) {
				   driver.switchTo().window(parent);
				   
				   driver.navigate().back();
				   driver.get("https://www.instagram.com/");
				   
				   driver.navigate().back();
				   driver.get("https://www.google.com/");
				   
				  WebElement serchText = driver.findElement(By.name("q"));
				  serchText.click();
				  serchText .sendKeys("nirajchhopra");
				   
				   
		
	    }

}
	}
}
