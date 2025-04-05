package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.ToolTipsPage;



public class ToolTipsTest extends BaseLibrary{
	
	ToolTipsPage ob;
	@Parameters("browser")
	@BeforeTest
	public void  launcher(String br)
	{
		launchUrl(br);
		
		ob= new ToolTipsPage();
		
	}
	
	@Test(priority=1,enabled=true,groups= {"smoke"})
	public void clickAtClose()
	{
		ob.clickOnClose();
		
	}
	@Test(priority=2,enabled=true,groups= {"smoke"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true,groups= {"smoke"})
	public void clickAtWidgets()
	{
		ob.clcikOnWidgets();
		
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtHover1() throws InterruptedException
	{
	ob.clickOnHover1();	
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtHover2() throws InterruptedException
	{
		ob.clickOnHover2();
		
	}
	
}
