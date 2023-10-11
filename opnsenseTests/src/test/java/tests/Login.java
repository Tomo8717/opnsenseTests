package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class Login extends LoginAction {
	
	@Test(groups="smoke")
	public void loginTest() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Dashboard | Lobby | OPNsense.localdomain");
		
	}
}
