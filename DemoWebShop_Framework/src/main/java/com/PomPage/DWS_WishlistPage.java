package com.PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FrameWork.Library.BasePage;

public class DWS_WishlistPage extends BasePage {
	
	public DWS_WishlistPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='addtocartbutton']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateWishlistButton;
	
	@FindBy(xpath = "//td//input[@name='addtocart']")
	private WebElement addToCartCheckBox;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public WebElement getUpdateWishlistButton() {
		return updateWishlistButton;
	}

	public void setUpdateWishlistButton(WebElement updateWishlistButton) {
		this.updateWishlistButton = updateWishlistButton;
	}

	public WebElement getAddToCartCheckBox() {
		return addToCartCheckBox;
	}

	public void setAddToCartCheckBox(WebElement addToCartCheckBox) {
		this.addToCartCheckBox = addToCartCheckBox;
	}
	
	

}
