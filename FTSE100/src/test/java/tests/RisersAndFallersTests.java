package tests;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import config.WebDriverFactory;
import pages.MarketOverviewPage;
import pages.RiserPage;

public class RisersAndFallersTests {

	private static WebDriver driver;
	MarketOverviewPage mop = PageFactory.initElements(driver, MarketOverviewPage.class);
	RiserPage rp = PageFactory.initElements(driver, RiserPage.class);

	@BeforeClass
	public static void init() throws Exception {
		driver = WebDriverFactory.getDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
	}

	@Before
	public void setup() {
		driver.get(mop.URL);
	}

	@Test
	public void testRisers() {
		mop.acceptCookies();
		mop.navToRisers();
		mop.acceptCookies();
		System.out.print("The top riser was " + rp.getTopRiserCompany() + " with a percentage increase of " + rp.getTopRiserPercentageIncrease());
	}
	
	@Test
	public void testFallers() {
		mop.acceptCookies();
		mop.navToFallers();
		mop.acceptCookies();
		System.out.print("The top faller was " + rp.getTopRiserCompany() + " with a percentage decrease of " + rp.getTopRiserPercentageIncrease());
	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
