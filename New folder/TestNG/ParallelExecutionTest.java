package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ParallelExecutionTest extends SeleniumUtility {
  @Test
  public void testLoginOfVtiger( String browser,String userName,String password) {
 if (browser.equalsIgnoreCase("ff")) 
	 
 {
	 setUp(browser,"https://demo.vtiger.com/");
 }else if  (browser.equalsIgnoreCase("gc")) {
	 setUp(browser,"https://demo.vtiger.com/");
 }else if  (browser.equalsIgnoreCase("ie")) {
	 setUp(browser, "https://demo.vtiger.com/");
 }
      driver.findElement(By.id("userName")).sendKeys(userName);
      driver.findElement(By.id("password")).sendKeys(password);
      driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
 }
}
