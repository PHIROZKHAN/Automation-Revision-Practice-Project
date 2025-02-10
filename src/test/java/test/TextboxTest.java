package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Text_box_page;

public class TextboxTest extends BaseLibrary {
	
	
	Text_box_page ob;
	@Parameters("browser")
	@BeforeTest
	public void launcher(String browser)
	{
		launchUrl(browser);
		
		ob= new Text_box_page();
		
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true)
	public void clickAtPractice() {
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true)
	public void clickAttextBox()
	{
		ob.clickOnTextBox();
	}
	@Test(priority=5,enabled=true)
	public void clickAtFillDetails()
	{
		ob.clickOnFillDetails();
	}
	@Test(priority=6,enabled = true)
	public void clickAtVallidation()
	{
		ob.validation();
	}
	
	
	
	
	
	

}
