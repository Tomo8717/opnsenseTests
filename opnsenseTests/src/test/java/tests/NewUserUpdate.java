package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewUserUpdate extends LoginAction {
	@Test(groups={"regression","user_crud"}, priority = 2)
	public void newUserUpdate() {
		
		driver.get("https://192.168.23.128/system_usermanager.php");
		driver.findElement(By.xpath("//*[@href=\"system_usermanager.php?act=edit&userid=1\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("usernamefld")))).isDisplayed();
		WebElement webelement = driver.findElement(By.id("usernamefld"));
		
		//adding wait to give time for new form to open
		
		webelement.clear();
		webelement.sendKeys("TestUser()");
		driver.findElement(By.xpath("//*[@id=\"save\"]")).sendKeys(Keys.RETURN);
		
		/*
		 * trying to save a user with invalid symbols in name apparently .clear() causes
		 * some problems for driver to click on save button so i'm using
		 * sendKeys.(Keys.RETURN) instead
		 */		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-dismiss=\"alert\"]")))).isDisplayed();
		Assert.assertEquals(driver.getPageSource().contains("The username contains invalid characters."), true);
		driver.findElement(By.xpath("//*[@data-dismiss=\"alert\"]"));
		//wait, check if popup for input errors in Username is actually here and dismiss it after
		//can be a test of it's own, but it's all part of regress and a test group for user operations, so
		
		driver.findElement(By.id("usernamefld")).clear();
		driver.findElement(By.id("usernamefld")).sendKeys("TestUser1");
		driver.findElement(By.id("passwordfld1")).sendKeys("pass1");
		driver.findElement(By.id("passwordfld2")).sendKeys("pass1");
		
		driver.findElement(By.name("descr")).clear();
		driver.findElement(By.name("descr")).sendKeys("FullName1");
		driver.findElement(By.id("expires")).sendKeys("01/01/2025");
		
		driver.findElement(By.id("save_close")).sendKeys(Keys.RETURN);
		
		driver.navigate().refresh();
		
		Assert.assertEquals(driver.getPageSource().contains("TestUser1")&driver.getPageSource().contains("FullName1"), true);
		
	}
	
}
