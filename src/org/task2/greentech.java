package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greentech {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("GreensTechnology. ");
	
	
	
	
	
	
	
	
}
}
