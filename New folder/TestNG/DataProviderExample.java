package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
public class DataProviderExample extends SeleniumUtility {
	
@Test(dataProvider = "testData")

  public void testLoginOfVtiger(String browser,String userName, String password) {
	setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("username");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
	driver.close();
  }
   @DataProvider(name = "testData")
   public Object[][] getUserDetails() {
	 Object[][] data = new Object[3][3];
	// 1st row
	 data[0][0]="chrome";
	 data[0][1]="admin";
	 data[0][2]="Test@123";
	 //2nd row
	 data[1][0] ="chrome";
	 data[1][1]="pass123";
	 data[1][2]="admin";
	 //3rd row
	            data[2][0]="chrome";
	            data[2][1]="";
	            data[2][2]="";
	      return data;      
   }
   
   @DataProvider
   public Object[][] getData() {
	   Object[][] data = new Object[3][2];
	     
	   //1st Row
	   data[0][0] = "admin";
	   data[0][1] = "admin";
	 //2nd Row
	   data[1][0] = "";
	   data[1][1] = "";
	 //3rd Row
	   data[2][0] = "guestuser3";
	   data[2][1] = "pass123";
	   return data;
   }
}
