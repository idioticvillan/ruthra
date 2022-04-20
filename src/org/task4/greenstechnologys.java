package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenstechnologys {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com ");
	driver.manage().window().maximize();
	
	
	WebElement gree = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
	String text1 = gree.getText();
	System.out.println(text1);
	
	
	
	
	
}
}
