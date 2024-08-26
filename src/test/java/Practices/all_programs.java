package Practices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class all_programs {
	
	@Test
	
	public void getPrice() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
	Thread.sleep(2000);
	 WebElement priceText = driver.findElement(By.xpath("//table/tbody/tr[last()-1]/td[last()]"));
	// priceText .getText();
	
	System.out.println( priceText .getText());
	
	}
	
	
    @Test
	public void getPrice1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13" ,Keys.ENTER);
    WebElement cicktarget = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']"));
    
    //JavascriptExecutor js=(JavascriptExecutor) driver;
   // js.executeScript("arguments[0].scrollIntoView(true);", cicktarget);
    cicktarget.click();
   String parent = driver.getWindowHandle();
   Set<String> child = driver.getWindowHandles();
   for(String s:child) {
	   if(driver.getCurrentUrl().contains("https://www.amazon.in/")) {
		   System.out.println("Check fo r");
		   driver.switchTo().window(s);
	   }
	  
	 
   }
   String print = driver.findElement(By.id("productTitle")).getText();
   System.out.println(print);
    }
	 @Test
	 public void valueCss() {
		 
		  WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("https://www.amazon.in/");
			 WebElement cssValue = driver.findElement(By.xpath("//div[text()='EN']"));
			System.out.println(cssValue.getCssValue("position"));
		  
	  }	
	 
	 @Test
	 public void handleTable() {
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.manage().window().maximize();
			driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
			List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[*]"));
			List<WebElement> colData = driver.findElements(By.xpath("//table/tbody/tr[1]/td[*]"));
			
			
				System.out.println("rowData"+rowData.size());
				System.out.println("colData"+colData.size());
			}
	 
	 @Test
	 public void microPhonePopUp() {
		 
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions option=new ChromeOptions();
		 option.addArguments("--use-fake-ui-for-media-stream");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.manage().window().maximize();
			driver.get("https://webcamtests.com/check");
			driver.findElement(By.xpath("//button[text()='Check my webcam']")).click();
			
				
		 
	 }
	 @Test
	 public void findPTs() {
		 String value="Jaipur Pink Panthers";
		 
		 WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.manage().window().maximize();
			driver.get("https://www.prokabaddi.com/standings");
			
			//String puneri_Paltan="//p[text()='"+value+"']/ancestor::div[@class='table-row qualifier']/descendant::div[@class='table-data points']";
			WebElement ptrScore = driver.findElement(By.xpath("//p[text()='"+value+"']/ancestor::div[@class='table-row qualifier']/descendant::div[@class='table-data points']"));
			System.out.println("puneri_Paltan score is  : "+ptrScore.getText());
		 
	 }
	 
	 @Test
	 public void useRobot() throws Throwable {
		 
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("Neha");
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_C);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
	 }
	 @Test
	 public void hyr() {
		 
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			WebElement nameText = driver.findElement(By.xpath("//label[text()='First Name ' ]/following::input[@maxlength=\"10\"]"));
			nameText.click();
			nameText.sendKeys("madhuri");
			
			WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name' ]/following::input[@maxlength='15']"));
			lastName.click();
			lastName.sendKeys("kumari");
			WebElement email = driver.findElement(By.xpath(" //label[text()='Email' ]/following-sibling::input[@type=\"text\"]"));
			email.click();
			email.sendKeys("madhuri123@gmail.com");
			
			
			WebElement password = driver.findElement(By.xpath("//label[text()='Password' ]/following::input[@type='password'][1]"));
			password.click();
			password.sendKeys("Madhuri@123");
			
			WebElement Reapeatpassword=driver.findElement(By.xpath("//label[text()='Repeat Password' ]/following::input[@type='password']"));
			Reapeatpassword.click();
			Reapeatpassword.sendKeys("Madhuri@123");
			driver.findElement(By.xpath("//button[text()='Register']")).click();
	 
    }
	 @Test
	 
	 public void makemyTrip() throws InterruptedException {
	       WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().window().maximize();
			driver.get("https://www.makemytrip.com/");
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//normal alert
			driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
			
			//from
			driver.findElement(By.xpath("//input[@id='fromCity']")).click();
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mumbai");
			driver.findElement(By.xpath("//span[@class='makeFlex flexOne spaceBetween appendRight10']//span[contains(., 'Mumbai')]")).click();
			
			//To
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("delhi");
			driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
			
				        
			//select depature date
	        WebElement departureDateInput = driver.findElement(By.xpath("//input[@id='departure']"));
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();", departureDateInput);
			
            WebElement date = driver.findElement(By.xpath("//div[@class='DayPicker-Month' and contains(.,'August 2024')]/descendant::div[@aria-label='Sun Aug 25 2024']"));
            Thread.sleep(2000);
             js.executeScript("arguments[0].scrollIntoView(true)", date);
             js.executeScript("arguments[0].click();", date);
            
			Thread.sleep(2000);
			//date.click();

            WebElement returnDateInput = driver.findElement(By.xpath("//span[text()='Return']"));
           // js.executeScript("window.scrollTo(0, 0);");
            js.executeScript("arguments[0].scrollIntoView(true)", returnDateInput);
            Thread.sleep(2000);
			 js.executeScript("arguments[0].click();", returnDateInput);
			 
			WebElement returnDate = driver.findElement(By.xpath("//div[@class='DayPicker-Month' and contains(., 'September')]/descendant::div[@aria-label='Thu Sep 05 2024']"));
			js.executeScript("arguments[0].scrollIntoView(true)", returnDate);
            Thread.sleep(2000);
			 js.executeScript("arguments[0].click();", returnDate);
			 
			 //select child
			 
			WebElement Traveller = driver.findElement(By.xpath("//span[text()='Travellers & Class']"));
			 js.executeScript("arguments[0].scrollIntoView(true)", Traveller);
			 js.executeScript("arguments[0].click();", Traveller);
			
			 driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();
			 driver.findElement(By.xpath("//button[contains(., 'APPLY')]")).click();
			 
			 driver.findElement(By.xpath("//a[contains(., 'Search')]")).click();
			 System.out.println("sucessfull");
	 }
	 @Test
		 public void brokenLink() throws URISyntaxException {
		 
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions option =new ChromeOptions();
		 option.setAcceptInsecureCerts(true);
			WebDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.get("https://rrbbnc.gov.in/");
			List<WebElement> allLink = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
			System.out.println(allLink.size());
			
			for(WebElement eachLink:allLink) {
				
				String link=eachLink.getAttribute("href");
				URI url=new URI(link);
				
				
				//HttpURLConnection httpconnection=(HttpURLConnection)url.openConnection();
				//int statusCode=httpconnection.getResponseCode();
			
			} 
	 }
	 
	 @Test
	 public void SSLcertificateHandlingTest(){
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions handleSSL =new ChromeOptions();
		 handleSSL.setAcceptInsecureCerts(true);
			WebDriver driver=new ChromeDriver(handleSSL);
			driver.manage().window().maximize();
			driver.get("https://expired.badssl.com/");
		
			System.out.println(driver.getTitle());
	 }
	 
	 @Test
	 public void getCurrentDate() {
		 
		     LocalDate current=LocalDate.now();
			LocalDate yesterday = current.minusDays(1);
			LocalDate birthday = current.of(1994, 10, 12);
			System.out.println(birthday.getDayOfWeek());
			System.out.println(yesterday);
			System.out.println(current);
		 
	 }
	 
}

			
           
            
 
	
	 
	



 

 

	 
