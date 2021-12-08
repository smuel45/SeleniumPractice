package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ResultsPage {
	
	@FindBy(className = "product-count")
	public WebElement productCount;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	public WebElement proceedToCheckoutButton;
	
	public void itemFound(WebDriver driver) {
		new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class).until(ExpectedConditions.visibilityOf(productCount));
	}
	
	public void addToCart() {
		addToCartButton.click();
	}
	
	public void proceedToCheckout() {
		proceedToCheckoutButton.click();
	}

}
