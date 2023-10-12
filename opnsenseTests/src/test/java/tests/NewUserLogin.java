package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewUserLogin extends LoginAction {
	@Test(groups={"regression","user_crud"}, priority = 2)
	public void login() {
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys("TestUser");
		driver.findElement(By.id("passwordfld")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Lobby | OPNsense.localdomain");
		
	}
}
