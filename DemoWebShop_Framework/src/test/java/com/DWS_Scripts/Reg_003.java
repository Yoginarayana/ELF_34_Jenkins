package com.DWS_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.FrameWork.Library.BaseLogin;
import com.PomPage.DWS_HomePage;
import com.PomPage.DWS_JewelryPage;

public class Reg_003 extends BaseLogin {
	@Test
	public void TC_03() throws InterruptedException {
		DWS_HomePage home = new DWS_HomePage(driver);
		home.clickMethod(home.getJewelryLink());
		System.out.println("Successfully navigated to Jewelry page");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		DWS_JewelryPage jewelry = new DWS_JewelryPage(driver);
		js.executeScript("arguments[0].scrollIntoView(false);", jewelry.getAddToCartJewelryPage());
		WebDriverWait wait = (new WebDriverWait(driver, 15));
		wait.until(ExpectedConditions.elementToBeClickable(jewelry.getBlackAndWhiteJewelry()));
		jewelry.getBlackAndWhiteJewelry().click();
		System.out.println("Successfully navigated to Jewelry product page");
		jewelry.getQuantityTextBox().click();
		jewelry.getQuantityTextBox().clear();
		jewelry.getQuantityTextBox().sendKeys("10");
		jewelry.clickMethod(jewelry.getAddToCartProductPage());
		
	}

}
