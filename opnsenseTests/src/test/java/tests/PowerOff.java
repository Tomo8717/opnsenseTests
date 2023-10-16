package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class PowerOff extends LoginAction {
	@Test(groups="regression")
	public void powerOff() {
		driver.get("https://192.168.23.128/ui/core/halt");
		//going to big red button page
		
		driver.findElement(By.id("do-halt")).click();
		//pushing big red button
		
		boolean diditdie = false;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			driver.get("https://192.168.23.128/");
			wait.wait(20000);
		} catch(Exception e) {
			diditdie = true;
		}
		
		Assert.assertEquals(true, diditdie);
		
	}
}
