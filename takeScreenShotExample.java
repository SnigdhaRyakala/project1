package seleniumexamples;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class takeScreenShotExample{

	public WebDriver driver;
     
      @Test

      public void openBrowser() throws Exception {

          //driver = new FirefoxDriver();
  		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();

          driver.get("http://www.google.com");
          driver.manage().window().maximize();

            try{

                 driver.findElement(By.id("kk")).sendKeys("test");
             }

          catch (Exception e){

                 System.out.println("In exception");
                 //calls the method to take the screenshot.
                 getscreenshot();

          }

      }
 
      public void getscreenshot()// throws Exception 

      {

              File  scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

           //The below method will save the screen shot in d drive with name "screenshot.png"
			try{
				FileUtils.copyFile(scrFile, new File("C:\\Ashok\\screenshot2.png"));
			}
              catch(Exception e)
			{
            	  
			}

      }


}
