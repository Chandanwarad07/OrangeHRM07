package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePgae {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement clickLogin;
	
	
	public void enterUsername(String user) {
		userName.sendKeys(user);
	}
	
	public void enterPassword(String psw) {
		password.sendKeys(psw);
		
	}
	
	public void clickButton() {
		clickLogin.click();
	}
}












//@FindBy(xpath="//input[@placeholder='Username']") @CacheLookup private WebElement username;
//@Fi@FindBy(xpath="//button[normalize-space()='Login']")ndBy(xpath="//input[@placeholder='Password']") @CacheLookup private WebElement password;
// @CacheLookup private WebElement login;
