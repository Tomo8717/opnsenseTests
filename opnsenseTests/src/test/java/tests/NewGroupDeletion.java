package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class NewGroupDeletion extends LoginAction {
	@Test(groups={"regression","group_crud"}, priority = 3)
	public void newGroupDeletion() {
		driver.get(url+"system_groupmanager.php");
		//going to group manager
		driver.findElement(By.xpath("//*[@data-groupname=\"TestGroup\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-open")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]")));
        
        driver.findElement(By.xpath("//*[@class=\"bootstrap-dialog-footer-buttons\"]/button[2]")).click();
        //in modal dialog clicking the yes - it's always the second button hence the code
        
        driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"iform2\"]")));
		
		Assert.assertEquals(driver.getPageSource().contains("TestGroup"), false);
		//waiting window reload and checking that we really deleted new group
	}
}
