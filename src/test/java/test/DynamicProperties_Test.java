package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.DynamicProperties_Page;

public class DynamicProperties_Test extends BaseLibrary{
	
	DynamicProperties_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launcher(String br)
	{
		launchUrl(br);
		ob= new DynamicProperties_Page();
	}
	@Test(priority=1)
	public void clickAtClose()
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
	public void clickAtDynamicProperties()
	{
		ob.clickOnDynamicProperties();
	}
	@Test(priority=5)
	public void clickAtEnable()
	{
		ob.clickOnEnable();
	}
	@Test(priority=6)
	public void clickAtVisibleInFiveSecond()
	{
		ob.clickOnVisibleInFiveSecond();
	}
	

}
