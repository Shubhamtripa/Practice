package object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class AddEmployeeFormPage {


	public AddEmployeeFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "empcode")
	private WebElement EmpIDTeextField;
	

	@FindBy(name = "firstName")
	private WebElement empFnameTextField;
	
	@FindBy(name = "lastName")
	private WebElement empLnameTextField;
	
	@FindBy(name = "email")
	private WebElement empEmailTextField;

	@FindBy(name = "department")
	private WebElement empDepartmentdropdown;
	
	@FindBy(name = "gender")
	private WebElement empGenderDropDown;

	@FindBy(name = "dob")
	private WebElement empDOB;

	@FindBy(name = "mobileno")
	private WebElement empContactTextField;

	@FindBy(name = "country")
	private WebElement empCountryTextField;

	@FindBy(name = "address")
	private WebElement empAddressTextField;

	@FindBy(name = "city")
	private WebElement empCityTextField;

	@FindBy(name = "password")
	private WebElement empPasswordTextField;

	@FindBy(name = "confirmpassword")
	private WebElement empConfirmPasswordTextField;
	
	@FindBy(id = "update")
	private WebElement ProcedButton;

	public void setProcedButton(WebElement procedButton) {
		ProcedButton = procedButton;
	}

	public WebElement getEmpIDTeextField() {
		return EmpIDTeextField;
	}

	public WebElement getEmpFnameTextField() {
		return empFnameTextField;
	}

	public WebElement getEmpLnameTextField() {
		return empLnameTextField;
	}

	public WebElement getEmpEmailTextField() {
		return empEmailTextField;
	}

	public WebElement getEmpDepartmentdropdown() {
		return empDepartmentdropdown;
	}

	public WebElement getEmpGenderDropDown() {
		return empGenderDropDown;
	}

	public WebElement getEmpDOB() {
		return empDOB;
	}

	public WebElement getEmpContactTextField() {
		return empContactTextField;
	}

	public WebElement getEmpCountryTextField() {
		return empCountryTextField;
	}

	public WebElement getEmpAddressTextField() {
		return empAddressTextField;
	}

	public WebElement getEmpCityTextField() {
		return empCityTextField;
	}

	public WebElement getEmpPasswordTextField() {
		return empPasswordTextField;
	}

	public WebElement getEmpConfirmPasswordTextField() {
		return empConfirmPasswordTextField;
	}
	
	public WebElement getProcedButton() {
		return ProcedButton;
	}
	
	public void Details(String EmpID, String Fname, String Lname, String Email, String contact,
			String country, String address, String city, String Pwd, String C_Pwd)
	{
		EmpIDTeextField.sendKeys(EmpID);
		empFnameTextField.sendKeys(Fname);
		empLnameTextField.sendKeys(Lname);
		empEmailTextField.sendKeys(Email);
		
		Select sec =new Select(empDepartmentdropdown);
		sec.selectByIndex(2);
		Select sec1 = new Select(empGenderDropDown);
		sec1.selectByIndex(1);
		empDOB.click();
		empContactTextField.sendKeys(contact);
		empCountryTextField.sendKeys(country);
		empAddressTextField.sendKeys(address);
		empCityTextField.sendKeys(city);
		empPasswordTextField.sendKeys(Pwd);
		empConfirmPasswordTextField.sendKeys(C_Pwd);
		//ProcedButton.click();
	}
	
	
	
	
	
}
