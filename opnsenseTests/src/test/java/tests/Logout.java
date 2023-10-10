package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Logout extends Login{
	
	@Test(groups="smoke")
	public void logout() {
		WebElement logout = driver.findElement(By.xpath("/html/body/main/aside/div/nav/div/div/div[1]/a[4]/div/div/div[2]/span"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(logout)).isDisplayed();
		
		logout.click();
		
		// for debug
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
