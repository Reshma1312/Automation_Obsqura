package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automation.Base;

public class dropDown extends Base
{

	public static void main(String[] args) 
	{
		dropDown dropdown=new dropDown();
		dropdown.browserInitialisation();
		dropdown.dropDownHandling();
		

	}
	public void dropDownHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdownText=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		
		Select select=new Select(dropdownText);
		//select.selectByVisibleText("Red");
		select.selectByIndex(0);
		//select.selectByValue("Green");
	}
}
