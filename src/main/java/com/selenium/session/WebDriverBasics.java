package com.selenium.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		 BrowserUtility br = new BrowserUtility();
		 
		WebDriver driver=br.launchBrowser("chrome");
		br.setPageUrl("https://opensource-demo.orangehrmlive.com/");
		System.out.println(br.getPageTitle());
		
		By userName=By.id("txtUsername");
		By pwd=By.id("txtPassword");
		
		ElementUtility ele=new ElementUtility(driver);
		ele.getKeys(userName, "swathi");
		ele.getKeys(pwd, "sandeep");
		
		

	}

}
