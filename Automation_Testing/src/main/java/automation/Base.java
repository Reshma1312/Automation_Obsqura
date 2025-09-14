package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base
{
	
	public WebDriver driver;//instance variable
	public void browserInitialisation()
	{
		 driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		
		
	}
	
	public void driverQuiteAndClose()
	{
		driver.close();//closes one single tab
		
		//driver.quite();//closes all opened tabs
	}
	public static void main(String[] args) 
	{
		Base base=new Base();
		base.browserInitialisation();
	}

}
