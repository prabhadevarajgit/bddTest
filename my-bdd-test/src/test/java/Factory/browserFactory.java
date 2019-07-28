package Factory;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserFactory {
	
		private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

		/*
		 * Factory method for getting browsers
		 */
		public static WebDriver getBrowser(String browserName) {
			WebDriver driver = null;

			switch (browserName) {
			case "Firefox":
				driver = drivers.get("Firefox");
				if (driver == null) {
					System.setProperty("webdriver.gecko.driver","D:/Santhanaprabha/Automation/geckodriver.exe");
			        driver = new FirefoxDriver();
					drivers.put("Firefox", driver);
				}
				break;
			case "IE":
				driver = drivers.get("IE");
				if (driver == null) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					drivers.put("IE", driver);
				}
				break;
			case "Chrome":
				driver = drivers.get("Chrome");
				if (driver == null) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\abc\\Desktop\\Server\\ChromeDriver.exe");
					driver = new ChromeDriver();
					drivers.put("Chrome", driver);
				}
				break;
			}
			return driver;
		}
	}


