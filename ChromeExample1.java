package seleniumexamples;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class ChromeExample1 {
 

                public static void main(String[] args) throws InterruptedException {

                               

                                System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
                                WebDriver driver = new ChromeDriver();
                                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
                                // And now use this to visit Google
                                driver.get("http://www.google.com");
                               Thread.sleep(1000);
                                driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
                                // Find the text input element by its name
                                driver.findElement(By.id("lst-ib")).sendKeys("Test WebDriver");

                                // Enter something to search for
                               // element.sendKeys("Test WebDriver");

                                // Now submit the form. WebDriver will find the form for us from the element
                                //element.submit();

                                // Check the title of the page
                                System.out.println("Page title is: " + driver.getTitle());
                                //driver.quit();
                            }
                }