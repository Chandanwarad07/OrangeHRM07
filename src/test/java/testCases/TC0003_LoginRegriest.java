package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC0003_LoginRegriest extends BaseClass {

	@Test(groups = {"regression", "dataDriven", "master"},
		      dataProvider = "LoginData",
		      dataProviderClass = DataProviders.class)
		public void verifyLoginDDT(String user, String pwd, String exp) {
		
		    HomePage hp = new HomePage(driver);

		    hp.enterUsername(user);
		    hp.enterPassword(pwd);
		    hp.clickButton();

	    boolean status = driver.getCurrentUrl().contains("dashboard");

		    if (exp.equalsIgnoreCase("valid")) {

		        Assert.assertTrue(status, 
		                "Expected valid login but login failed for user: " + user);

		    } else if (exp.equalsIgnoreCase("invalid")) {

		        Assert.assertFalse(status, 
		                "Expected invalid login but login succeeded for user: " + user);
		    }
		}
	
}