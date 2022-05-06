package Switing;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAndVtiger {

	public static void main(String[] args) {
		
   String driverPath=System.getProperty("user.dir")+ "\\Executables\\chromedriver.exe";	
   //String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
   System.setProperty("webdriver.chrome.driver",driverPath);
   WebDriver driver=new ChromeDriver() ;
   
   driver.manage().window().maximize();
   
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   
   driver.get("https://www.flipkart.com/");
   
System.out.println("Title of page"+driver.getTitle());

String expectedTitle="Online shopping site for mobiles,Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
   
   if(expectedTitle.equals(driver.getTitle()));
   {
	   System.out.println("Title is same");
   }
   else {
	   System.out.println("Title is not same");
   }
   
	   
	   
   
	}

}
