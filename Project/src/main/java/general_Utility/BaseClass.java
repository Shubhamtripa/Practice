package general_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import object_Repository.LoginPage;

public class BaseClass {
	public  WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite()
	public void BS()
	{
		System.out.println("DataBase Connection Open");
	}
	
	@BeforeTest()
	public void BT()
	{
		System.out.println("Parallel Execution Starts");
	}
	
	@BeforeClass()
	public void BC()
	{
		driver = new ChromeDriver();
		System.out.println("Browser Launched");
	}
	
	@BeforeMethod()
	public void BM() throws Throwable
	{
		File_Utility flib = new File_Utility();
		Web_Driver_Utility wlib = new Web_Driver_Utility();
		wlib.maximizeWindow(driver);
		wlib.waitElementToLoad(driver);
		
		String Url = flib.getEmployeeCredential("url");
		String UserName = flib.getEmployeeCredential("UserName");
		String Password = flib.getEmployeeCredential("Password");
		
		driver.get(Url);
		
		LoginPage login = new LoginPage(driver);
		login.LoginIntoApplication(UserName, Password);
		
		System.out.println("Logined Into Application");
	}
	
	@AfterMethod()
	public void AM()
	{
		System.out.println("LogOut From Application");
	}

	
	@AfterClass()
	public void AC()
	{
		//driver.quit();
		System.out.println("Browser Closed");
	}
	
	@AfterTest()
	public void AT()
	{
		System.out.println("Parallel Execution Completed");
	}
	
	@AfterSuite()
	public void AS()
	{
		System.out.println("DataBase Connection Close");
	}
	
}
