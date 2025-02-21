package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage {
	public Registration(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement fname;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lname;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement pass;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confpass;
	@FindBy(xpath = "//input[@value='0']")
	WebElement NewsLetterNo;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement Policy;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue;
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
	WebElement getConfmessage;
	public String getConfmessage() {
		try { 
			return (getConfmessage.getText());
		}
			catch (Exception e) {
		     return(e.getMessage());
	}
		}
	
	public void setFirstName(String fname) {
		this.fname.sendKeys(fname);
	}

	public void setLastName(String lname) {
		this.lname.sendKeys(lname);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public void setphone(String phone) {
		this.phone.sendKeys(phone);
	}
	public void setpass(String pass) {
		this.pass.sendKeys(pass);
	}
	public void confpass(String confpass) {
		this.confpass.sendKeys(confpass);
	}
	public void NewsLetter() {
		NewsLetterNo.click();
	}
	public void Policy() {
		this.Policy.click();
	}
	public void Continue() {
		this.Continue.click();
	}
}
