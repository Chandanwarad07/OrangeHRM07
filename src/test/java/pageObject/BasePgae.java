package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePgae {
	
	WebDriver driver;
    public WebDriverWait wait;
	
	public BasePgae(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

}