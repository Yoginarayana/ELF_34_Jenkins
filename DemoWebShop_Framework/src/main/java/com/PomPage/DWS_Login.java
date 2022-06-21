package com.PomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FrameWork.Library.BasePage;

public class DWS_Login extends BasePage {
	public DWS_Login(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailTextField;
	public void emailSendKeys(String value) {
		emailTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;
	public void passwordSendKeys(String value) {
		passwordTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	public void loginButtonClick() {
		loginButton.click();
	}
	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchTextField;
	public void search(String value) {
		searchTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public void setSearchTextField(WebElement searchTextField) {
		this.searchTextField = searchTextField;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}
	public void searchButtonClick() {
		searchButton.click();
	}
	public void searchAndClick(String value) {
		searchTextField.sendKeys(value);
		searchButton.click();
	}

}
