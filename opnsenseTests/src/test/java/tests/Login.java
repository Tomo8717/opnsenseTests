package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import common.DriverSetupAndQuit;

public class Login extends DriverSetupAndQuit {
	
	@Test(groups="smoke")
	public void login() {
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
