package Interview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	
	/* ACTION CLASS OPERATION */
	
	@Test
	public void validateHide() {
		
		//String ExpectedElement ="Web Table Fixed header";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement showButton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		showButton.click();
		WebElement placeHolder_HideAndShow = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		System.out.println(placeHolder_HideAndShow.getAttribute("placeholder"));
		//System.out.println(placeHolder_HideAndShow.isDisplayed());
		Assert.assertTrue(placeHolder_HideAndShow.isDisplayed());
		
		System.out.println("=======================================================================================");
		WebElement hideButton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hideButton.click();
		
		WebElement HideAndShow_Text = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		System.out.println(HideAndShow_Text.getAttribute("style"));
		System.out.println(HideAndShow_Text.isDisplayed());
		Assert.assertFalse(HideAndShow_Text.isDisplayed());	
		
	}
	
	/* SELECT RELETED OPERATION */
	@Test
	public void selectClass() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement selectDropdown = driver.findElement(By.id("dropdown-class-example"));
		selectDropdown.click();
		
		    Select select=new Select(selectDropdown);
		    select.selectByValue("option2");// Select all options that have a value matching the argument
		    //select.selectByVisibleText("Option2");//Select all options that display text matching the argument
		   // select.selectByIndex(3); //Select the option at the given index.
		   // select.getFirstSelectedOption();
		   // select.getAllSelectedOptions();//Select the option at the given index.
		    //driver.quit();
		
		
	}
	@Test
	public void deSelectClass() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement selectDropdown = driver.findElement(By.id("ide"));
		selectDropdown.click();
		
		    Select select=new Select(selectDropdown);
		    select.getFirstSelectedOption();
		    select.deselectAll();
		    
		    select.selectByValue("ec");
		    select.selectByIndex(1);
		  List<WebElement> allItems = select.getAllSelectedOptions();
		  System.out.println(allItems.size());
		    
		    select.deselectAll();//Clear all selected entries.
		   select.deselectByIndex(1);//- Deselect the option at the given index.
		   select.deselectByValue("ij");// Deselect all options that have a value matching the argument.
		   select.deselectByVisibleText("Visual Studio");//Deselect all options that display text matching the argument.
		   List<WebElement> allItems1= select.getAllSelectedOptions();
		   System.out.println(allItems1.size());

	}
}

