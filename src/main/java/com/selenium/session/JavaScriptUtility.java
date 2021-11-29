package com.selenium.session;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	
	public WebDriver driver;
	JavascriptExecutor js;
	public JavaScriptUtility(WebDriver driver) {
		
		this.driver = driver;
		 js=(JavascriptExecutor)driver;
	}
	
	public String getTitleByJS() {
	
		return js.executeScript("return document.title;").toString();
	}
	
	public void refreshBrowseByJS() {
		
		js.executeScript("history.go(0)");
	}
	
	public void generateAlertByJS(String msg) {
		
		
		js.executeScript("alert('"+msg+"')");
	}
	
	public void flash(WebElement ele) {
		String bgcolor=ele.getCssValue("backgroundColor");
		for(int i=0;i<15;i++) {
			
			//changeColor("green",ele);
			changeColor(bgcolor,ele);
		}
	}
	
	
	
	
	
	public void changeColor(String color,WebElement ele) {
		
		js.executeScript("arguments[0].style.backgroundColor="+color+"",ele);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
