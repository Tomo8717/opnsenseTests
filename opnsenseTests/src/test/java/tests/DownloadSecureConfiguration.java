package tests;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import common.DriverSetupAndQuit;

public class DownloadSecureConfiguration extends DriverSetupAndQuit {
	@Test(groups={"regression","backup"})
	public void downloadSecureConfiguration() {
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String,Object>();
        
        prefs.put("download.default_directory", "E:\\config");
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.extensions_to_open", "application/xml");
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("safebrowsing.enabled", true);
        
        //options.addArguments("incognito");
        options.setExperimentalOption("prefs",prefs);

        Map<String, Object> localState = new HashMap<>();
        List<String> experiments = new ArrayList<>();
        experiments.add("download-bubble@2");
        experiments.add("download-bubble-v2@2");
        options.addArguments("--safebrowsing-disable-download-protection");
        options.addArguments("safebrowsing-disable-extension-blacklist");
        localState.put("browser.enabled_labs_experiments", experiments);
        options.setExperimentalOption("localState", localState);

        ChromeDriver driver =  new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("usernamefld")).sendKeys(login);
		driver.findElement(By.id("passwordfld")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();

		driver.get(url+"/diag_backup.php");
		//going to backup manager page
		
		driver.findElement(By.id("encryptconf")).click();
		//encrypting config
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("encrypt_password"))).sendKeys("password");
        driver.findElement(By.name("encrypt_passconf")).sendKeys("password");
        
        driver.findElement(By.name("download")).click();
       
        try {
			Thread.sleep(Duration.ofSeconds(3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        boolean check =  isFileDownloaded("config-OPNsense");
        
        Assert.assertEquals(check, true);
        
		driver.quit();
	}
	
	public static Boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        String dirPath = "E:\\config\\"; 
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                	flag = true;
                    break;
                }
            }
        }
        return flag;
    }
	
}
