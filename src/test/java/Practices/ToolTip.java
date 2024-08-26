package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.flipkart.com/");
		
		WebElement ToolTip = driver.findElement(By.xpath("//a[@title='Flipkart']"));
		String titleToolTip = ToolTip.getAttribute("title");
		System.out.println("titleToolTip : "+titleToolTip);
		
		//driver.manage().timeouts().implicitlyWait(null)
			

	}

}
