package org.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;

public class selenium {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement button = driver.findElement(By.xpath("(//a[text()='All Branches'])[1]"));
		button.click();
		
		Thread.sleep(4000);
		WebElement j = driver.findElement(By.xpath("(//h5[text()='Greens Technologys In'])[1]"));
		String t = j.getText();
		System.out.println(t);
		
		
		
		
		

	}

}
