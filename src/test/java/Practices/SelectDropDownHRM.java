package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownHRM {
	
	@Test
	public void verifyGUIpage() {
	   WebDriverManager.chromiumdriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("http://49.249.28.218:8091/dashboard/projects");
	   driver.findElement(By.id("username")).sendKeys("rmgyantra");
	   driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
	   driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	   driver.findElement(By.xpath("//a[text()='Projects']")).click();
	   driver.findElement(By.xpath("//span[text()='Create Project']")).click();
	   
	   driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("f1");
	   driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("neha");
	   
	    WebElement sValue = driver.findElement(By.xpath("//label[@class='col-form-label']/following-sibling::select"));
	 
	   Select select =new Select(sValue);
	   select.selectByValue("On Going"); 
		
	}
}



