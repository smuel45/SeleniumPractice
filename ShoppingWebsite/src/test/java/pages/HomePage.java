package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class HomePage {

	public String URL = "http://automationpractice.com/index.php";

	@FindBy(xpath = "//input[@id='search_query_top']")
	private WebElement searchTop;

	public void searchForItem(String item) {
		searchTop.sendKeys(item);
		searchTop.submit();
	}
}
