package common;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;

public class LoginAction extends DriverSetupAndQuit {
	
	@BeforeSuite
	public void login() {
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}
}
