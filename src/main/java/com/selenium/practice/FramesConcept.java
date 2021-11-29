package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		List<WebElement> framesList=driver.findElements(By.tagName("frame"));
		System.out.println(framesList.size());
		String title=driver.switchTo().frame("content").getTitle();
		
		System.out.println(title);
		driver.switchTo().defaultContent();
		
		

	}

}
