package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frames extends Base
{

	public static void main(String[] args) 
	{
		Frames frames=new Frames();
		frames.browserInitialisation();
		frames.frameHandling();
	}
	public void frameHandling()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		 WebElement frame=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		  driver.switchTo().frame(frame);
		  
		  
		  WebElement imgframe=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		  imgframe.click();
		  
	}

}
