package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridTest {
	
	@Test
	public void sampleTest() throws  Exception {
		//WebDriverManager.chromedriver().setup();
		
		
		//URL url=new URL("http://localhost:4444");
		
		URL url=new URI("http://localhost:3876").toURL();//THE CONSTRUCTOR URL(String) IS DEPRECATED
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(url ,cap);
		driver.get("https://gmail.com");
	}
	
	
	
	
	
	
	
	

}
