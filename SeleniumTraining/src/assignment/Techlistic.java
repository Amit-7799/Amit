package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) {
	String driverPath = System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",driverPath);
	WebDriver driver = new ChromeDriver();
	driver.get ("https://www.techlistic.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement btnJava = driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/java.html'"));
	btnJava.click();
	System.out.println("Page title is:"+btnJava.getTagName());
	driver.navigate().back();
	driver.navigate().forward();
	WebElement btnBDD = driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html'"));
	btnBDD.click();
	System.out.println("Page title is:"+driver.getTitle());
	driver.navigate().back();
	driver.navigate().forward();
	WebElement btnTestNG = driver.findElement(By.cssSelector("a[href='https://www.techlistic.com/p/software-testing.html'"));
	btnTestNG.click();
	System.out.println("Page title is:"+driver.getTitle());
	driver.close();
	
	}

}
