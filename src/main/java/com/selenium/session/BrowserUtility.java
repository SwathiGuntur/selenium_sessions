package com.selenium.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;




public class BrowserUtility {

	private WebDriver driver;

	public WebDriver launchBrowser(String browserName) {
		switch (browserName) {
		case "chrome":
//			 System.setProperty("webdriver.chrome.driver",
//			 "E:\\required_softwares_for_java\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			break;
		case "firefox":
			//System.setProperty("webDriver.geckodriver.driver", "E:\\required_softwares_for_java\\Geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Invalid browser Name");

		}
		return driver;
	}

	public void setPageUrl(String url) {
		driver.get(url);
	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.quit();
	}

}
