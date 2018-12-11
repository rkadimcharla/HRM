package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/*import org.testng.annotations.Parameters;
*/
public class BaseTest implements AutoConstant{
	
	
	public static WebDriver driver;
	@Parameters("browser")
	

	@BeforeMethod
		public void preCondition(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
		System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver=new FirefoxDriver();
		}
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
			
					
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
}




	


