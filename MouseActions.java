package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selenium\\chromedriver.exe");
		   WebDriver d = new ChromeDriver();
		   d.get("http://www.jqueryui.com/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			d.findElement(By.linkText("Draggable")).click();
			d.switchTo().frame(d.findElement(By.className("demo-frame")));
			Actions mouse=new Actions(d);
			mouse.dragAndDropBy(d.findElement(By.id("draggable")),1000,1000).build().perform();
			//Thread.sleep(10000);
			
	}

}
