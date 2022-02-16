package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertWindow {
	
public static void main(String arg[]) throws InterruptedException
{
 // WebDriver driver;
  //driver = new FirefoxDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();

  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("https://netbanking.hdfcbank.com/netbanking/");
  driver.switchTo().frame("login_page");
  driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img")).click();
  Alert HdfcAlert=driver.switchTo().alert();
  String alretText=HdfcAlert.getText();
  Thread.sleep(10000);
  HdfcAlert.accept();
  driver.switchTo().defaultContent();// This method will take back to main window mean comes out of the login frame.
  System.out.println(alretText);
}
}
  
