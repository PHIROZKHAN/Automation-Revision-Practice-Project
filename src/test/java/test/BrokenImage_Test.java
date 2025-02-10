package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.BrokenImage_Page;

public class BrokenImage_Test extends BaseLibrary {
	
	BrokenImage_Page ob;
	@BeforeTest
	@Parameters("browser")
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new BrokenImage_Page();
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
	public void clickAtBrokenImage()
	{
		ob.clickOnBrokenImage();
	}
	@Test(priority=5)
	public void clickAtVerify()
	{
		ob.veryfyLink();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
