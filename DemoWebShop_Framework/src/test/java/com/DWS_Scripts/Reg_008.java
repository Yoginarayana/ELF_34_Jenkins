package com.DWS_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.FrameWork.Library.BaseLogin;
import com.PomPage.DWS_ElectronicsPage;
import com.PomPage.DWS_HomePage;

public class Reg_008 extends BaseLogin{
	@Test
	public void TC_008() {
		DWS_HomePage home = new DWS_HomePage(driver);
		home.clickMethod(home.getElectronicsLink());
		DWS_ElectronicsPage elec = new DWS_ElectronicsPage(driver);
		elec.getCameraAndPhoto().click();
		elec.getDigitaDslrCamera().click();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", elec.getAddToWishlist());
		elec.clickMethod(elec.getAddToCartButton());
		home.clickMethod(home.getCartLink());
		try {
			if(elec.getAddToCartVerify().isDisplayed())
				System.out.println("Pass : The product has been added to cart");
		} catch (Exception e) {
			System.out.println("Fail : The product has not been added to cart");
		}
	}

}
