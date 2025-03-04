package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;

import pages.ProgressBarPage;
import pages.TabsPage;


public class TabsTest extends BaseLibrary{
	
	TabsPage ob;
	@Parameters("browser")
	@BeforeTest
	public void  launcher(String br)
	{
		launchUrl(br);
		
		ob= new TabsPage();
		
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
	public void clickAtTabs()
	{
		ob.clickOnTabs();
		
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtTabs1() throws InterruptedException
	{
		ob.clickOnTabs1();
		
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtTabs2() throws InterruptedException
	{
		ob.clickOnTabs2();
		
	}
	@Test(priority=7,enabled=true,groups= {"smoke"})
	public void clickAtTabs3() throws InterruptedException
	{
		ob.cliclOnTabs3();
	}
	
}
