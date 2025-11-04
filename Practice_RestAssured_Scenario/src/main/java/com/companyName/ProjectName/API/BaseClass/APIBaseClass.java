package com.companyName.ProjectName.API.BaseClass;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.companyName.ProjectName.API.genericUtility.FileUtility;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class APIBaseClass {
	public  RequestSpecification reqSpec;
	public ResponseSpecification resSpec;
	FileUtility flib = new FileUtility();
	@BeforeSuite
	public void bs() throws IOException {
		System.out.println("Database connection build======report configuration");

		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setContentType(ContentType.JSON);
		builder.setBaseUri(flib.readDataFromPropertiesFile("BaseURI"));
		reqSpec = builder.build();
		
		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder();
		resBuilder.expectContentType(ContentType.JSON);
		resSpec = resBuilder.build();
	}

	@AfterSuite
	public void as() {
		System.out.println("Database connection close");
		
		
	}
}
