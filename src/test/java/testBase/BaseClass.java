package testBase;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	protected  WebDriver driver;
	
	
	public Properties p;
	


	@BeforeClass
	public void setup() throws Exception
	{
		
		

		 p = new Properties();
		 p.load(getClass().getClassLoader().getResourceAsStream("config.properties"));


		 
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
