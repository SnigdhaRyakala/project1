package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownEbay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // WebDriver driver;
		  String baseUrl;
		  //driver = new FirefoxDriver();
		  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  baseUrl = "http://www.ebay.com/";
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get(baseUrl + "/");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("register")).click();
	      driver.findElement(By.id("arrowphoneFlagComp1")).click();
		  driver.findElement(By.cssSelector("#country-flag-in-phoneFlagComp1 > span.country-name")).click();

	}

}
