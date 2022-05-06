package Frame_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	private static final WebElement FashionHeaderLink = null;

	public static void main(String[] rgs) {
	        Object driver;
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Actions act=new Actions((WebDriver) driver);
	        try {
	        act.moveToElement(FashionHeaderLink).perform();
	        }
	        catch(Exception e)
	        {
	            act.moveToElement(((By) driver).findElement(By.xpath("//div[@class='_1psGvi SLyWEo']//div[text()='Fashion']"))).perform();
	        }
	        try {
	            if(((By) driver).findElement(By.xpath("//*[@class='_3XS_gI _7qr1OC']//a[1]")).isDisplayed())
	            {
	                System.out.println(((By) driver).findElement(By.xpath("//*[@class='_3XS_gI _7qr1OC']//a[1]")).isDisplayed());
	                driver.findElement(By.xpath("//*[@class='_3XS_gI _7qr1OC']//a[1]")).click();
	            }
	        }catch(Exception e) {e.printStackTrace();}  
	    }
}
