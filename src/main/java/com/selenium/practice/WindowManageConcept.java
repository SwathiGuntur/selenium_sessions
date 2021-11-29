package com.selenium.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowManageConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Dimension d= driver.manage().window().getSize();
		int WindowHeight=d.getHeight();
		int WindowWidth=d.getWidth();
		System.out.println(WindowHeight+" "+WindowWidth);
		Dimension d1=new Dimension(d.getHeight()-60,d.getWidth()-100);
		driver.manage().window().maximize();
		driver.manage().window().setSize(d1);

	}

}
