package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base
{
public static void main(String[] args) 
	{
		Locators locators=new Locators();
		locators.browserInitialisation();
		locators.IDlocator();
		/*locators.nameLocator();
		locators.className();
		locators.linkText();
		locators.partialLinkText();*/
		
	}
	//WebElement elementname=driver.findElement(By.Locator("locator value"));
	public void IDlocator()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//single-input-field
		WebElement text=driver.findElement(By.id("single-input-field"));
		text.sendKeys("reshma");
		WebElement ShowMessage=driver.findElement(By.id("button-one"));
		ShowMessage.click();
	}
	
	public void nameLocator()
	{
		WebElement name=driver.findElement(By.name("viewport"));
		//WebElement name1=driver.findElement(By.name("description"));

		
	}
	public void className()// check whether class attribute is present
	{
		WebElement clas=driver.findElement(By.className("header-top"));
		//WebElement clas1=driver.findElement(By.className("btn btn-success btn-block"));
		
	}
	public void linkText()
	{
		WebElement link=driver.findElement(By.linkText("Ajax Form Submit"));
		link.click();
		//		WebElement link=driver.findElement(By.linkText("Bootstrap List Box"));


	}
	public void partialLinkText()
	{
		WebElement partialLink=driver.findElement(By.linkText("Ajax Form"));
		partialLink.click();
		//		WebElement partialLink=driver.findElement(By.linkText("Jquery List"));


	}
}
