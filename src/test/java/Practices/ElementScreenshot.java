package Practices;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {
	
	@Test
	public void getScreenshot() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/instamart");
		Thread.sleep(2000);
		
		List<WebElement> element = driver.findElements(By.xpath("//button[@aria-label='Fresh Vegetables']/ancestor::div[@class='rKVoK _1kbVF']/child::div[@class='_3aZ5w _1eWs7']"));
		
		int count = 0;
        for (WebElement element1 : element) {
            
            File screenshot = element1.getScreenshotAs(OutputType.FILE);
            
            File destination = new File("element_screenshot_" + count + ".png");
           
            FileUtils.copyFile(screenshot, destination);
            count++;
        }
        
        driver.quit(); // Close the browser
		
	}

}
