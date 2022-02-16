package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample  {
    public static void main(String[] args) {
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.google.com");
       WebElement element = driver.findElement(By.id("lst-ib"));
       element.sendKeys("Download Selenium");
       element.submit();
       System.out.println("Page title is: " + driver.getTitle());
       driver.close();
    }
}