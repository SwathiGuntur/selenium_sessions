package com.selenium.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptApp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		JavaScriptUtility util=new JavaScriptUtility(driver);
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Login"))).click().perform();
		
		WebElement ele=driver.findElement(By.id("input-email"));
		WebElement ele1=driver.findElement(By.id("input-password"));
		
		util.flash(ele);
		util.flash(ele1);
		
		ele.sendKeys("swathi");
		ele.sendKeys("1234");
		
		
		
		/*
		 * System.out.println(util.getTitleByJS()); Thread.sleep(2000);
		 * util.refreshBrowseByJS(); util.generateAlertByJS("Hi");
		 */
		
		

	}

}
