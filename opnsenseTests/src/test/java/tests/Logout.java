package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Logout extends Login{
	
	@Test(groups="smoke")
	public void logout() {
		WebElement logout = driver.findElement(By.xpath("/html/body/main/aside/div/nav/div/div/div[1]/a[4]/div/div/div[2]/span"));

		// wait until element is displayed
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		logout.click();
		
		// for debug
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
