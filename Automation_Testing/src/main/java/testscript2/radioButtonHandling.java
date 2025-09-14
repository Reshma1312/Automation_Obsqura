package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.Base;

public class radioButtonHandling extends Base
{

	public static void main(String[] args) 
	{
		radioButtonHandling radiobutton=new radioButtonHandling();
		radiobutton.browserInitialisation();
		radiobutton.radioButton();

	}
	
	public void radioButton()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement Male=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		Male.click();
	}
	

}
