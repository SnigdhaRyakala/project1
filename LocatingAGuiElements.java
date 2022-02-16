package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LocatingAGuiElements {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		String baseUrl="https://www.facebook.com/";
		String tagName="";	
		driver.get(baseUrl);
		// getTagName() method will return the tagname of email filed in the facebook
		tagName=driver.findElement(By.id("email")).getTagName();
	System.out.println(tagName);
	driver.close();
	}
}