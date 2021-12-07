package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	public String URL = "https://www.phptravels.net/";

	@FindBy(xpath = "//a[@class='theme-btn theme-btn-small waves-effect']")
	private WebElement signUp;
	
	@FindBy(xpath = "//a[@class='theme-btn theme-btn-small theme-btn-transparent ml-1 waves-effect']")
	private WebElement login;

	public void navToSignUp() {
		signUp.click();
	}
	
	public void navToLogin() {
		login.click();
	}
}
