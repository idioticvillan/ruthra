package org.task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swiggy {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement text = driver.findElement(By.id("location"));
	text.sendKeys("tambara");
	
		
		
		
	}

}
