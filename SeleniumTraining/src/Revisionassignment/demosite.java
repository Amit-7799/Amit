package Revisionassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demosite {

	public static void main(String[] args) {
	String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://demosite.executeautomation.com/Login.html");
	
	driver.findElement(By.id("userName")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("Test@1234");
	driver.findElement(By.className("button")).click();
	
	//driver.close();
	

	}

}
