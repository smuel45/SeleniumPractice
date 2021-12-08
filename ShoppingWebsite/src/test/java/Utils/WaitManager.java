package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitManager {

	public static void fluentWait(WebDriver driver, WebElement element) {
		new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class).until(ExpectedConditions.visibilityOf(element));
	}

}
