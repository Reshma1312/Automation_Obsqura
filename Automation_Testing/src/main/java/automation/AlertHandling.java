package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base
{

	public static void main(String[] args) 
	{
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.browserInitialisation();
		//alerthandling.simpleAlert();
		alerthandling.confirmAlert();
	}
	/*public void simpleAlert()
	{
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement ok=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		ok.click();
		Alert alerts=driver.switchTo().alert();
		alerts.accept();
	}*/
	
	public void confirmAlert()
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickme=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		clickme.click();
		Alert alerts=driver.switchTo().alert();
		//alerts.accept();
		alerts.dismiss();
		
	}
	public void prompt()
	{
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickForPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		clickForPrompt.click();
		clickForPrompt.sendKeys("Hello");
		

	}

}
