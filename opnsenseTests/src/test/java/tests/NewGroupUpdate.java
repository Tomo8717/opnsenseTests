package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewGroupUpdate extends LoginAction {
	@Test(groups={"regression","group_crud"}, priority = 2)
	public void newGroupUpdate() {
		driver.get(url+"system_groupmanager.php");
		//going to group manager
		driver.findElement(By.xpath("//*[@href=\"system_groupmanager.php?act=edit&groupid=1\"]")).click();
		//and clicking on edit button for our newly created group
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("name")))).isDisplayed();
		
		driver.findElement(By.xpath("//*[@name=\"description\"] [@type=\"text\"]")).clear();
		driver.findElement(By.xpath("//*[@name=\"description\"] [@type=\"text\"]")).sendKeys("Changed description");
		driver.findElement(By.id("save")).click();
		// changing description, saving changes, getting out of edit group form 
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-groupid=\"1\"]")))).isDisplayed();
		Assert.assertEquals(driver.getPageSource().contains("TestGroup")&driver.getPageSource().contains("Changed description"), true);
		// checking that our changes took effect on group manager page.
		
	}
}
