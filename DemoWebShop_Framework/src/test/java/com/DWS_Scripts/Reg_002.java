package com.DWS_Scripts;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.UserDataHandler;

import com.FrameWork.Library.BaseTest;
import com.FrameWork.Library.ReadExcel;
import com.FrameWork.Library.ReadPropertyFile;
import com.PomPage.DWS_HomePage;
import com.PomPage.DWS_Login;
import com.PomPage.DWS_WelcomePage;

public class Reg_002 extends BaseTest {
	@Test(dataProvider = "Testdata")
	public void TC_02(String username,String password) throws IOException {
		driver.get(ReadPropertyFile.getUrl("url"));
		DWS_Login login = new DWS_Login(driver);
		DWS_WelcomePage welcome= new DWS_WelcomePage(driver);
		welcome.clickMethod(welcome.getLoginLink());
		login.getEmailTextField().sendKeys(username);
		login.getPasswordTextField().sendKeys(password);
		login.clickMethod(login.getLoginButton());
		DWS_HomePage home = new DWS_HomePage(driver);
		try {
			if(home.getLogoutLink().isDisplayed())
				System.out.println("Pass : Login successful");
		} catch (NoSuchElementException e) {
			System.out.println("Fail : Login fail");
		}
		finally {
			home.clickMethod(home.getLogoutLink());
		}
		
		
	}
	@DataProvider(name = "Testdata")
	public Object[][] dataPro() {
		return ReadExcel.testData("Login");
	}

}
