package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleApplicationWithBeforeAfterMethod {
	WebDriver driver;
	
	@BeforeMethod
  public void startUp() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.get("https://www.google.com/");
  }
  @Test
  public void testGoogleLandingPage() {
	  String expectedTitle="Google";
	  String actualTitle=driver.getTitle();
	  System.out.println(expectedTitle.equals(actualTitle));
	  /*valdation is pending*/
  }
  @Test
  public void testSearch() {
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  System.out.println(driver.getTitle());
  }
  @AfterMethod
  public void cleanUp() {
	  driver.close();
  }
}

