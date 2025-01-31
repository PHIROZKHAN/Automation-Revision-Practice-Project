package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseutility.BaseLibrary;
import pages.FileUploadPage;

public class UploadDownloadTest extends BaseLibrary {
	
	FileUploadPage ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		
		ob= new FileUploadPage();
	}
	
	@Test(priority=1,enabled=true)
	public void clickAtClose()
	{
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
	public void clickAtUploadDownload()
	{
		ob.clickOnUploaddownload();
	}
	@Test(priority=5,enabled=true)
	public void clickAtUpload()
	{
		ob.clickOnUpload();
	}
	
	
	
	
	
	
	

}
