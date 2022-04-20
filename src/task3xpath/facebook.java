package task3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement text = driver.findElement(By.id("email"));
		text.sendKeys("ruthrakumar96@gmail.com");
		WebElement text1 = driver.findElement(By.id("pass"));
		text1.sendKeys("-----------------");
		WebElement text2 = driver.findElement(By.xpath("//button[@name='login']"));
		text2.click();
		
		
		
		
		
		
	}

}
