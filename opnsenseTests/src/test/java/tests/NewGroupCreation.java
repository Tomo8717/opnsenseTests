package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewGroupCreation extends LoginAction {
	@Test(groups={"regression","group_crud"}, priority = 1)
	public void newGroupCreation() {
		driver.get(url+"system_groupmanager.php");
		//going to groups page 
		
		driver.findElement(By.xpath("//*[@data-original-title=\"Add\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("name")))).isDisplayed();
		
		driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("TestGroup");
		driver.findElement(By.xpath("//*[@name=\"description\"] [@type=\"text\"]")).sendKeys("Description of TestGroup");
		
		driver.findElement(By.id("save")).click();
		//creating and saving group w/ parameters
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-groupid=\"1\"]")))).isDisplayed();
		Assert.assertEquals(driver.getPageSource().contains("TestGroup")&driver.getPageSource().contains("Description of TestGroup"), true);
		
	}
}
