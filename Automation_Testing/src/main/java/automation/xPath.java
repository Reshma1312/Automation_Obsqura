package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xPath extends Base
{
	
	public static void main(String[] args) 
	{
		

	}
	public void relativeXPath()
	{
		//tagname[@attribute='value']
		
		WebElement textField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		WebElement getTotal=driver.findElement(By.xpath("//button[@id='button-two']"));
		
	}
	public void text()
	{
		//tagname[text()='value']
		WebElement ShowMessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		WebElement getTotal=driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		WebElement ShowSelectedValue=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		
		WebElement GetResult=driver.findElement(By.xpath("//button[text()='Get Results']"));
		
		WebElement GetFirstSelected=driver.findElement(By.xpath("//button[text()='Get First Selected']"));
		
		WebElement GetAllSelected=driver.findElement(By.xpath("//button[text()='Get All Selected']"));

		
	}
	
	public void contains()
	{
		//tag[contains(@attribute,'value')]
		
		WebElement textField1=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		
		WebElement textField2=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		
		WebElement textField3=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
		
		WebElement ShowMsgBtn=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
	}
	public void startsWith()
	{
		//tag[starts-with(@attribute,'value')]
		
		WebElement textField=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-fiel')]"));
		
		WebElement GetFirst=driver.findElement(By.xpath("//button[starts-with(@id,'button-fir')]"));
		
		WebElement GetAllSel=driver.findElement(By.xpath("//button[starts-with(@id,'button-a')]"));

	}
	public void and()
	{
		//tag[@attribute='value' and @attribute='value']
		WebElement textField=driver.findElement(By.xpath("//input[@id='single-input-field' and @class='form-control']"));
	}
	public void or()
	{
		//tag[@attribute='value' or @attribute='value']
		WebElement textField=driver.findElement(By.xpath("//input[@id='single-input-field' or@placeholder='Message']"));
		
	}
}
