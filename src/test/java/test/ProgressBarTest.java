package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;

import pages.ProgressBarPage;


public class ProgressBarTest extends BaseLibrary{
	
	ProgressBarPage ob;
	@Parameters("browser")
	@BeforeTest
	public void  launcher(String br)
	{
		launchUrl(br);
		
		ob= new ProgressBarPage();
		
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
	public void clickAtProgressbar()
	{
		ob.clickOnProgress();
		
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtStart() throws InterruptedException
	{
		ob.clickOnStart();
		
	}

}
