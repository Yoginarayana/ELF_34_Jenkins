package com.FrameWork.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends Utility_Methods {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
