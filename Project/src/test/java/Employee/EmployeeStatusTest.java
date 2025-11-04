package Employee;

import org.testng.annotations.Test;

import general_Utility.BaseClass;
import object_Repository.Welcome_Page;

public class EmployeeStatusTest extends BaseClass{
	@Test
	public void EmpStatusTest() {
		Welcome_Page welcome = new Welcome_Page(driver);
		welcome.SelectEmployee("Vinay Singh");
		
	}

}
