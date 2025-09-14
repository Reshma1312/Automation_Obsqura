package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AxesMethods extends Base
{

	public static void main(String[] args)
	{
		AxesMethods axesmethods =new AxesMethods();
		
	}
	
	public void parent()
	{
		WebElement sample1=driver.findElement(By.xpath(""));
	}
	
	public void child()
	{
		WebElement sample2=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
	}
	public void followingSiblings()
	{
		//button[@id='button-one']//following-sibling::div[@id='message-one']
	}
	
	public void following()
	{
		//button[@id='button-one']//following::div[@id='message-two']
	}
	public void preceeding()
	{
		//button[@id='button-one']//preceding::div[@class='header-top']
	}
	
	public void indexing()
	{
		//(//div[@class='row'])[1]
	}
	
	public void ancestor()
	{
		//button[@id='button-one']//ancestor::div[@class='container page']
	}
	public void descendant()
	{
		//(//div[@id='collapsibleNavbar']//descendant::li)[2]
		
	}
}
