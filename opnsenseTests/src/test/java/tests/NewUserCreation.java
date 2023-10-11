package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewUserCreation extends LoginAction {
	@Test(groups={"regression","user_crud"}, priority = 1)
	public void newUserCreation() {
		
		driver.get("https://192.168.23.128/system_usermanager.php");
		//open user manager page
		driver.findElement(By.xpath("//*[@id=\"iform2\"]/table/thead/tr/th[4]/a/i")).click();
		//click on create new user button 
		
		WebElement usernamefield = driver.findElement(By.id("usernamefld"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(usernamefield)).isDisplayed();
		//adding wait to give time for new form to open
		
		usernamefield.sendKeys("TestUser");
		driver.findElement(By.id("passwordfld1")).sendKeys("pass");
		driver.findElement(By.id("passwordfld2")).sendKeys("pass");
		
		driver.findElement(By.name("descr")).sendKeys("FullName");
		
		driver.findElement(By.xpath("//*[@id=\"notgroups\"]/option")).click();
		driver.findElement(By.xpath("//*[@id=\"add_groups\"]/span")).click();
		
		driver.findElement(By.id("save_close")).click();
		//filling mandatory fields, saving and exiting
		
		Assert.assertEquals(driver.getPageSource().contains("TestUser"), true);
		//Checking that new user exists after save&exit on usermanager page
		
	}
	
}
