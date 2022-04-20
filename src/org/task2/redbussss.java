package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbussss {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	WebElement text = driver.findElement(By.id("src"));
	text.sendKeys("villupuram");
	
	WebElement text1 = driver.findElement(By.id("dest"));
	text1.sendKeys("tiruvannamalai");
	
	
	
}
}
