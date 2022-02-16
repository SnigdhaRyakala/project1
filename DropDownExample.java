package seleniumexamples;

import java.util.concurrent.TimeUnit;


//import javax.swing.plaf.synth.SynthOptionPaneUI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement monthfield=driver.findElement(By.name("birthday_month"));
	    Select month=new Select(monthfield);
	 //   month.selectByVisibleText("Aug");
	    List<WebElement> allMonths=month.getOptions();
	    month.selectByVisibleText("Oct");
	    //month.selectByIndex(9);
	    //Thread.sleep(1000);
	    System.out.println("Number of months in month drop-donw are: "+allMonths.size());
	//	driver.quit();
	}

}
