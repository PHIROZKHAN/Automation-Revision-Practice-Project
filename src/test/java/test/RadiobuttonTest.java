package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.RadioButtonsPage;

public class RadiobuttonTest extends BaseLibrary{
	
	RadioButtonsPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launchurl(String browser)
	{
		launchUrl(browser);
		ob = new RadioButtonsPage();
		
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true)
	public void clcikAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled= true)
	public void clickAtRadiobutton()
	{
		ob.clickOnRadioButton();
	}
	@Test(priority=5,enabled=true)
	public void clickAtYesbutton()
	{
		ob.clickOnYesButton();
	}
	@Test(priority=6,enabled=true)
	public void clickAtImpressive()
	{
		ob.clickOnImpressive();
	}
	@Test(priority=7,enabled=true)
	public void clickAtNobutton()
	{
		ob.clickOnNoButton();
	}
	
	
	

}
