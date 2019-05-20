package rough;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class calender {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.get("http://www.makemytrip.com");
	driver.manage().deleteAllCookies();
	Thread.sleep(15000);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@name,'notification-frame')]")));
	Thread.sleep(4000);
	WebElement closeBtn=driver.findElement(By.xpath("//*[contains(@id,'webklipper-publisher') and @class='close']"));
	if(closeBtn.isDisplayed())
		{
		closeBtn.click();
		System.out.println("frame has been closed");
		}
	
	/*DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	String date1 = dateformat.format(date);
	System.out.println(date1);
	driver.findElement(By.xpath("//*[@class='fsw_inputBox dates inactiveWidget ']")).click();*/
	
	

}
}
