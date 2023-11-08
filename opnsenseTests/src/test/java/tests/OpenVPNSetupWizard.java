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

public class OpenVPNSetupWizard extends LoginAction {
	@Test(groups = {"regression","VPN","OpenVPN"})
	public void serverVPNWizard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
		driver.get(url + "vpn_openvpn_server.php");
		driver.findElement(By.xpath("/html/body/main/div/section/div/div/section/div/table/thead/tr/td[5]/a[2]")).click();
		//going straight to setup OpenVPN w/ wizard page
		//let's setup Local User Access first
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("next"))).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("addnewca"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("descr"))).sendKeys("TestNameLocal");
		//we are opening a new page, so let's wait a bit to be sure that elements are loaded properly
		Assert.assertEquals(driver.findElements(By.id("keylength")).isEmpty(), false);
		//we are not changing keylength in this example, but let's check that selector is at least here
		driver.findElement(By.id("lifetime")).clear();
		driver.findElement(By.id("lifetime")).sendKeys("365");
		driver.findElement(By.id("country")).sendKeys("RS");
		driver.findElement(By.id("state")).sendKeys("Bachka");
		driver.findElement(By.id("city")).sendKeys("Subbotica");
		driver.findElement(By.id("organization")).sendKeys("BENIS xd");
		driver.findElement(By.id("email")).sendKeys("ema@il.lmao");
		driver.findElement(By.name("addnewca")).submit();
		//filling required fields and proceeding
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("next"))).click();
		//after clicking add new ca we are redirected to a new page
		//so let's wait a bit to be sure that elements are loaded properly and click next
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("interface")));
		//same as previous - new page, wait a bit for loading elements 
		WebElement ddown = driver.findElement(By.id("interface"));
		Select selector = new Select(ddown);
		selector.selectByValue("lan");
		//selector for interface
		selector = new Select(driver.findElement(By.id("protocol")));
		selector.selectByValue("TCP");
		//and a selector for protocol
		Assert.assertEquals(driver.findElements(By.id("localport")).isEmpty(), false);
		//we are not changing local port in this example, but let's check that text field is at least here
		driver.findElement(By.id("description")).sendKeys("test description");
		Assert.assertEquals(driver.findElements(By.id("tlsauthentication")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("generatetlskey")).isEmpty(), false);
		selector = new Select(driver.findElement(By.id("crypto")));
		selector.selectByValue("AES-256-GCM");
		selector = new Select(driver.findElement(By.id("digest")));
		selector.selectByValue("SHA3-256");
		driver.findElement(By.id("tunnelnet")).sendKeys("10.0.1.0/24");
		Assert.assertEquals(driver.findElements(By.id("tunnelnetv6")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("redirectgw")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("localnet")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("localnetv6")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("remotenet")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("remotenetv6")).isEmpty(), false);
		driver.findElement(By.id("concurrentcon")).sendKeys("5");
		Assert.assertEquals(driver.findElements(By.id("compression")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("tos")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("interclient")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("duplicate_cn")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("dynip")).isEmpty(), false);
		driver.findElement(By.id("defaultdomain")).sendKeys("defaultdomain");
		
		Assert.assertEquals(driver.findElements(By.id("dnsserver1")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("dnsserver2")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("dnsserver3")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("dnsserver4")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("ntpserver1")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("ntpserver2")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("nbtenable")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("nbttype")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("nbtscope")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("winsserver1")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("winsserver2")).isEmpty(), false);
		driver.findElement(By.name("next")).submit();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ovpnrule"))).click();
		//new page, wait until element is loaded
		driver.findElement(By.id("ovpnallow")).click();
		driver.findElement(By.name("next")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("finish"))).click();
		Assert.assertEquals(driver.getPageSource().contains("descr"), true);
		
	}
}
