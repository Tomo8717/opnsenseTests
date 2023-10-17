package tests;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.LoginAction;

public class RestoreBackup extends LoginAction {
	@Test(groups={"regression","backup"})
	public void restoreBackup() {
		driver.get(url+"diag_backup.php");
		//going to backup page
		
		driver.findElement(By.name("conffile")).sendKeys("E:\\config\\"+configFileName("E:\\config\\"));
		//feeding first file name in config directory to system
		
		driver.findElement(By.id("decryptconf")).click();
		//clicking checkbox for decryption of config file
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("decrypt_password"))).sendKeys("password");
        //sending password for config file after a safe 3 second wait
        
        driver.findElement(By.id("restore")).click();
        //restoring config
        //there would be a system reboot by default, so let's wait for it and check that we are thrown back at login screen
        
        Assert.assertEquals(driver.getPageSource().contains("The configuration has been restored. The system is rebooting now. This may take one minute."), true);
        //got the message on reboot start
        
        try {
			Thread.sleep(Duration.ofSeconds(60));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.navigate().refresh();
        //waiting until VM is back online, refreshing
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlToBe(url+"diag_backup.php"));
        //checking that page reloads successfully. That's about it for now
        
	}
	
	public static String configFileName(String pathName) {
        String filename = null;
        File dir = new File(pathName);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
        	System.out.println("no files in directory");
        	return filename;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains("config")) {
                	filename = listFile.getName();
                    break;
                }
            }
        }
        return filename;
    }
}
