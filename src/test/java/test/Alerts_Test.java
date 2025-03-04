package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Alerts_Page;
import pages.Browser_Windows_Page;

public class Alerts_Test extends BaseLibrary {
	
	Alerts_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Alerts_Page();
		
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
	public void clickAtAlerts()
	{
		ob.clickOnAlerts();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtMyalerts() 
	{
		ob.clickOnMyalerts();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtAlerts5sec() throws InterruptedException
	{
		ob.clickOnAlert5sec();
	}
	@Test(priority=7,enabled=true,groups= {"smoke"})
	public void clickAtMyconfirmAlerts() throws InterruptedException
	{
		ob.clickOnConfirmalerts();
	}
	
	@Test(priority=8,enabled=true,groups= {"smoke"})
	public void clickAtMypromptsalerts()
	{
		ob.clickOnMypromptalerts();
	}
	
	
	
	
	
	
	
	
	
	

}
