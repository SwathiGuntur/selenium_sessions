package com.selenium.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		// System.out.println("Title of Parent Window: " + driver.getTitle());
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> windowsList = driver.getWindowHandles();
		
		                          
		System.out.println(windowsList.size());
		/*
		 * Iterator<String> iterator = windowsList.iterator(); String parentWindow =
		 * iterator.next(); System.out.println("Title of Parent Window: " +
		 * driver.getTitle());
		 * 
		 * int count=1; while(iterator.hasNext()) {
		 * 
		 * String childWindow = iterator.next(); driver.switchTo().window(childWindow);
		 * Thread.sleep(50000); System.out.println("Title of child Window"+count+":   "+
		 * driver.getTitle()); //driver.close(); driver.switchTo().window(parentWindow);
		 * System.out.println("Title of Parent Window: " + driver.getTitle());
		 * count=count+1; }
		 * 
		 * String childWindow=null; while(iterator.hasNext()) {
		 * childWindow=iterator.next(); System.out.println(childWindow.toString());
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(driver.switchTo().window(childWindow).getTitle());
		 * driver.close();
		 */
		
		List<String> windows=new ArrayList<String>(windowsList);
//		ListIterator<String> listIter=windows.listIterator();
		

//		String parentWindow=listIter;
		for(int i=windowsList.size()-1;i>=0;i--) {
			
			String value=windows.get(i);
			driver.switchTo().window(value);
			System.out.println(driver.getTitle());
			driver.close();
		}
		
		

	}

}
