package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ChromeExample {
 

 public static void main(String[] args) throws InterruptedException {
                            
   System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   // And now use this to visit Google
   //driver.get("http://www.google.com");
   driver.navigate().to("http://www.google.com");
   driver.manage().window().maximize();
   driver.navigate().refresh();
   driver.findElement(By.id("lst-ib")).sendKeys("Test WebDriver");
   Thread.sleep(5000);
   // element.submit();
   // Check the title of the page
   System.out.println("Page title is: " + driver.getTitle());
  // driver.close();
  }
 }