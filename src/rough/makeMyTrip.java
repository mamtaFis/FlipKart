package rough;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class makeMyTrip {
	public static WebDriver driver=null;
	
public static void main(String[] args) throws InterruptedException {
	/*System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.makemytrip.com");
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/ul/li[2]/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[1]/div[3]/label/span")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(@class,'DayPicker-Day--today')]")).click();
	WebElement date = driver.findElement(By.xpath("//*[contains(@class,'DayPicker-Day--today')]"));
	
	String currentDates = driver.findElement(By.xpath("//*[contains(@class,'DayPicker-Day--today')]")).getText();
	
	System.out.println(currentDates);
	int currentDate = Integer.parseInt(currentDates);
	System.out.println("current date is: "+currentDate);
	driver.findElement(By.xpath("//*[contains(@class,'DayPicker-Day--today')]"));*/
	addDays(1);
	
	 

}

public static void addDays(int days)
{
	/*DateFormat date1 = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	String todayDate = date1.format(date);
	String[] dates = todayDate.split("/");
	String finalDate="";
	
	System.out.println(finalDate);
	
	//System.out.println(todayDate);
	LocalDate local = LocalDate.parse(finalDate);
	LocalDate newDate = local.plusDays(days);
	newDate.parse("E MMM DD YY");
	System.out.println(newDate);*/
	
	LocalDate currentDate = LocalDate.now();
	LocalDate newDate= currentDate.plusDays(7);
	String sDate = newDate.toString();
	
	System.out.println("added date is:  "+newDate);
	DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
}
}
