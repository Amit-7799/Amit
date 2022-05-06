package day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	
	public static void main(String[] args) throws InterruptedException {
    String driverPath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",driverPath);
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().window().setSize(new Dimension (500, 700));
	System.out.println("page title");
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
	System.out.println("Current Page title is: " + driver.getTitle());
	System.out.println("Current page url: " + driver.getCurrentUrl());
	driver.findElement(By.linkText("Amazon pay or choose any other link fron menu list ")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().to("https://www.amazon.in/");
	driver.close();
	}

}
