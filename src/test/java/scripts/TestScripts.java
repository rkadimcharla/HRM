package scripts;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
/*import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;*/
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.ExcelFile;
/*import generic.ExcelFile;*/
import generic.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest{
	@Test(enabled=true)
	public void testCreateEmployee() {
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickpimMenu();
		pi.clickAddEmp_Menu();
		pi.setFirstName("Sri");
		pi.setLastName("Kadim");
		pi.clickSavebtn();
		pi.verifyFirstName("Sri");
		Reporter.log("Hi",true);
	}

		
	@Test(enabled=true)
	public void testSortListBox() throws EncryptedDocumentException, OpenXML4JException, IOException { 
		
			
		HomePage pi=new HomePage(driver);
		/*pi.setUserName("Admin");
		pi.setPwd("admin123");*/
		pi.setUserName(ExcelFile.readData("Sheet1",0,1));
		pi.setPwd(ExcelFile.readData("Sheet1",1,1));
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickpimMenu();
		pi.clickemp_List();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		GenericUtils.unSortListBox(driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']")));
	}
	@Test(enabled=true)
	public void testDeleteEmployee() throws InterruptedException  { 
		
			
		HomePage pi=new HomePage(driver);
		pi.setUserName("Admin");
		pi.setPwd("admin123");
		pi.clickLogin();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickpimMenu();
		pi.clickAddEmpList();
		Thread.sleep(2000);
		pi.clickEmpCheckBox("sri");
		pi.clickDelete();
		Thread.sleep(2000);
		pi.verifyEmpIsPresentOrNotPresent("kadim");
	}
		
	
		
		
	
	



	
		
	}

