package seleniumexamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("C:\\Users\\Ashok Reddy\\Desktop\\Training\\Autoit\\fileupload.html");
		driver.findElement(By.id("1")).click();;
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Ashok Reddy\\Desktop\\Training\\Autoit\\Fileupload.exe");
		
	}

}
