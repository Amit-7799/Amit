package TestNG;

import org.testng.annotations.Test;

public class Actitime_Timeout {
  @Test (enabled=true,timeOut=200)
  public void openBrowserAndAppURL() throws InterruptedException {
	  Thread.sleep(250);
	  System.out.println("open browser and enter app url");
  }
}
