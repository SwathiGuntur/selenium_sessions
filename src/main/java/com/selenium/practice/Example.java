package com.selenium.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		List<WebElement> optionsList=driver.findElements(By.tagName("option"));
				System.out.println(optionsList.size());
				Map<Integer,String> obj=new HashMap<Integer,String>();
				int count=1;
				for(WebElement ele: optionsList){

				if(obj.containsValue(ele.getText())){

				System.out.println("repeted value in dropdown"+ele.getText());
				}

				else {

				obj.put(count,ele.getText());
				count++;
				}



				}
				
				System.out.println(obj);

	}

}
