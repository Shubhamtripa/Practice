package Employee;

import org.testng.annotations.Test;

import general_Utility.BaseClass;
import general_Utility.File_Utility;
import object_Repository.AddEmployeeFormPage;
import object_Repository.EmployeeSectionPage;
import object_Repository.Welcome_Page;

public class AddEmployeeTest extends BaseClass {
	@Test
	public void AddEmployeeDetailsTest() throws Throwable
	{
		Welcome_Page welcome = new Welcome_Page(driver);
		
		welcome.getOptionButton().click();
		welcome.getEmployeelink().click();
		EmployeeSectionPage empPage = new EmployeeSectionPage(driver);
		empPage.getAddNewEmpLink().click();
		
		File_Utility flib = new File_Utility();
		String EmpID = flib.getNewEmployeeDetails("EmployeeID");
		String EmpFname = flib.getNewEmployeeDetails("FirstName");
		String EmpLname = flib.getNewEmployeeDetails("LastName");
		String Empemail = flib.getNewEmployeeDetails("Email");
		String EmpContact = flib.getNewEmployeeDetails("Contact");
		String EmpCountry = flib.getNewEmployeeDetails("Country");
		String EmpAddress = flib.getNewEmployeeDetails("Address");
		String EmpCity = flib.getNewEmployeeDetails("City");
		String EmpPWD = flib.getNewEmployeeDetails("Password");
		String EmpC_PWD = flib.getNewEmployeeDetails("ConPassword");
		
		AddEmployeeFormPage details = new AddEmployeeFormPage(driver);
		details.Details(EmpID, EmpFname, EmpLname, Empemail, EmpContact, EmpCountry, EmpAddress, EmpCity, EmpPWD, EmpC_PWD);
		
	}

}
