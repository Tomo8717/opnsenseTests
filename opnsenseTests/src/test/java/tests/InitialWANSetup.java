package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.LoginAction;

public class InitialWANSetup extends LoginAction {
	@Test(groups="regression")
	public void initialWANSetup() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		driver.get(url+"index.php");
		//this SHOULD be default page, but just in case
		
		String wan_ip = null;
		//Initializing string in which we would later store our WAN address
		
		wan_ip = driver.findElement(By.xpath("//*[@id=\"interface_widget_item_WAN\"]/td[5]/text()[1]")).getText();
		System.out.println(wan_ip);
		//debug, to check the text we got from element above
		
		driver.get(url+"interfaces.php?if=wan");
		//going to WAN interface page, later we are going to make a new rule for it to make it accessible
		//but first let's untick couple of checkboxes and save the changes
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("blockpriv")));
		driver.findElement(By.id("blockpriv")).click();
		driver.findElement(By.id("blockbogons")).click();
		driver.findElement(By.id("save")).click();
		//ADD ACCEPT CHANGES
		
		driver.get(url+"firewall_rules_edit.php?if=wan");
		//now to the rules, straight to a new rule form
		//default pass rule should do, just open a form and clicking "save" is enough
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Submit")));
		driver.findElement(By.name("Submit")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn_apply")));
		driver.findElement(By.id("btn_apply")).click();
		
	}
}
