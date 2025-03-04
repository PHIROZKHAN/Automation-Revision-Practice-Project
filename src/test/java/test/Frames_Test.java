package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Browser_Windows_Page;
import pages.Frames_Page;

public class Frames_Test extends BaseLibrary {
	
	Frames_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Frames_Page();
		
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
	public void clickAtAlertFrameWindow() throws InterruptedException
	{
		ob.clickOnAlertFrameWindow();
	}
	@Test(priority=4,enabled=true,groups= {"smoke"})
	public void clickAtFrame()
	{
		ob.clickOnFrame();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtFrame1() throws InterruptedException
	{
		ob.clickOnFrame1();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtFrame2()
	{
		ob.clickOnFrame2();
	}
	
}
