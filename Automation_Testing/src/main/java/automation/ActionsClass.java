package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass extends Base
{

	public static void main(String[] args)
	{
		ActionsClass actionclass=new ActionsClass();
		actionclass.browserInitialisation();
		actionclass.action();
	}
	public void action()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		WebElement drop1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		
		Actions actions=new Actions(driver);
		//actions.dragAndDrop(drag1, drop1).perform();
		
		//actions.contextClick(drag1).perform();
		
		//actions.moveToElement(drag1).perform();
		
		actions.click(drag1).perform();
	}

}
