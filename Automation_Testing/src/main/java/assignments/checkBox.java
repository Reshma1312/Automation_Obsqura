package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.Base;

public class checkBox  extends Base
{

	public static void main(String[] args) 
	{
		checkBox checkbox=new checkBox();
		checkbox.browserInitialisation();
		checkbox.checkBoxHandling();

	}
	public void checkBoxHandling()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singleCheck=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
		if(singleCheck.isSelected())
		{
			System.out.println("Single CheckBox  is selected");
			
		}
		
		else
			
		{
			singleCheck.click();
		}
		
		/*WebElement checkBox1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		
		WebElement checkBox2=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		
		WebElement checkBox3=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		
		WebElement checkBox4=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		
		WebElement selectAll=driver.findElement(By.xpath("//input[@value='Select All']"));*/

		
		
		
		
	}

}
