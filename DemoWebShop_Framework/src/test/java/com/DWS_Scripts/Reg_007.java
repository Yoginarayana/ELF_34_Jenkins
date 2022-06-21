package com.DWS_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.FrameWork.Library.BaseLogin;
import com.PomPage.DWS_ElectronicsPage;
import com.PomPage.DWS_HomePage;

public class Reg_007 extends BaseLogin {
	@Test
	public void TC_05() {
	DWS_HomePage home = new DWS_HomePage(driver);
	home.clickMethod(home.getElectronicsLink());
	DWS_ElectronicsPage elec = new DWS_ElectronicsPage(driver);
	elec.getCameraAndPhoto().click();
	elec.getDigitaDslrCamera().click();
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false);", elec.getAddToWishlist());
	elec.clickMethod(elec.getAddToWishlist());
	home.clickMethod(home.getWishlistLink());
	try {
		if(elec.getAddToWishlistVerify().isDisplayed())
			System.out.println("Pass : The product has  been added to wishlist ");
	} catch (Exception e) {
		System.out.println("Fail : The product has not been added to wishlist ");
	}

}
}
