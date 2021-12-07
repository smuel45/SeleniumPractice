package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	
	public void login() {
		email.sendKeys("samc.email@cmail.com");
		password.sendKeys("fake_password123");
		password.submit();
	}
}
