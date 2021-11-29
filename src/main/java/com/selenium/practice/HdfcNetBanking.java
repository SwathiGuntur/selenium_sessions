package com.selenium.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HdfcNetBanking {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@class='locate']//a")).click();
		Set<String> windowsList = driver.getWindowHandles();
		Iterator<String> iterator = windowsList.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		driver.switchTo().window(childWindow);
		//Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement state=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customState")));
		Select selectObj = new Select(state);
		selectObj.selectByVisibleText("Andhra Pradesh");
		//Thread.sleep(10000);
		WebElement city=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customCity")));
		Select selectObj1 = new Select(city);
		selectObj1.selectByValue("guntur");

	}

}
