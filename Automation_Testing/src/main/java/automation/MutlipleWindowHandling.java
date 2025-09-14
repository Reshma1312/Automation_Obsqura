package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MutlipleWindowHandling  extends Base
{

	public static void main(String[] args) 
	{
		MutlipleWindowHandling mutliplewindowhandling=new MutlipleWindowHandling();
		mutliplewindowhandling.browserInitialisation();
		mutliplewindowhandling.windlowHandling();
	}
	public void windlowHandling()
	{
		driver.navigate().to("https://webdriveruniversity.com/");
		WebElement contactus=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactus.click();
		
		WebElement loginportal=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginportal.click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		System.out.println("**********************************");
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String it:allWindows)
		{
			System.out.println("window handle"+it);
			driver.switchTo().window(it);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println("**********************************");
			

		}

		
	}
}
