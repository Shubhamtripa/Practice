package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeSectionPage {
	
	public EmployeeSectionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Add New Employee']")
	private WebElement AddNewEmpLink;

	public WebElement getAddNewEmpLink() {
		return AddNewEmpLink;
	}
	

}
