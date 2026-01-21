package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePgae {
	
	WebDriver driver;
	
	public BasePgae(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
