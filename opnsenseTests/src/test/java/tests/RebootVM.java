package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.LoginAction;

public class RebootVM extends LoginAction {
	@Test(groups="regression")
	public void rebootVM() {
		driver.get(url+"ui/core/reboot");
		//going to big red button page
		
		driver.findElement(By.id("do-reboot")).click();
		//pushing big red button
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"totals\"]")));
		wait.until(ExpectedConditions.urlToBe(url));
	}
}
