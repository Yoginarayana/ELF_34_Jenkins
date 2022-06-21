package com.PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FrameWork.Library.BasePage;

public class DWS_ElectronicsPage extends BasePage{
	public DWS_ElectronicsPage(WebDriver driver) {
		super(driver);
	} 
	
	@FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Camera')]")
	private WebElement cameraAndPhoto;
	
	@FindBy(xpath = "//div[@class='sub-category-item']//a[contains(text(),'Camera')]")
	private WebElement digitaDslrCamera;
	
	@FindBy(xpath = "(//input[contains(@id,'add-to-wishlist')])[2]")
	private WebElement addToWishlist;
	
	@FindBy(xpath = "//td[@class='product']//a[text()='Digital SLR Camera - Black']")
	private WebElement addToWishlistVerify;
	
	@FindBy(xpath = "(//input[contains(@id,'add-to-cart-button')])[2]")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//td[@class='product']//a[text()='Digital SLR Camera - Black']")
	private WebElement addToCartVerify;

	public WebElement getAddToCartVerify() {
		return addToCartVerify;
	}

	public void setAddToCartVerify(WebElement addToCartVerify) {
		this.addToCartVerify = addToCartVerify;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public void setAddToCartButton(WebElement addToCartButton) {
		this.addToCartButton = addToCartButton;
	}

	public WebElement getAddToWishlistVerify() {
		return addToWishlistVerify;
	}

	public void setAddToWishlistVerify(WebElement addToWishlistVerify) {
		this.addToWishlistVerify = addToWishlistVerify;
	}

	public WebElement getCameraAndPhoto() {
		return cameraAndPhoto;
	}

	public void setCameraAndPhoto(WebElement cameraAndPhoto) {
		this.cameraAndPhoto = cameraAndPhoto;
	}

	public WebElement getDigitaDslrCamera() {
		return digitaDslrCamera;
	}

	public void setDigitaDslrCamera(WebElement digitaDslrCamera) {
		this.digitaDslrCamera = digitaDslrCamera;
	}

	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public void setAddToWishlist(WebElement addToWishlist) {
		this.addToWishlist = addToWishlist;
	}

}
