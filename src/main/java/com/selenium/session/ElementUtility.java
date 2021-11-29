package com.selenium.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtility {
	
	private WebDriver driver;
	
	public ElementUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElements(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void getKeys(By locator,String keys) {
		getElements(locator).sendKeys(keys);
	}

}
