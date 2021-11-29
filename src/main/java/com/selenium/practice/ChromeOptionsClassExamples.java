package com.selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsClassExamples {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		//co.addArguments("--headless");
		//co.addArguments("--incognito");
		//co.addArguments("start-maximized");
		/*
		 * co.addArguments("disable-infobars"); DesiredCapabilities capabilities = new
		 * DesiredCapabilities(); capabilities.setCapability(ChromeOptions.CAPABILITY,
		 * co); //ChromeDriver driver = new ChromeDriver(capabilities);
		 * co.merge(capabilities);
		 */
		
		//co.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		co.addArguments("disable-infobars");
		co.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		

	}

}
