package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseClass {
	
	protected  WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
		
		 RestAssured.baseURI = "https://reqres.in";
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
