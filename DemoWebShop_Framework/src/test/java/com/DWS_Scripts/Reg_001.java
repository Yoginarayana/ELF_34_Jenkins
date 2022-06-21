package com.DWS_Scripts;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FrameWork.Library.BaseTest;
import com.FrameWork.Library.ReadExcel;
import com.FrameWork.Library.ReadPropertyFile;
import com.PomPage.DWS_HomePage;
import com.PomPage.DWS_Register;
import com.PomPage.DWS_WelcomePage;

public class Reg_001 extends BaseTest{
	@Test(dataProvider = "TestData")
	public void TC_01(String male,String female,String firstname,String lastname,String email,String password,String conpassword) throws IOException {
		driver.get(ReadPropertyFile.getUrl("url"));
		DWS_WelcomePage welcome = new DWS_WelcomePage(driver);
		welcome.registerClick();
		DWS_Register register = new DWS_Register(driver);
		if(male.equalsIgnoreCase("true"))
		register.clickMethod(register.getMaleGender());
		else
			register.clickMethod(register.getFemaleGender());
		register.sendKeysMethod(register.getFirstName(), firstname);
		register.sendKeysMethod(register.getLastName(), lastname);
		register.emailSendKeys(email);
		register.passwordSendKeys(password);
		register.confirmPasswordSendKeys(conpassword);
		register.clickMethod(register.getRegisterButton());
		DWS_HomePage home = new DWS_HomePage(driver);
		try {
			if(home.getLogoutLink().isDisplayed())
				System.out.println("The user is able to successfully register");
		} catch (NoSuchElementException e) {
			System.out.println("The user is unable to register");
		}
		finally {
			home.clickMethod(home.getLogoutLink());
		}
		
	}
	@DataProvider(name = "TestData")
	public Object[][] data() {
		return ReadExcel.testData("Register");
	}
}
