package seleniumexamples;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	
		//WebDriver driver=new FirefoxDriver();
			String baseUrl="https://login.yahoo.com/";
			driver.get(baseUrl);
			Thread.sleep(10000);
			WebElement checkbox=driver.findElement(By.id("yui_3_18_1_11_1464145381150_124"));
			for(int i=0;i<2;i++){
				checkbox.click();
			    Thread.sleep(1000);
				System.out.println(checkbox.isSelected());
			}
	
		}
	}
