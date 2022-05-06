package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginLogoutWithHomePageValidition {

	private static final String DriverPath = null;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		String drivePath = System.getProperty ("user.dir")+ "\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",drivePath);
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		String expectedTitle ="ActiTime-Login";
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) 
		{
		System.out.println("Login page opened sucessfully... ");
		}
		else{ 
		System.out.println("Either login page not open or page title got changed");
		}
		driver.findElement(By.id("userName")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("logInButton")).click();

		WebElement logOutButton = driver.findElement(By.id("logOutLink"));
		WebDriverWait wait=new WebDriverWait (driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(logOutButton));

		String actualHomePageTitle=driver.getTitle();
		System.out.println("Actual Home Page Title:"+actualHomePageTitle);
		String ExpectedHomePageTitle = "actiTime - Enter Time-track";
		if(actualHomePageTitle.equals(ExpectedHomePageTitle)) {
		System.out.println("Login is sucessfull and home page title is also varified...");
		} else {
		System.out.println("Either login is failed or home page title is changed");
		}
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id ("logOutLink")).click();
		driver.close ();
		}
		}

