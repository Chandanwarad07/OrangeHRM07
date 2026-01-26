package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utilities.DataProviders;
import testBase.BaseClass;

public class TC0003_LoginRegriest extends BaseClass {

    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
    public void verifyLoginDDT(String user, String pwd, String exp) {

        HomePage hp = new HomePage(driver);

        hp.enterUsername(user);
        hp.enterPassword(pwd);
        hp.clickButton();

        boolean status = driver.getCurrentUrl().contains("dashboard");

        if (exp.equalsIgnoreCase("valid")) {

            if (status == true) {
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }

        } else if (exp.equalsIgnoreCase("invalid")) {

            if (status == true) {
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }
}

