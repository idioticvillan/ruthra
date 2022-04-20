package org.task1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amzonnn {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\selenium\\\\driverrrr\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		//driver.quit();
		
		
		
		
	}

}
