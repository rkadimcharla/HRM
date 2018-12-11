package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public static WebDriver driver;
	public  BasePage(WebDriver driver) {
		this. driver=driver;	
		}
	public static void verifyTitle(String eTitle) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching" + eTitle,true);
		}
		catch(Exception e) {
			Reporter.log("Title is not matching",true);
		}
	}
public static void verifyElementPresent(WebElement element) {
	try {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present"+element,true);
	}
	catch(Exception e) {
		Reporter.log("element is not present",true);
	}
}

public static void verifyEmpIsPresentOrNotPresent(WebElement xp) {
	try {
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(xp));
		Reporter.log("element is present"+xp,true);
	}
	catch(Exception e) {
		Reporter.log("element is not present",true);

}
	
}
}




