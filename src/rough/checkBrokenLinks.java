package rough;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.ws.Response;

import org.apache.http.HttpClientConnection;
import org.apache.http.client.HttpClient;
import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import sun.net.www.protocol.http.HttpURLConnection;
import java.net.HttpURLConnection;

public class checkBrokenLinks {
	
	static int statuscode;
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("site has been opened up");
	  List<WebElement> links=	driver.findElements(By.tagName("a"));
	  links.addAll(driver.findElements(By.tagName("href")));
	  System.out.println("going to check links");
	  for(int i=0; i<links.size(); i++)
	  {
		 String url = links.get(i).getAttribute("href");
		 checkURLStatus(url);
		  // checkURLStatus(links.get(i).getAttribute("href"));
		 // System.out.println(links.get(i).getAttribute("href"));
		
		 
	  }
	  System.out.println("links has been verified");
	  
	}
	
	public static void checkURLStatus(String urllink) throws IOException
	{
		URL url = new URL(urllink);
	/*	
		HttpClient client=null;
		HttpClientConnection con=new */
		HttpURLConnection connection = (HttpURLConnection)(url.openConnection());
		connection.setConnectTimeout(3000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println("link is working fine -----"+urllink);
		}
		else
		{
			System.out.println("null link has been encountered----"+urllink);
		}
		
	}

}
