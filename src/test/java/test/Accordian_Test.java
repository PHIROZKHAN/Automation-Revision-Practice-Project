package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Accordian_Page;

public class Accordian_Test extends BaseLibrary {
	
	Accordian_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Accordian_Page();
		
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
	public void clickAtWidget()
	{
		ob.clickOnWidget();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtAccordian()
	{
		ob.clickOnAccordian();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtParagraph1() throws InterruptedException
	{
		ob.clickOnParagraph1();
	}
	
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtPragraph2() 
	{
		ob.clickOnParagraph2();
	}
	@Test(priority=7,enabled=false,groups= {"smoke"})
	public void clickAtPragraph3()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
