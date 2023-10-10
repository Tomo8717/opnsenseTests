package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
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
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Lobby | OPNsense.localdomain");
		
	}
}
