package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import config.WebDriverFactory;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ResultsPage;
import Utils.WaitManager;

public class OrderDressTest {
	private static WebDriver driver;
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	ResultsPage rp = PageFactory.initElements(driver, ResultsPage.class);
	CheckoutPage cp = PageFactory.initElements(driver, CheckoutPage.class);

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
		hp.searchForItem("Dress");
		WaitManager.fluentWait(driver, rp.productCount);
		rp.addToCart();
		WaitManager.fluentWait(driver, rp.proceedToCheckoutButton);
		rp.proceedToCheckout();
		WaitManager.fluentWait(driver, cp.proceedToCheckoutButton);
		cp.proceedToCheckout();
		WaitManager.fluentWait(driver, cp.email);
		cp.login();
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
