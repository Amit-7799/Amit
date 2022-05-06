package broweroperations;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
	
String path1="D:\\Workpace\\SeleniumTraining\\Executables\\chromedriver.exe";
String path2=".\\Executables\\chromedriver.exe";
String path3=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
//set required browser executable path using System.setProperty(String key,String value)
	System.setProperty ("webdriver.chrome.driver",path2);
	//create an instance of required browser class
	ChromeDriver cdriver=new ChromeDriver();
	}

}
