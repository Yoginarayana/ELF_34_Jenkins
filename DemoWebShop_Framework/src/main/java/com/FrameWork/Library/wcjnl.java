package com.FrameWork.Library;

import java.io.IOException;

import com.PomPage.DWS_WelcomePage;

public class wcjnl extends BaseTest {
	public static void main(String[] args) throws IOException {
		DWS_WelcomePage d1 = new DWS_WelcomePage(driver);
		driver.get(ReadPropertyFile.getUrl("url"));
		d1.getBooksLink().click();
		Utility_Methods.selectByVisibleText(null, ChromeBrowserKey);
		
	}

}
