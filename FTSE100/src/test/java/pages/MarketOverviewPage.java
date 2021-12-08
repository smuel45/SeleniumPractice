package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketOverviewPage {

	public String URL = "https://www.hl.co.uk/shares/stock-market-summary/ftse-100";

	@FindBy(xpath = "//strong[contains(text(),'Risers')]")
	private WebElement risers;

	@FindBy(xpath = "//strong[contains(text(),'Fallers')]")
	private WebElement fallers;
	
	@FindBy(id = "acceptCookieButton")
	private WebElement acceptCookies;
	
	public void acceptCookies() {
		acceptCookies.click();
	}

	public void navToRisers() {
		risers.click();
	}

	public void navToFallers() {
		fallers.click();
	}

}
