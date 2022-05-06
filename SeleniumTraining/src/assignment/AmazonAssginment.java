package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssginment {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+ "//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         //driver.manage().
         String PageTitle =driver.getTitle();
         System.out.println("Page title is:"+ PageTitle);
         String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in\r\n" ;
        if (ExpectedTitle.equals(driver.getTitle()));
        {
        	System.out.println("Title is same....");
        }
       // else
        {
        	System.out.println("Title is not same....");
        }
         driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(1)")).click(); 
        driver.navigate().back();
        driver.close();
	}
}
