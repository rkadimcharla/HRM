package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import org.testng.Assert;

import generic.BasePage;
//import junit.framework.Assert;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;
	@FindBy(id="txtPassword")
	private WebElement PwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	/*@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_List;*/
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement firstName1;
	
	
	public void setUserName(String un) {
		userTxtBox.sendKeys(un);
	}
	public void setPwd(String pwd) {
		PwdTxtBox.sendKeys(pwd);
	}
	public void clickLogin() {
		loginBtn.click();
	}
	public void clickpimMenu() {
		pim_Menu.click();
	}
	
	public void clickAddEmp_Menu() {
		addEmp_Menu.click();
	}
	public void setFirstName(String fn) {
		fName.sendKeys(fn);
	}
	public void setLastName(String ln) {
		lName.sendKeys(ln);
}
	
	public void clickSavebtn() {
		saveBtn.click();
	}
	
	public void verifyFirstName(String eFn) {
		String aFn = firstName1.getAttribute("value");
		Assert.assertEquals(aFn, eFn);
	}
	
	//to sort the list
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_List;
	public void clickemp_List() {
		emp_List.click();
	}
	
	//to unSort the list 
	@FindBy(id="empsearch_sub_unit")
	private WebElement sub_Unit;
	public void clicksub_Unit() {
		sub_Unit.click();
	}
	
	//to delete an employee
	
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement addEmpList_Btn;
	
	@FindBy(id="btnDelete")
	private WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	private WebElement btnOK;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmpList;
	
	public void clickAddEmpList() {
		addEmpList_Btn.click();
	}
	public void clickEmpCheckBox(String name) {
		String xp="//a[text()="+name+"]/../../td[9]//input";
		driver.findElement(By.xpath(xp)).click();
		
	}
	public void clickDelete() {
		btnDelete.click();
	}
	
	public void clickOK() {
		btnOK.click();
	}
	
	public boolean verifyEmpIsPresentOrNotPresent(String name) {
		String xp="//a[text()='"+name+"']";
		boolean  present=verifyEmpIsPresentOrNotPresent(xp);
		Assert.assertFalse(present);
		
		return present;
		
		
	}
	/*private boolean verifyElementIsPresentOrNot(String xp) {
		return false;
	}*/
	
	
	
	
}
	
	


