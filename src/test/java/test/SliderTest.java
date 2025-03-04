package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Accordian_Page;
import pages.SliderPage;

public class SliderTest extends BaseLibrary {
	
	SliderPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new SliderPage();
		
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
	public void clickAtSlider()
	{
		ob.clickOnSlider();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtSliderbar() 
	{
		ob.clickOnSliderbar();
	}
	

}
