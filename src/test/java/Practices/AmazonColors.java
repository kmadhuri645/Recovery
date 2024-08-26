package Practices;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonColors {
	
	@Test
	public void getcolors() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.sendKeys("iphone13",Keys.ENTER);
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[1]")).click();
		String parentID = driver.getWindowHandle();
		Set<String> childID = driver.getWindowHandles();
		
		for(String s:childID) {
		String	url=driver.switchTo().window(s).getCurrentUrl();
		System.out.println(url);
		List<WebElement> color =driver.findElements(By.xpath("//img[@class=\"imgSwatch\"]"));
		for(WebElement e:color) {
			String check = e.getAttribute("alt");
			System.out.println(check);
		}
		
		
		}
		
		
	}
		
			
	}
	
//	@Test
//	public void brokenlink() {
//		WebDriver driver=new ChromeDriver();
//		
//	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
//	      driver.get("https://www.instagram.com");
//	      int code,count=0;
//	      List<WebElement> tag=driver.findElements(By.tagName("a"));
//	      for(WebElement e:tag) {
//	    	     String url=e.getAttribute("href");
//	    	     try {
//	    	    	 URL link=new URL(url);
//	    	    	 HttpURLConnection hc=(HttpURLConnection) link.openConnection();
//	    	    	 hc.connect();
//	    	    	 code=hc.getResponseCode();
//	    	    	 if(code>=300) {
//	    	    		 count++;
//	    	    	 }else {
//	    	    		 System.out.println(hc.getResponseCode());
//	    	    	 }
//	    	     }catch(Exception e1) {
//	    	    	 e1.printStackTrace();
//	    	     }
//	    	     
//	      }
//	      driver.quit();
//		}
//	
//	}
//
//}
