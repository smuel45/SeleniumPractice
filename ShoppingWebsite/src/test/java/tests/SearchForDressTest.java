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
import pages.ResultsPage;

public class SearchForDressTest {

	private static WebDriver driver;
	HomePage hp = PageFactory.initElements(driver, HomePage.class);
	ResultsPage rp = PageFactory.initElements(driver, ResultsPage.class);

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
		rp.itemFound(driver);

	}

	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

}
