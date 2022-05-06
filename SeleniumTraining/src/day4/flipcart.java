package day4;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class flipcart {

			public static void main(String[] args) {
				String driverPath = System.getProperty("user.dir")+".//executables//chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", driverPath);
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				String pageTitle = driver.getTitle();
				System.out.println("Page title is:"+pageTitle);
				List<WebElement> allOptions = driver.findElements(By.cssSelector("._37M3Pb>div"));
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
