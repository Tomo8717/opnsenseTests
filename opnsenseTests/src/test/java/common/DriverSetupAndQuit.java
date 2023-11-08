package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetupAndQuit {
public static WebDriver driver = null;
	
	public String login, password, url;
	
	@BeforeSuite
	public void launchBrowser () {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		//WebDriverManager.chromedriver().clearResolutionCache().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@AfterSuite
	public void closingBrowser() {
		driver.quit();
	}
	
	@BeforeSuite
	public void getProperties() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\java\\properties\\TestData.properties");
		Properties p = new Properties();
		p.load(fis);
		login = p.getProperty("login");
		password = p.getProperty("password");
		url = p.getProperty("url");
	}
	
	}