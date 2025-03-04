package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Baseutility.BaseLibrary;
import pages.Modal_Dialogs_Page;
import pages.Nested_Frames_Page;

public class Moadal_Dialogs_Test extends BaseLibrary {
	
	Modal_Dialogs_Page ob;
	@Parameters("browser")
	@BeforeTest
	public void launchre(String br)
	{
		launchUrl(br);
		ob=new Modal_Dialogs_Page();
		
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
	public void clickAtModalDialog()
	{
		ob.clickOnModalDialog();
	}
	@Test(priority=5,enabled=true,groups= {"smoke"})
	public void clickAtSmallModal() 
	{
		ob.clickOnSmallModel();
	}
	@Test(priority=6,enabled=true,groups= {"smoke"})
	public void clickAtLargeModal() 
	{
		ob.clickOnLargeModel();
		
	}
	
}
