package config;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class WebDriverFactory {

	public static WebDriver getDriver() throws Exception {
		// get the value of a property called "browser", or default to "chrome" if
		// unavailable
		String webDriver = System.getProperty("browser", "firefox");

		switch (webDriver.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.setHeadless(false);
			cOptions.addArguments("disable-infobars");
			cOptions.addArguments("disable-popup-blocking");
			cOptions.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			return new ChromeDriver(cOptions);
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.setHeadless(false);
			fOptions.addPreference("profile.default_content_settings_values.cookies", 2);
			fOptions.addPreference("network.cookie.cookieBehavior", 2);
			fOptions.addPreference("profile.block_third_party_cookies", true);
			return new FirefoxDriver(fOptions);
		default:
			throw new Exception(
					"[Fatal] No driver available: No browser property supplied and could not default to ChromeDriver");
		}
	}
}