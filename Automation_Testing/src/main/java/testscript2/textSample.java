package testscript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.Base;

public class textSample extends Base
{

	public static void main(String[] args) 
	{
		textSample textsample=new textSample();
		textsample.browserInitialisation();
		textsample.sample();
	}

	public void sample()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textField=driver.findElement(By.xpath("//input[@type='text']"));
		textField.sendKeys("Hello");
		
	}
}
