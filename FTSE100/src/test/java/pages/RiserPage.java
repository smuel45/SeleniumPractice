package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RiserPage {

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]")
	private WebElement CompanyName;

	@FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[5]/span[1]")
	private WebElement CompanyPercentageIncrease;

	public String getTopRiserCompany() {
		return CompanyName.getText();
	}

	public String getTopRiserPercentageIncrease() {
		return CompanyPercentageIncrease.getText();
	}

}
