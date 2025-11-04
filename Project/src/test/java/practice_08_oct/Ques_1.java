package practice_08_oct;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ques_1 { 

	@Test
	public void ques_1Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='card' and contains(.,'Ledger 3')]//table/thead/tr/th"));
		for(WebElement ele : listElement){
			System.out.println(ele.getText());
		}
		driver.close();
		
		}
	
	@Test
	public void ques_2Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='card' and contains(.,'Ledger 7')]//table/tbody/tr[contains(.,'Pending')]/td/input"));
		for(WebElement ele : listElement){
			ele.click();
		}
		driver.close();
		}
	
	@Test
	public void ques_3Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> listElement = driver.findElements(By.xpath("//div[@class='card' and contains(.,'Ledger 4')]//table/tbody/tr[@data-row-key]"));
		int count=0;
		for(WebElement ele : listElement){
			String attValue= ele.getAttribute("class");
			if(attValue.equals("row-hidden")) {
			}
			else
				count++;	
		}
		System.out.println(count);
			}
	
	@Test
	public void ques_4Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		WebElement listElement = driver.findElement(By.xpath("//div[@class='card' and contains(.,'Ledger 10')]//table/thead/tr/th"));
		
		String noOfcolspan=listElement.getAttribute("colspan");
		System.out.println(noOfcolspan);
		int numberOfcolspan=Integer.parseInt(noOfcolspan);
		if(numberOfcolspan>1) {
			System.out.println(listElement.getText());
		}
		driver.close();
		}
	
	@Test
	public void ques_5Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> allRow = driver.findElements(By.xpath("//tr[td[contains(.,'QA')] and td[number(text())>5000]]"));
		
		for(WebElement ele : allRow) {
		String name =	ele.findElement(By.xpath(".//td[2]")).getText();
		String email =	ele.findElement(By.xpath(".//td[6]")).getText();
			System.out.println(name+"--> "+ email);
		}
		driver.close();
		}
	
	@Test
	public void ques_6Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> allNested = driver.findElements(By.xpath("//td/table "));
		for(WebElement ele : allNested) {
			Reporter.log(ele.getText(),true);
		}
		driver.close();
		}
	
	@Test
	public void ques_7Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		List<WebElement> allNotesCell = driver.findElements(By.xpath("//table/tbody/tr[td[contains(.,'Ops')] and td[position()=1 and contains(.,'12')]]/td[7]"));
		for(WebElement ele : allNotesCell) {
			Reporter.log(ele.getText(),true);
		}
		driver.close();
		}
	
	@Test
	public void ques_8Test(){
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Ayush%20Com/Downloads/automation_table_challenge.html");
		driver.findElement(By.xpath("//div[@class='card' and contains(.,'Ledger 10')]//table/tbody/tr[last()]/td[last()]/input")).click();
		driver.quit();
		}
}
