package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewUserDeletion extends LoginAction {
	@Test(groups={"regression","user_crud"}, priority = 3)
	public void newUserDeletion() {
		driver.get(url+"system_usermanager.php");
		//go to usermanager page, user already created in NewUserCreation case
		
		driver.findElement(By.xpath("//*[@data-username=\"TestUser\"]")).click();
		//clicking delete button for TestUser
		//new alert opens
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-open")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]")));
		
		WebElement yesbutton = driver.findElement(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]"));
		yesbutton.click();
		
		driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iform2\"]")));
		
		Assert.assertEquals(driver.getPageSource().contains("FullName"), false);
		//Checking that TestUser was deleted usermanager page
		
	}
}
