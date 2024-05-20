package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
  
   driver.findElement(By.id("APjFqb")).sendKeys("iphone 12");
   
List<WebElement>  all=   driver.findElements(By.xpath("//*[@class='OBMEnb'][1]//li"));

for(int i=0;i<all.size();i++) {
	System.out.println(all.get(i).getText());
}
   
	}

}
