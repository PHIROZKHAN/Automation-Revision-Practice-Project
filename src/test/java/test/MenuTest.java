package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.MenuPage;

public class MenuTest extends BaseLibrary {
	
	MenuPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new MenuPage();
		
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
	public void clickAtMenu()
	{
		ob.clickOnMenu();
	}
	@Test(priority=5,enabled=true, groups= {"smoke"})
	public void clickAtHomeAbout() throws InterruptedException
	{
		ob.clickOnHomeAbout();
	}
	
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtServices() throws InterruptedException 
	{
		ob.clickOnServices();
	}
	@Test(priority=7,enabled=false,groups= {"smoke"})
	public void clickAtBlog() throws InterruptedException
	{
		ob.clickOnBlog();
	}
	@Test(priority=8,enabled=true,groups= {"smoke"})
	public void clickAtContact()
	{
	     ob.clickOnContact();
	}
	
	
	
	
	
	
	
	
	
	
	

}
