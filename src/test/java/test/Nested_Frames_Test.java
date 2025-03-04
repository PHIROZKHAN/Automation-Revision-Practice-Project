package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.Nested_Frames_Page;

public class Nested_Frames_Test extends BaseLibrary {
	
	Nested_Frames_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Nested_Frames_Page();
		
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
	public void clickAtNestedFrame()
	{
		ob.clickOnNestedFrame();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtClick() 
	{
		ob.clickOnClick();
	}
	
}
