package general_Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	/**
	 * this method is use to read URL, USERNAME, PASSWORD from properties file
	 * @param key
	 * @return
	 * @throws Throwable
	 * @author Shubham
	 */
	public String getEmployeeCredential(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/EmployeeDetails.Properties");
		Properties pos = new Properties();
		pos.load(fis);
		String value = pos.getProperty(key);
		return value;
		
	}

	public String getNewEmployeeDetails(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/NewEmpDetails.properties");
		Properties pos = new Properties();
		pos.load(fis);
		String value = pos.getProperty(key);
		return value;
		
	}
}
