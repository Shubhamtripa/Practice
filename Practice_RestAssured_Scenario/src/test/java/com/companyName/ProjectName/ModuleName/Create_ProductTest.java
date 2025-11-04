package com.companyName.ProjectName.ModuleName;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.companyName.ProjectName.API.BaseClass.APIBaseClass;
import com.companyName.ProjectName.API.POJOClass.ProductPOJO;
import com.companyName.ProjectName.API.endPoints.IEndPoints;
import com.companyName.ProjectName.API.genericUtility.ExcelUtility;

import static io.restassured.RestAssured.*;

import java.io.IOException;

public class Create_ProductTest extends APIBaseClass {
ExcelUtility elib = new ExcelUtility();
	@Test
	public void createProductTest() throws EncryptedDocumentException, IOException {
		String createdBy=elib.readDataformExcel("sheet1", 1, 0);
		String projectName=elib.readDataformExcel("sheet1", 1, 1);
		String status=elib.readDataformExcel("sheet1", 1, 3);
		Integer teamSize = Integer.parseInt(elib.readDataformExcel("sheet1", 1, 2));
		ProductPOJO pPOJO =new ProductPOJO(createdBy, projectName, status, teamSize);
		given()
			.spec(reqSpec)
			.body(pPOJO)
		.when()
			.post(IEndPoints.ADDProj)
		.then()
			.spec(resSpec)
			.log().all();
			
	}
	
}
