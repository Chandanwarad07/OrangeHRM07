package testCases;

//import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AdminPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC0002_LoginRegriest extends BaseClass {

    @Test(groups = {"sanity"})
    public void verifyLoginWithValidCredentials() throws InterruptedException {

        HomePage hp = new HomePage(driver);

        hp.enterUsername(p.getProperty("username"));
        hp.enterPassword(p.getProperty("password"));
        hp.clickButton();

        AdminPage ap = new AdminPage(driver);

        ap.clickAdmin();
        ap.clickAdd();

        ap.enterEmployeeName("Paul Collings");
        ap.selectUserRoleAdmin();
        ap.selectStatusEnabled();

        String randomUser = "user" + System.currentTimeMillis();
        ap.enterUserName(randomUser);

        String password = "Admin@123";
        ap.enterPassword(password);
        ap.enterConfirmPasswor(password);

        ap.clickSave();
        
//        Thread.sleep(1000);
//
//        Assert.assertTrue(
//        	    driver.getCurrentUrl().contains("viewSystemUsers"),
//        	    "User creation failed"
//        	);

    }
}
