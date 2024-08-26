package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	@Test
	public void getAllData() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchText = driver.findElement(By.id("twotabsearchtextbox"));
		searchText.click();
		searchText.sendKeys("iphone");
		Thread.sleep(9000);
	
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]/div"));
		
		for (WebElement suggestion : allSuggestion){
			System.out.println(suggestion.getText());
			
		}

	}

		
	}


