package com.FrameWork.Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements FrameWorkConstants{
	
	public static WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void openBrowser(@Optional("chrome")String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty(ChromeBrowserKey,ChromeBrowserValue);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty(FirefoxBrowserKey,FirefoxBrowserValue);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			}
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
	}
	

}
