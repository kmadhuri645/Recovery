package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ValidateCheckBox {
	
	@Test
	public void verifyCheckbox() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement female = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba' ]/child::input[@value='1']"));
		
		
		//System.out.println(female.isEnabled());
		female.click();
		
	    if(female.isSelected()) {
			System.out.println("is selected");
		}
		else {
			female.click();
		}
		
		
		
		
		
	}

}
