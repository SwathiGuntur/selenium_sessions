package com.selenium.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMethodsExamples {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Select select = new Select(driver.findElement(By.id("Form_submitForm_Country")));
		// select.selectByValue("Bulgaria");
		// select.deselectByValue("Bulgaria");
		// select.selectByVisibleText("Afghanistan");
		// select.deselectByVisibleText("Afghanistan");
		// select.selectByIndex(1);
		// select.deselectByIndex(1);

		List<WebElement> selectList = select.getAllSelectedOptions();
		System.out.println(selectList.size());
		WebElement ele = select.getFirstSelectedOption();
		System.out.println(ele.getText());
		System.out.println(select.getOptions().size());
		List<WebElement> optionsList = select.getOptions();

		for (WebElement element : optionsList) {

			if (element.getText().equalsIgnoreCase("India")) {
				select.selectByVisibleText(element.getText());
				
			}

		}

		int count = 1;
		int duplicates = 0;
		Map<Integer, String> mapObject = null;
		for (WebElement element : optionsList) {

			mapObject = new HashMap<Integer, String>();

			if (mapObject.containsValue(element.getText())) {
				++duplicates;
				System.out.println("repeated countries on drop down:  " + element.getText());

			} else {
				mapObject.put(count, element.getText());
				count = count + 1;
			}

		}
		System.out.println("repeated countries count on drop down:  " + duplicates);
		System.out.println("Map Object size: " + mapObject.size());

	}

}
