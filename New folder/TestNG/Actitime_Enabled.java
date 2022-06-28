package TestNG;

import org.testng.annotations.Test;

public class Actitime_Enabled {
  @Test(enabled=true)
  public void openBrowserAndAppURL() {
	  System.out.println("Open browser and app Url");
  }
  @Test(enabled=false)
  public void login() {
	  System.out.println("enter userName,password and click on login button");
  }
  @Test(enabled=false)
  public void logOutClose() {
	  System.out.println("Logout from the application and close the browser");
  }
}
