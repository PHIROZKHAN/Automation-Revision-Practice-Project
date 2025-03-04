package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.BrokenLinks_Page;

public class BrokenLinks_Test extends BaseLibrary {
	
	BrokenLinks_Page ob;
	@BeforeTest
	@Parameters("browser")
	public void launcher(String br)
	{
		launchUrl(br);
		ob = new BrokenLinks_Page();
	}
	@Test(priority=1)
	public void clickAtclose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4)
	public void clickAtLinks()
	{
		ob.clickOnLinks();
	}
	@Test(priority=5 , enabled=false)
	public void clickAtveryfyLink()
	{
		ob.veryfyLink();
	}
	@Test(priority=6)
	public void clickAtDemo() throws InterruptedException
	{
		ob.clickOnDemo();
	}
	
	@Test(priority=7)
	public void clickAtcreat()
	{
		ob.clickOnCreated();
	}
	
	@Test(priority=8 )
	public void clickAtNoContent()
	{
		ob.clickOnNoContent();
	}
	
	@Test(priority=9)
	public void clickAtMoved()
	{
		ob.clickOnMoved();
	}
	
	
	
	
	
	
	
	
	
	
	

}
