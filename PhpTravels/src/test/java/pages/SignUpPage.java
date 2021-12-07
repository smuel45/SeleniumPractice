package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

	@FindBy(name = "first_name")
	private WebElement firstName;
	@FindBy(name = "last_name")
	private WebElement lastName;
	@FindBy(name = "phone")
	private WebElement phone;
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(name = "password")
	private WebElement password;
	
	public void signup() {
		firstName.sendKeys("Sam");
		lastName.sendKeys("Cooke");
		phone.sendKeys("07900546375");
		email.sendKeys("samc.email@cmail.com");
		password.sendKeys("fake_password123");
		password.submit();
	}
}
