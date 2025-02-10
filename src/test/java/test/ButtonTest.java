package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.ButtonsPage;

public class ButtonTest extends BaseLibrary {
	
	ButtonsPage ob;
	
	@BeforeTest
	@Parameters("browser")
	public void launcher(String browser)
	{
		launchUrl(browser);
		ob= new ButtonsPage();
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtClose() throws InterruptedException
	{
		Thread.sleep(3000);
		ob.clickOnClose();
	}
	@Test(priority=2,enabled=true)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,enabled=true)
	public void clickAtElement()
	{
		ob.clickOnElement();
	}
	@Test(priority=4,enabled=true)
	public void clickAtButtons()
	{
		ob.clickOnButtons();
	}
	@Test(priority=5,enabled=true)
	public void clickAtDoubleclick()
	{
		ob.clickOnDoubleclick();
	}
	@Test(priority=6,enabled=true)
	public void clickAtRight()
	{
		ob.clickOnRightClick();
	}

	@Test(priority=7,enabled=true)
	public void clickAtSnigleclick()
	{
		ob.clickOnSingleClick();
	}
	
	
	
	
	
}
