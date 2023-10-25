package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import common.LoginAction;

public class SystemAdministrationPageElementsCheck extends LoginAction {
	@Test
	public void webGUICheck() {
		driver.get(url+"system_advanced_admin.php");
		//check if main interactable elements of the Web GUI section of the page do indeed exist
		Assert.assertEquals(driver.findElements(By.id("http_proto")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("https_proto")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.xpath("//*[@title=\"Web GUI TLS certificate\"]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.xpath("//*[@title=\"System defaults\"][@class=\"selectpicker\"]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.xpath("//*[@name=\"ssl-hsts\"]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("webguiport")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("disablehttpredirect")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("quietlogin")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("session_timeout")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("nodnsrebindcheck")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("althostnames")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("althostnames")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("compression")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("httpaccesslog")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("webguiinterface")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("nohttpreferercheck")).isEmpty(), false);
	}
	
	@Test
	public void secureShellCheck() {
		driver.get(url+"system_advanced_admin.php");
		driver.findElement(By.id("show-advanced-cryptocryptobtn")).sendKeys(Keys.ENTER);
		//check if main and advanced interactable elements of the Secure Shell section of the page do exist
		Assert.assertEquals(driver.findElements(By.name("enablesshd")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("sshlogingroup")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("sshdpermitrootlogin")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("sshpasswordauth")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("sshport")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("sshinterfaces[]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("ssh-kex[]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("ssh-ciphers[]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("ssh-macs[]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("ssh-keys[]")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.name("ssh-keysig[]")).isEmpty(), false);
	}
	
	@Test
	public void consoleCheck() {
		
	}
	
	@Test
	public void shelleCheck() {
		
	}
	
	@Test
	public void authenticationCheck() {
		
	}
	
	@Test
	public void deploymentCheck() {
		
	}

}
