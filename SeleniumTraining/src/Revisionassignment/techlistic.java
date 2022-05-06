package Revisionassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {

	public static void main(String[] args) {
	
		String driverPath=System.getProperty("user.dir")+ "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(300,500));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Java")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("class")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("class")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("class")).click();
		
	    driver.close();
		

	}

}
