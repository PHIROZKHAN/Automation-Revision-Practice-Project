package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.SelectMenuPage;

public class SelectMenuTest extends BaseLibrary {
	
	SelectMenuPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new SelectMenuPage();
		
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
	public void clickAtSelectMenu()
	{
	ob.clickOnSelectMenu();
	}
	@Test(priority=5,enabled=true, groups= {"smoke"})
	public void clickAtSelectValue()
	{
		ob.clickOnSelectValue();
	}

}
