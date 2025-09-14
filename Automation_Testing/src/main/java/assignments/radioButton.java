package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.Base;

public class radioButton extends Base
{

	public static void main(String[] args) 
	{
		radioButton radiobutton=new radioButton();
		radiobutton.browserInitialisation();
		radiobutton.radioBtnHandling();

	}
	public void radioBtnHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radiobtn1=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		
		if(radiobtn1.isSelected())
		{
			
			System.out.println("Patients gender Male is already selected");
			
		}
		
		else
		{
			radiobtn1.click();
		}
		
		WebElement radiobtn2=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
		
		/*WebElement ptnAge1=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));

		WebElement ptnAge2=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		
		WebElement getResult=driver.findElement(By.xpath("//button[text()='Get Results']"));*/

		
	}

}
