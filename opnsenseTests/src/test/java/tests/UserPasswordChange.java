package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.DriverSetupAndQuit;

public class UserPasswordChange extends DriverSetupAndQuit{
	@Test(groups={"regression","user_password"}, priority = 1)
	public void newUser() {
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		driver.get(url+"system_usermanager.php");
		//open user manager page
		driver.findElement(By.xpath("//*[@id=\"iform2\"]/table/thead/tr/th[4]/a/i")).click();
		//click on create new user button 
		
		WebElement usernamefield = driver.findElement(By.id("usernamefld"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(usernamefield)).isDisplayed();
		//adding wait to give time for new form to open
		
		usernamefield.sendKeys("NewUser");
		driver.findElement(By.id("passwordfld1")).sendKeys("pass");
		driver.findElement(By.id("passwordfld2")).sendKeys("pass");
		
		driver.findElement(By.name("descr")).sendKeys("User1Name");
		
		driver.findElement(By.xpath("//*[@id=\"notgroups\"]/option")).click();
		driver.findElement(By.xpath("//*[@id=\"add_groups\"]/span")).click();
		
		driver.findElement(By.id("save_close")).click();
		//filling mandatory fields, saving and exiting
		
		Assert.assertEquals(driver.getPageSource().contains("NewUser"), true);
		//Checking that new user exists after save&exit on usermanager page
		
		driver.get(url+"index.php?logout");
	}
	
	@Test(groups={"regression","user_password"}, priority = 2)
	public void newLogin() {
		driver.manage().window().maximize();
		driver.get(url);
		/*
		 * driver.findElement(By.id("details-button")).click();
		 * driver.findElement(By.id("proceed-link")).click();
		 */
		driver.findElement(By.id("usernamefld")).sendKeys("NewUser");
		driver.findElement(By.id("passwordfld")).sendKeys("pass");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Lobby | OPNsense.localdomain");
		
		//logged in under NewUser
		
		driver.get(url+"system_usermanager_passwordmg.php");
		driver.findElement(By.id("passwordfld0")).sendKeys("pass");
		driver.findElement(By.id("passwordfld1")).sendKeys("pass1");
		driver.findElement(By.id("passwordfld2")).sendKeys("pass1");
		driver.findElement(By.name("save")).click();
		Assert.assertEquals(driver.getPageSource().contains("Saved settings for user"), true);
		
		//going to password page, changing password, saving, checking for a confirmation
		
		driver.get(url+"index.php?logout");
		//GTFO
	}
	
	@Test(groups={"regression","user_password"}, priority = 3)
	public void newPassword() {
		driver.manage().window().maximize();
		driver.get(url);
		/*
		 * driver.findElement(By.id("details-button")).click();
		 * driver.findElement(By.id("proceed-link")).click();
		 */
		driver.findElement(By.id("usernamefld")).sendKeys("NewUser");
		driver.findElement(By.id("passwordfld")).sendKeys("pass1");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		//Logging in using changed password 
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Lobby | OPNsense.localdomain");
		
		//if everything is okay we are on dashboard page rn
		
		driver.get(url+"index.php?logout");
	}
	
	@Test(groups={"regression","user_password"}, priority = 4)
	public void newUserDeletion() {
		
		driver.get(url);
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		driver.get(url+"system_usermanager.php");
		//go to usermanager page, user already created in NewUserCreation case
		
		driver.findElement(By.xpath("//*[@data-username=\"NewUser\"]")).click();
		//clicking delete button for TestUser
		//new alert opens
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-open")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]")));
		
		WebElement yesbutton = driver.findElement(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]"));
		yesbutton.click();
		
		driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iform2\"]")));
		
		Assert.assertEquals(driver.getPageSource().contains("User1Name"), false);
		
		driver.get(url+"index.php?logout");
	}

}
