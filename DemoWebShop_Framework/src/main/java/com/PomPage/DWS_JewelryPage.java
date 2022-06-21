package com.PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FrameWork.Library.BasePage;
import com.FrameWork.Library.BaseTest;

public class DWS_JewelryPage extends BasePage {
	public DWS_JewelryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2//a[text()='Black & White Diamond Heart']")
    private WebElement BlackAndWhiteJewelry;
	
	@FindBy(xpath = "//input[@value='Add to wishlist']")
	private WebElement addToWishlist;
	
	public WebElement getAddToWishlist() {
		return addToWishlist;
	}

	public void setAddToWishlist(WebElement addToWishlist) {
		this.addToWishlist = addToWishlist;
	}

	@FindBy(xpath = "//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")
	private WebElement AddToCartJewelryPage;
	
	@FindBy(xpath = "//div[@class='add-to-cart']//input[contains(@name,'addtocart')]")
	private WebElement quantityTextBox;
	
	@FindBy(xpath = "//h1[contains(text(),'Black')]/../..//input[contains(@id,'add-to-cart-button')]")
	private WebElement AddToCartProductPage;
	
	@FindBy(xpath = "//td//a[text()='Black & White Diamond Heart']")
	private WebElement productAddedToWishlist;
	
	@FindBy(xpath = "//td//a[text()='Black & White Diamond Heart']")
	private WebElement productAddedToCart;

	public WebElement getProductAddedToCart() {
		return productAddedToCart;
	}

	public void setProductAddedToCart(WebElement productAddedToCart) {
		this.productAddedToCart = productAddedToCart;
	}

	public WebElement getProductAddedToWishlist() {
		return productAddedToWishlist;
	}

	public void setProductAddedToWishlist(WebElement productAddedToWishlist) {
		this.productAddedToWishlist = productAddedToWishlist;
	}

	public WebElement getBlackAndWhiteJewelry() {
		return BlackAndWhiteJewelry;
	}

	public void setBlackAndWhiteJewelry(WebElement blackAndWhiteJewelry) {
		BlackAndWhiteJewelry = blackAndWhiteJewelry;
	}

	public WebElement getAddToCartJewelryPage() {
		return AddToCartJewelryPage;
	}

	public void setAddToCartJewelryPage(WebElement addToCartJewelryPage) {
		AddToCartJewelryPage = addToCartJewelryPage;
	}

	public WebElement getQuantityTextBox() {
		return quantityTextBox;
	}

	public void setQuantityTextBox(WebElement quantityTextBox) {
		this.quantityTextBox = quantityTextBox;
	}

	public WebElement getAddToCartProductPage() {
		return AddToCartProductPage;
	}

	public void setAddToCartProductPage(WebElement addToCartProductPage) {
		AddToCartProductPage = addToCartProductPage;
	}

	
	
}
