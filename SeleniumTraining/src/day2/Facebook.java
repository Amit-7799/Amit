package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	

String driverPath = System.getProperty("user.dir")+ "//Executables//chromedriver.exe";
System.setProperty("webdriver.chrome.driver",driverPath);
WebDriver driver = new ChromeDriver();

		driver.get ("https://www.faceBook.com/login.do");
		String expectedTitle ="faceBook- login";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals (expectedTitle)){
		System.out.println("login page opened sucessfully...");
		}
		else 
		{
		System.out.println("Either login page not opened or page title get changed");
		}

		driver.close();
	}

}
