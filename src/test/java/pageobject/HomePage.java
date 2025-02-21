package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage { //constructor for invoking browser
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='My Account']") //Locators of page
	WebElement lnkMyaccount;
    @FindBy (xpath="//a[normalize-space()='Register']")
    WebElement lnkRegister;
    
    //Action on locators
    public void clickMyAccount() {
    	lnkMyaccount.click();
    }
    public void clickRegister() {
    	lnkRegister.click();
    
    }
}

