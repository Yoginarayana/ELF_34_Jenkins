package com.FrameWork.Library;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods extends BaseTest {
    public static Select select;
    public static Actions act = new Actions(driver);
    
	public  void clickMethod(WebElement ele) {
		ele.click();
	}
	
	public void sendKeysMethod(WebElement ele,CharSequence keysToSend) {
		ele.sendKeys(keysToSend);
	}
	
	public void selectByVisibleText(WebElement ele,String visibleText) {
		select = new Select(ele);
		select.selectByVisibleText(visibleText);
	}
	
	public void selectByIndex(WebElement ele,int index) {
		select = new Select(ele);
		select.selectByIndex(index);
	}
	
	public void selectByValue(WebElement ele,String value) {
		select = new Select(ele);
		select.selectByValue(value);
	}
	
	public List<WebElement> selectGetOptions(WebElement ele,String value) {
		select = new Select(ele);
		return select.getOptions();
	}
	
	public void actionsMoveToElement(WebElement ele) {
		act.moveToElement(ele).build().perform();
	}
	
	public void actionsClick(WebElement ele) {
		act.moveToElement(ele).click().build().perform();
	}
	
	public void actionsClickWebTarget(WebElement ele) {
		act.click(ele).build().perform();
	}
	
	public  void actionsClickAndHold(WebElement ele) {
		act.moveToElement(ele).clickAndHold().build().perform();
	}
	
	public  void actionsClickAndHoldWebTarget(WebElement ele) {
		act.clickAndHold(ele).build().perform();
	}
	
	public  void actionsContextClick(WebElement ele) {
		act.moveToElement(ele).contextClick().build().perform();
	}
	
	public  void actionsContextClickWebTarget(WebElement ele) {
		act.contextClick(ele).build().perform();
	}
	
	public  void actionsDoubleClick(WebElement ele) {
		act.moveToElement(ele).doubleClick().build().perform();
	}
	
	public  void actionsDoubleClickWebTarget(WebElement ele) {
		act.doubleClick(ele).build().perform();
	}
	
	public  void actionsDragAndDrop(WebElement source,WebElement target) {
		act.dragAndDrop(source, target).build().perform();
	}
	
	public  void actionsRelease(WebElement ele) {
		act.release(ele).build().perform();
	}
	
	public  void actionsSendKeys(WebElement ele,CharSequence keys) {
		act.moveToElement(ele).sendKeys(keys).build().perform();
	}
	
	public  void actionsSendKeysWebTarget(WebElement ele,CharSequence keys) {
		act.sendKeys(ele, keys).build().perform();
	}
	
	public  void actionsKeysUp(WebElement ele,CharSequence Keys) {
		act.keyUp(ele, Keys).build().perform();
	}
	
	public  void actionsKeysDown(WebElement ele,CharSequence Keys) {
		act.keyDown(ele, Keys).build().perform();
	}
	
	
	

}
