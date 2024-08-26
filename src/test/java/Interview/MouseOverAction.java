package Interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction {
	
	@Test
	public void clickSecondOption() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement mouseOverElement = driver.findElement(By.xpath("//button[contains(@id,'mousehover')]"));
		WebElement top = driver.findElement(By.xpath("//a[text()='Top']"));
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(mouseOverElement).click(top)
		.perform();
		System.out.println("completed");
		
		
		
		
		
	}

}
