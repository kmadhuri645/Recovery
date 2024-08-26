package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headLessBrowserLaunch {
	
	@Test
	public void LaunchBrowser() {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://google.com");
		System.out.println("===========Run=========="+driver.getTitle());
		driver.quit();
		
	}
	
	@Test
	public void LaunchBrowser1() {
		
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://google.com");
		System.out.println("===========Run==========");
		driver.quit();
		
	}

}
