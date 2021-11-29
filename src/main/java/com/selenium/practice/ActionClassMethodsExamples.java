package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassMethodsExamples {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("Form_submitForm_Country"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("window.scrollTo(0,'200')");
		//js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		Actions action=new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.id("Form_submitForm_Name"))).click().sendKeys("Swathi").build().perform();
		//action.contextClick(driver.findElement(By.xpath("//a[text()='Contact Sales']"))).build().perform();
		//action.doubleClick(driver.findElement(By.xpath("//a[text()='Contact Sales']"))).build().perform();
		action.moveToElement(driver.findElement(By.id("Form_submitForm_Country"))).click().build().perform();
		Thread.sleep(5000);
		//action.click(driver.findElement(By.id("Form_submitForm_Country"))).build().perform();
		//action.keyDown(driver.findElement(By.id("Form_submitForm_Country")),Keys.ARROW_DOWN);
		action.sendKeys(Keys.chord(Keys.ARROW_DOWN)).build().perform();
		action.sendKeys(Keys.chord(Keys.ARROW_DOWN)).build().perform();
		action.sendKeys(Keys.chord(Keys.ENTER)).build().perform();
        

	}

}
