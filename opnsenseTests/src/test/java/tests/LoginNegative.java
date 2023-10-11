package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.DriverSetupAndQuit;

public class LoginNegative extends DriverSetupAndQuit {
	
	@Test(groups="smoke")
	public void login() {
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys("wrong_password");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("inputerrors")));
		
		Assert.assertEquals(driver.getPageSource().contains("Wrong username or password."), true);
		
	}
}
