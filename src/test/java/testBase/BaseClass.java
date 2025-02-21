package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	//blic Logger Logger;

	@BeforeClass
	public void setup() {
	//ogger=LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	public String randomstring() {
		String generatedString =RandomStringUtils.randomAlphabetic(5);
		return generatedString;
		}
	
}

