package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // WebDriver driver;
		  //driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		   WebDriver d = new ChromeDriver();
		   d.get("http://www.naukri.com/");
			d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String title=d.getTitle();
			System.out.println("Window Ttile is" +title);
			java.util.Set<String> allWindows=d.getWindowHandles();
			for(String handle:allWindows)
			{
				d.switchTo().window(handle);
				if(d.getTitle().equals("Tech Mahindra"))
				System.out.println("Inside window Title:" +d.getTitle());
			}	}

}
