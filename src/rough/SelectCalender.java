package rough;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class SelectCalender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(4000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//*[@type='text' and @id='datepicker']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tr//td"));
		
		
		DateFormat Dformat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = new Date();
		String currentDate = Dformat.format(date);
		System.out.println(currentDate);
		String[] dates1 = currentDate.split("/");
		//String day = dates1[0];
		String day = "9";
		System.out.println("current date is :   "+day);
		//int index_date = day.
		//System.out.println(index_date);
		for(int i=0; i<dates.size(); i++)

		{
			System.out.println(dates.get(i).getText());
			if(dates.get(i).getText()==day)
			{
				dates.get(i).click();
				System.out.println("selected current date");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
