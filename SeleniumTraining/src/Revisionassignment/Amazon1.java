package Revisionassignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {

	public static void main(String[] args)  {
		String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();
        
        driver.manage().window().setSize(new Dimension(300,500));
        
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
		
	    System.out.println("page title is:"+driver.getTitle());
		
		driver.findElement(By.linkText("Customer Service")).click();
		
	    //driver.findElement(By.linkText("Mobiles")).click();
		
	    //driver.findElement(By.linkText("Today's Deals")).click();
		
	    System.out.println("page title is :"+driver.getTitle());
	    
					
	    driver.navigate().back();
		
	    driver.close();
		
    }
	
	}

