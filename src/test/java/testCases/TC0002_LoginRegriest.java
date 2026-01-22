package testCases;

import org.testng.annotations.Test;

import pageObject.AdminPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC0002_LoginRegriest extends BaseClass {
	
	
	@Test
public void verifyLoginWithValidCredentials()
{
		HomePage hp = new HomePage(driver);
		
		hp.enterUsername(p.getProperty("username"));
		hp.enterPassword(p.getProperty("password"));
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
	
}
