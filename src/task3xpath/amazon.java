package task3xpath;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\selenium\\driverrrr\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486390870450&hvpos=&hvnetw=g&hvrand=6562245876671616895&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjwopWSBhB6EiwAjxmqDdeDWTEDDMQcv0pykBNtQOEsIMyPs5sOPsAEqrIXy8a7inibx1VSZhoCrBIQAvD_BwE");
	WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
	text.sendKeys("iphone");
	WebElement text1 = driver.findElement(By.xpath("//input[@type='submit']"));
	text1.click();
	
	
	
}
}
