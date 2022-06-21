package com.FrameWork.Library;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.PomPage.DWS_HomePage;
import com.PomPage.DWS_Login;
import com.PomPage.DWS_WelcomePage;

public class BaseLogin extends BaseTest implements FrameWorkConstants{
	@BeforeMethod
	public void Login() throws IOException {
		driver.get(ReadPropertyFile.getUrl("url"));
		DWS_WelcomePage welcome = new DWS_WelcomePage(driver);
		welcome.clickMethod(welcome.getLoginLink());
		DWS_Login login = new DWS_Login(driver);
		login.sendKeysMethod(login.getEmailTextField(), "yoginarayana03@gmail.com");
		login.sendKeysMethod(login.getPasswordTextField(), "password");
		login.clickMethod(login.getLoginButton());
	}
	@AfterMethod
	public void Logout(){
		DWS_HomePage home = new DWS_HomePage(driver);
		home.clickMethod(home.getLogoutLink());
		
	}

}
