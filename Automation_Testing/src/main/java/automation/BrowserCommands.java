package automation;

public class BrowserCommands extends Base
{

	public static void main(String[] args)
	{
		BrowserCommands browsercommands=new BrowserCommands();
		browsercommands.browserInitialisation();
		browsercommands.browserCommands();
		browsercommands.driverQuiteAndClose();

	}
	public void browserCommands()
	{
		//String title=driver.getTitle();
		//System.out.println(title);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		String pagesource=driver.getPageSource();
		System.out.println();
	}

}
