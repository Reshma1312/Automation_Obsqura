package testscript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automation.Base;

public class TableHandling extends Base 
{

	public static void main(String[] args) 
	{
		
		TableHandling tablehandling =new TableHandling();
		tablehandling.browserInitialisation();
		//tablehandling.tablePrinting();
		//tablehandling.rowPrinting();
		tablehandling.cellPrinting();
		tablehandling.columnPrinting();
	}
	public void tablePrinting()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
	 
	System.out.println(table.getText());
	}
	
	public void rowPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablerow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]"));
		System.out.println(tablerow.getText());
	}
	public void cellPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement cell=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[5]//td[2]"));
		System.out.println(cell.getText());
	}
	
	public void columnPrinting()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> cell=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		
		for(WebElement column1:cell)
		{
			System.out.println(column1.getText());
		}

	}
}
