package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends BasePgae{

	
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement adminMenu;
	
	
	@FindBy(xpath ="//button[normalize-space()='Add']")
	WebElement addButton;
	
	  @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[1]")
	    WebElement userRoleDropdown;
	  
	  
	  
	  @FindBy(xpath = "//div[@role='listbox']//span[text()='Admin']")
	  WebElement adminOption;
	  
	  @FindBy(xpath = "//input[@placeholder='Type for hints...']")
	  WebElement employeeName;
	  
	  @FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	    WebElement statusDropdown;
	  
	  @FindBy(xpath = "//div[@role='listbox']//span[text()='Enabled']")
	  WebElement enabledOption;

	  
	  @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	    WebElement username;
	
	  
	  @FindBy(xpath = "(//input[@type='password'])[1]")
	    WebElement password;
	  
	  @FindBy(xpath = "(//input[@type='password'])[2]")
	    WebElement confirmPassword;
	  
	  @FindBy(xpath = "//button[normalize-space()='Save']")
	    WebElement saveButton;
	  
	  public void clickAdmin() {
		  adminMenu.click();
	  }
	  
	  public void clickAdd() {
		  addButton.click();
	  }
	  
	  public void enterEmployeeName(String name) {
		  employeeName.sendKeys(name);
	  }
	  
	  public void selectUserRoleAdmin() {
		  userRoleDropdown.click();
		  adminOption.click();

	  }
	  
	  public void selectStatusEnabled() {
		    statusDropdown.click();
		    enabledOption.click();
		}

	  
	  public void enterUserName(String user) {
	        username.sendKeys(user);

	  }
	  
	  public void enterPassword(String pass) {
		  password.sendKeys(pass);
		  confirmPassword.sendKeys(pass);
	  }
	  
	  
	 public void clickSave() {
		 saveButton.click();
	 }
	 
	
}




//@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']") @CacheLookup private WebElement dashboard;
//@FindBy(xpath="//li[1]//a[1]//span[1]") @CacheLookup private WebElement admin;