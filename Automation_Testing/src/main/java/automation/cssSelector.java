package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class cssSelector extends Base
{

	public static void main(String[] args) 
	{
		cssSelector selector=new cssSelector();
		selector.browserInitialisation();
		selector.tagAndId();
		
	}
	public void tagAndId()
	{
		WebElement sinleInputField=driver.findElement(By.cssSelector("input#single-input-field"));
		
		WebElement twoInputFieldValueA=driver.findElement(By.cssSelector("input#value-a"));
		
		WebElement twoInputFieldValueB=driver.findElement(By.cssSelector("input#value-b"));
		
		WebElement ShowMessage=driver.findElement(By.cssSelector("button#button-one"));
		
		WebElement GetTotal=driver.findElement(By.cssSelector("button#button-two"));
	}
	public void tagAndClass()
	{
		WebElement AgreeToTermsandCondtns=driver.findElement(By.cssSelector("input.form-check-input"));
		
		WebElement SingCheckBoxDemo=driver.findElement(By.cssSelector("input.form-check-input"));
		
		WebElement SearchState=driver.findElement(By.cssSelector("input.select2-search__field"));//dropdown with search box:state
		
		WebElement MultipleSelectState=driver.findElement(By.cssSelector("input.select2-search__field"));//dropdown with search box:multpile values state
	}
	public void tagAndAttribute()
	{
		WebElement text1=driver.findElement(By.cssSelector("input[id='single-input-field']"));
		
		WebElement AjxFmSubject=driver.findElement(By.cssSelector("input[placeholder='Subject']"));
		
		WebElement AjxFmDescription=driver.findElement(By.cssSelector("textarea[placeholder='Description']"));
		
		WebElement AjxFmSubmit=driver.findElement(By.cssSelector("input[value='Submit']"));
		
		WebElement SingleCheckboxDemo=driver.findElement(By.cssSelector("input[id='gridCheck']"));
		
	}
	public void tagClassAndAttriute()
	{
		WebElement MultiCheckBox1=driver.findElement(By.cssSelector("input.check-box-list[id='check-box-one']"));
		
		WebElement MutliCheckBox2=driver.findElement(By.cssSelector("input.check-box-list[id='check-box-two']"));
		
		WebElement MultiCheckBox3=driver.findElement(By.cssSelector("input.check-box-list[id='check-box-three']"));
		
		WebElement MultiCheckBox4=driver.findElement(By.cssSelector("input.check-box-list[id='check-box-four']"));
		
		WebElement FormSumbtFirstName=driver.findElement(By.cssSelector("input.form-control[placeholder='First name']"));
		
	}
}
