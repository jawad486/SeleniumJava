package com.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String titleText = driver.getTitle();
		System.out.println(titleText);
		
		WebElement googleSearchBox=driver.findElement(By.id("APjFqb"));
		googleSearchBox.sendKeys("iphone 14");
		
	List <WebElement> iphoneOptions=driver.findElements(By.xpath("//*[@class='OBMEnb'][1]//li"));
	/*
	 * for(WebElement ele:iphoneOptions) { System.out.println(ele.getText()); }
	 */
	
	// to count all the options we use size() method
	int count =iphoneOptions.size();
	
	 for(int i=0;i<iphoneOptions.size();i++) {
	  System.out.println(iphoneOptions.get(i).getText());

	 }	
	 
	driver.quit();
	}

}
