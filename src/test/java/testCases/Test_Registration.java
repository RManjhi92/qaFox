package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.HomePage;
import pageobject.Registration;
import testBase.BaseClass;

public class Test_Registration extends BaseClass {
	
	@Test
	public void test_reg() {
		
		HomePage HP=new HomePage(driver);
		HP.clickMyAccount();
		HP.clickRegister();
		
		Registration RG= new Registration(driver);
		RG.setFirstName(randomstring());
		RG.setLastName(randomstring());
		RG.setEmail(randomstring()+"@yopmail.com");
		RG.setphone("987456");
		RG.setpass("123456");
		RG.confpass("123456");
		RG.NewsLetter();
		RG.Policy();
		RG.Continue();
		RG.getConfmessage();
		
		String confirmation=RG.getConfmessage();
		Assert.assertEquals(confirmation,"Your Account Has Been Created!");
	}

}
