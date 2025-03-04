package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.Accordian_Page;
import pages.DatePickerPage;

public class DatePickerTest extends BaseLibrary {
	
	DatePickerPage ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new DatePickerPage();
		
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
	public void clickAtDatePicker()
	{
		ob.clickOnDatePicker();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtDate()
	{
		ob.clickOnDate();
	}
	
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtDatetime() 
	{
		ob.clickOnDatetime();
	}
	
}
