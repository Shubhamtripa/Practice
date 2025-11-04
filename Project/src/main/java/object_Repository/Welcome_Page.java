package object_Repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {
	
	public Welcome_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindAll({ 
		@FindBy(xpath = "(//span)[7]"),
		@FindBy(xpath = "//div[@class='nav-btn pull-left']") 
		})
	private WebElement optionButton;
	
	@FindBy(xpath = "//span[text()='Employee Section']")
	private WebElement Employeelink;
	
	@FindBy(xpath = "//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//td[3]")
	private List<WebElement> table;

	public WebElement getOptionButton() {
		return optionButton;
	}

	public WebElement getEmployeelink() {
		return Employeelink;
	}
	
	public List<WebElement> getTable() {
		return table;
	}
	

	public void SelectEmployee(String name)
	{
		for(int i=1;i<table.size();i++)
		{
			String Fname = table.get(i-1).findElement(By.xpath("(//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//td[3]//a)["+i+"]")).getText();
			
			if(name.equalsIgnoreCase(Fname))
			{
				System.out.println(Fname);
				table.get(i-1).findElement(By.xpath("(//table[@class='table table-hover table-bordered table-striped progress-table text-center']//tbody//td[7]//a)["+i+"]")).click();
			}
			
		}
		
	}
	
	
}

