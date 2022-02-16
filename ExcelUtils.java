package seleniumexamples;

//package com.testng;
import java.io.File;
import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import utility.Constant;
public class ExcelUtils{
Sheet s;
WebDriver driver;
Workbook w=null;
FileInputStream fi; 
@Before
public void setUp()
{
	/*if(utility.Constant.browser.equals("FF"))
	{*/
		driver = new FirefoxDriver();
	}
	/*else if(utility.Constant.browser.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver","F:\\Ashok\\IEDriverServer.exe");
		driver =new InternetExplorerDriver();
		
	}*/

@Test
public void searchGoogle() throws Exception
{
try
{
	fi = new FileInputStream("C:\\Ashok\\Training\\Selenium\\TestData.xlsx");
	w = Workbook.getWorkbook(fi);
}
catch(Exception e)
{
	System.out.println(e);
}
s = w.getSheet(0);
for(int row=1; row <=s.getRows();row++)
{
String username = s.getCell(0, row).getContents();
System.out.println("Username "+username);
driver.get("http://www.gmail.com");
driver.findElement(By.name("Email")).sendKeys(username);
String password= s.getCell(1, row).getContents();
System.out.println("Password "+password);
driver.findElement(By.name("Passwd")).sendKeys(password);
driver.findElement(By.name("signIn")).click();
}
}
@After
public void stop()
{
//driver.close();
//driver.quit();
}
}
