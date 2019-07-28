package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;

public class test {

	public static WebDriver driver;
    @Given("^user is  on homepage of ebay$")
    public void user_is_on_homepage() throws Throwable {     
    	System.setProperty("webdriver.gecko.driver","D:/Santhanaprabha/Automation/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.co.uk/");
    }
	
}
