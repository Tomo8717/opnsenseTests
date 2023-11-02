package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class CreatingNewCertificate extends LoginAction {
	@Test(groups = {"regression","certificate"})
	public void creatingNewCertificate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        
		driver.get(url + "system_camanager.php?act=new");
		//going straight to page for creating new certificate
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iform\"]/table[1]/tbody/tr[6]/td[2]/div/button")));
		WebElement ddown = driver.findElement(By.id("camethod"));
		Select selector = new Select(ddown);
		selector.selectByValue("internal");
		//selecting an option for creating new internal certificate and switching to it
		
		driver.findElement(By.id("descr")).sendKeys("Test sertificate");
		driver.findElement(By.id("lifetime")).clear();
		driver.findElement(By.id("lifetime")).sendKeys("365");
		//entering the name for our new cert and changing it's lifetime to 1 year
		
		selector = new Select(driver.findElement(By.name("dn_country")));
		selector.selectByValue("TD");
		//let's select a country for cert and make it Chad because it's funny idk
		
		driver.findElement(By.name("dn_state")).sendKeys("Chaddest state");
		driver.findElement(By.name("dn_city")).sendKeys("Chad city");
		driver.findElement(By.name("dn_organization")).sendKeys("Based department LTD");
		driver.findElement(By.name("dn_email")).sendKeys("5minmail@google.lmao");
		driver.findElement(By.name("dn_commonname")).sendKeys("internal-chad-ca");
		//filling the rest of the required fields
		
		Assert.assertEquals(driver.findElements(By.id("keytype")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("keylen")).isEmpty(), false);
		Assert.assertEquals(driver.findElements(By.id("digest_alg")).isEmpty(), false);
		//i'm not changing values in this dds, but i still want to check that they are there and available
		
		driver.findElement(By.id("submit")).sendKeys(Keys.RETURN);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("iform")));
		driver.get(url+ "system_camanager.php");
		Assert.assertEquals(driver.getPageSource().contains("Test sertificate"), true);
		//Checking that new certificate exists after save&exit
		
	}
}
