package task3xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumcourse {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Dell\\\\\\\\eclipse-workspace\\\\\\\\selenium\\\\\\\\driverrrr\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
}
}
