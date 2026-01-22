package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AdminPage;
import pageObject.HomePage;

public class TC0002_LoginRegriest {
	
	public WebDriver driver;
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
//		Thread.sleep(10000);
		
		
	}
	@Test
public void verifyLoginWithValidCredentials()
{
		HomePage hp = new HomePage(driver);
		
		hp.enterUsername("Admin");
		hp.enterPassword("admin123");
		hp.clickButton();
		
		
		AdminPage ap = new AdminPage(driver);
		
		ap.clickAdmin();
		ap.clickAdd();

		ap.enterEmployeeName("Paul Collings");
		
		String randomUser = "user" + System.currentTimeMillis();
		ap.enterEmployeeName(randomUser);
		
		
		
		ap.selectUserRoleAdmin();
		ap.selectStatusEnabled();
		ap.enterUserName("testUser123");
		
		String rendomUserName ="user" +System.currentTimeMillis();
		ap.enterUserName(rendomUserName);
		
		String randomPassword = "Admin@" +System.currentTimeMillis();
		ap.enterPassword(randomPassword);
		
		ap.enterPassword("Admin@123'");

		
		 ap.clickSave();

		 
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
