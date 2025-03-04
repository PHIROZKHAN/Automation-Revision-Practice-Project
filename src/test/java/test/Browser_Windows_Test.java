package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Browser_Windows_Page;

public class Browser_Windows_Test extends BaseLibrary {
	
	Browser_Windows_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Browser_Windows_Page();
		
	}
	@Test(priority=1,enabled=true,groups= {"smoke"})
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2 ,enabled=true ,groups={"smoke"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke"})
	public void clickAtAlertFrameWindow() throws InterruptedException
	{
		ob.clickOnAlertFrameWindow();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtBrowserWindow()
	{
		ob.clickOnBrowserWindow();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtNewTab() throws InterruptedException
	{
		ob.clickOnNewTab();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtNewWindow()
	{
		ob.clickOnNewWindow();
	}
	@Test(priority=7,enabled=true,groups= {"smoke"})
	public void clickAtNewWindowMassage()
	{
		ob.clickOnNewWindowMassage();
	}
	
	
	
	
	
	
	
	
	
	
	

}
