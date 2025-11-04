package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="exampleInputEmail1")
	private WebElement UserNameTextField;
	
	@FindBy(name="password")
	private WebElement PasswordTextField;
	
	@FindBy(id="form_submit")
	private WebElement SubmitButton;

	public WebElement getUserName() {
		return UserNameTextField;
	}

	public WebElement getPassword() {
		return PasswordTextField;
	}

	public WebElement getSubmit() {
		return SubmitButton;
	}
	
	/**
	 * this method is use to Login into Application
	 * @param usn
	 * @param pwd
	 * @author Shubham
	 */
	public void LoginIntoApplication(String usn, String pwd)
	{
		UserNameTextField.sendKeys(usn);
		PasswordTextField.sendKeys(pwd);
		SubmitButton.click();
	}
}
