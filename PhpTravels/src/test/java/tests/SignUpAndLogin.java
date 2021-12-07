package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import config.WebDriverFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class SignUpAndLogin {

	private static WebDriver driver;
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	SignUpPage sup = PageFactory.initElements(driver, SignUpPage.class);
	LoginPage lp = PageFactory.initElements(driver, LoginPage.class);

	@BeforeClass
	public static void init() throws Exception {
		driver = WebDriverFactory.getDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
	}

	@Before
	public void setup() {
		driver.get(hp.URL);
	}

	@Test
	public void test() {
		hp.navToSignUp();
		sup.signup();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lp.login();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
