package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricinfo {

	public static void main(String[] args) {
	   String driverPath = System.getProperty("user.dir")+".\\Executables\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver",driverPath);
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.cricinfo.com/");
	   String pageTitle =driver.getTitle();
	   System.out.println("Page title is:"+pageTitle);
	   List<WebElement> allOptions = driver.findElements(By.cssSelector("._cricketScore"));
	   System.out.println("Total Identified Elements: "+allOptions.size());
		System.out.println("Top elements are:");
		for(int i=0;i<allOptions.size();i++) {			
			WebElement option=allOptions.get(i);
			String name=option.getText();
			System.out.println(name);
			}
		driver.close();
	}

}
