package com.companyName.ProjectName.API.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String readDataFromPropertiesFile(String key) throws IOException {
		FileInputStream fis =new FileInputStream("./commonData/Evn_Config_Data.properties");
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);

	}

}
