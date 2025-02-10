package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.WebTablePage;

public class WebTableTest extends BaseLibrary {
	
	WebTablePage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launchurl(String browser)
	{
	   launchUrl(browser);	
	   
	   ob= new WebTablePage();
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true)
	public void clickAtPractice() throws InterruptedException
	{ 
		Thread.sleep(3000);
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled= true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true)
	public void clickAtWebtable()
	{
		ob.clickOnWebTables();
	}
	@Test(priority=5,enabled=true)
	public void clickAtNameEmail()
	{
		ob.clickOnNameEmail();
	}
	
	
	
	
	
	

}
