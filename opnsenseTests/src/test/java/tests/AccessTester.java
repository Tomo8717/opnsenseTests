package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class AccessTester extends LoginAction {
	
	@Test(groups="smoke")
	public void accessTesterNegative () {
		driver.get(url+"diag_authentication.php");
		//getting to access tester page
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys(Keys.RETURN);
		//checking login with wrong password, also sending data by pressing "Enter" in password field
		//this should work
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class=\"alert alert-danger\"]")))).isDisplayed();
		//waiting until error is displayed
		
		Assert.assertEquals(driver.getPageSource().contains("Authentication failed."), true);
		//and checking that error text is displayed
	}
	
	
	@Test(groups="smoke")
	public void accessTesterPositive () {
		driver.get("https://192.168.23.128/diag_authentication.php");
		//getting to access tester page
		driver.findElement(By.name("username")).sendKeys("root");
		driver.findElement(By.name("password")).sendKeys("opnsense");
		driver.findElement(By.id("save")).click();
		//let's authorize with correct credentials this time
		//and also click the "test" button
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class=\"alert alert-info\"]")))).isDisplayed();
		//waiting until our info is displayed
		
		Assert.assertEquals(driver.getPageSource().contains("authenticated successfully"), true);
		
	}
}
