package com.DWS_Scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.FrameWork.Library.BaseLogin;
import com.PomPage.DWS_HomePage;
import com.PomPage.DWS_JewelryPage;
import com.PomPage.DWS_WishlistPage;

public class Reg_004 extends BaseLogin {
	@Test
	public void TC_04() {
		DWS_HomePage home = new DWS_HomePage(driver);
		home.clickMethod(home.getJewelryLink());
		System.out.println("Successfully navigated to Jewelry page");
		DWS_JewelryPage jewelry = new DWS_JewelryPage(driver);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", jewelry.getAddToCartJewelryPage());
		jewelry.getBlackAndWhiteJewelry().click();
		System.out.println("Successfully navigated to Jewelry product page");
		jewelry.getAddToWishlist().click();
		home.clickMethod(home.getWishlistLink());
		DWS_WishlistPage wishlist = new DWS_WishlistPage(driver);
		wishlist.clickMethod(wishlist.getAddToCartCheckBox());
		wishlist.clickMethod(wishlist.getAddToCartButton());
		try {
			if(jewelry.getProductAddedToCart().isDisplayed())
				System.out.println("Pass : product added to cart");
		} catch (NoSuchElementException e) {
			System.out.println("Fail : product not added to cart");
		}
		
		
	}

}
