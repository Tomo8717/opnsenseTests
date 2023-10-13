package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NetflowSetup extends LoginAction {
	
	@Test(groups="regression")
	public void netflowSetup() {
		driver.get("https://192.168.23.128/ui/diagnostics/netflow#");
		//getting to NetFlow page
		
		WebElement ddown = driver.findElement(By.id("netflow.capture.interfaces"));
		Select selector = new Select(ddown);
		selector.selectByVisibleText("LAN");
		selector.selectByVisibleText("WAN");
		//selecting LAN&WAN for listening i-faces
		
		ddown = driver.findElement(By.id("netflow.capture.egress_only"));
		selector = new Select(ddown);
		selector.selectByVisibleText("WAN");
		//selecting WAN for WAN i-faces
		
		driver.findElement(By.xpath("//*[@id=\"netflow.collect.enable\"]")).click();
		//don't forget to mark the magic checkbox for local traffic
		
		driver.findElement(By.id("btn_save_capture")).click();
		//and saved. all that good and all, however we cannot confirm changes made on this page
		//so we go to previously empty ui/diagnostics/networkinsight to see our netflow stats and if they are there at all
		
		driver.get("https://192.168.23.128/ui/diagnostics/networkinsight");
		//network stats. until netflow is setup there is nothing there to see, only alert and url to netflow page.
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"totals\"]")));
        //giving some time for panels to load
        
        Assert.assertEquals(driver.getPageSource().contains("Interface totals"), true);
        //just checking if panel is active would be enough
		
	}

}
