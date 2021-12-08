package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {
	
	@FindBy(xpath = "Proceed to checkout")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(className = "checker")
	public WebElement checkbox;
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	public WebElement payByBankwireButton;
	
	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	public WebElement confirmOrderButton;
	
	public void proceedToCheckout() {
		proceedToCheckoutButton.click();
	}
	
	public void login() {
		email.sendKeys("samc.email@cmail.com");
		password.sendKeys("fake_password123");
		password.submit();
	}
	
	public void agreeToCondition() {
		checkbox.click();
	}
	
	public void pay() {
		payByBankwireButton.click();
	}
	
	public void confirmOrder() {
		confirmOrderButton.click();
	}

}
