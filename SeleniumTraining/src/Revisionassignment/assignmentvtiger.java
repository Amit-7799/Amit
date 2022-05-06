package Revisionassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentvtiger {

	public static void main(String[] args) {
		
		
   String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
   System.setProperty("webdriver.chrome.driver",driverPath);
   WebDriver driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
   driver.get("https://demo.vtiger.com/vtigercrm/index.php");
   driver.findElement(By.id("username")).clear();
   driver.findElement(By.id("password")).clear();
   driver.findElement(By.id("userName")).sendKeys("admin");
   driver.findElement(By.id("password")).sendKeys("Test@123");
   driver.findElement(By.className("button")).click();
   
   driver.close();
   
	}

}
