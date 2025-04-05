package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Interactions_Page;

public class Interactions_Test extends BaseLibrary
  {
	
	Interactions_Page ob;	
	
	@Parameters("browser")
	@BeforeTest
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new Interactions_Page();
	}
	@Test(priority=1, enabled = true ,groups= {"smoke"})
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2, enabled=true , groups = {"smoke"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3 ,enabled=true , groups= {"smoke"})
	public void clickAtInteractions()
	{
		ob.clickOnInteractions();
	}
	@Test(priority=4,enabled= true , groups = {"smoke"})
	public void clickAtDragable()
	{
		ob.clickOnDragable();
	}
	@Test(priority=5 , enabled= true , groups= {"smoke"})
	public void clickAtDragablePoint() throws InterruptedException
	{
		ob.clickOnDragablepoint();
	}
	
	

}
