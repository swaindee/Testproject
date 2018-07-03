package com.qa.webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamictable {
	static WebDriver driver;
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver=new ChromeDriver();
	//	driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
@Test
public void getdata()
{
	//*[@id="customers"]/tbody/tr[1]/th[1]
	//*[@id="customers"]/tbody/tr[2]/td[1]
	String beforexpath=	"//*[@id='customers']/tbody/tr[";
	String afterxpath="]/td[1]";
	for(int i=2;i<7;i++)
	{
		String Actualxpath=beforexpath+beforexpath;
	WebElement element=	driver.findElement(By.xpath(Actualxpath));
	System.out.println(element.getText());
	
		
	}
}
	@AfterMethod
	public static void enddata(){
		driver.quit();
	}
	
	
}

