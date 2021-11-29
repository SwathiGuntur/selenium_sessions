package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		WebElement ele=driver.findElement(By.id("input-email"));
		System.out.println(ele.hashCode());
		driver.navigate().refresh();
		WebElement ele1=driver.findElement(By.id("input-email"));
		System.out.println(ele1.hashCode());
		System.out.println(ele1.isEnabled());

	}

}
