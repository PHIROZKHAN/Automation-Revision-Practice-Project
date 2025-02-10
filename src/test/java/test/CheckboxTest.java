package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.ChekboxPage;

public class CheckboxTest extends BaseLibrary
{ 
	ChekboxPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launcher(String browser)
	{
		launchUrl(browser);
		ob= new ChekboxPage(); 
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtclose() throws InterruptedException
	{
		Thread.sleep(2000);
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true)
	public void clickAtCheckbox()
	{
		ob.clickOnCheckbox();
	}
	@Test(priority=5,enabled=true)
	public void clickAtMobile()
	{
		ob.clickOnMobile();
	}
	@Test(priority=6,enabled=true)
	public void clickAtLaptop()
	{
		ob.clickOnLaptop();
	}
	@Test(priority=7,enabled=true)
	public void clickAtdesktop()
	{
		ob.clickOnDesktop();
	}
	
	
	
	
	
	
	
	
	
	
}
