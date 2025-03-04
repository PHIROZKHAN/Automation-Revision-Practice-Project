package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class Modal_Dialogs_Page extends BaseLibrary {
	
	public Modal_Dialogs_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement AlertFrameWindow;
	
	@FindBy(xpath="//a[contains(text() ,'modal dialogs')]")
	private WebElement modal_dialogs;
	
	
	@FindBy(xpath="//button[@data-target='#exampleModal1']")
	private WebElement smallModal;
	@FindBy(xpath = "//div[@id='exampleModal1']/descendant::div[5]/button[@class='btn btn-primary']")
	private WebElement smallclosebtn;
	//@FindBy (xpath = "//div[@class='modal-body'][contains(text() ,'This is a small modal')]")
	@FindBy(xpath = "//*[@id='exampleModal1']/descendant::div[@class='modal-body']")
	private WebElement smallbtntext;
	
	
	@FindBy(xpath = "//button[@data-target='#exampleModal2'] ")
	private WebElement largeModal;
	@FindBy(xpath = "(//button[@class='btn btn-primary'][contains(text(),'Close')])[2]")
	private WebElement largeclosebtn;
	@FindBy(xpath = "//div[@class='modal-body']/p/b[text()='This is a Large modal.']")
	private WebElement largebtntext;
	

	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
	public void clickOnAlertFrameWindow()
	{
		waitforclick(AlertFrameWindow);
	}
	public void clickOnModalDialog()
	{
		waitforclick(modal_dialogs);
	}
	public void clickOnSmallModel() 
		{
		SoftAssert softAssert= new SoftAssert();
		
	   waitforclick(smallModal);
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   String Actual=smallbtntext.getText();
	   System.out.println(Actual);
	  // String Expected="This is a small modal. It has very less content";
	  
	   String Expected=getPropertiesData("smallModal");
	   System.out.println(Expected);
	  // softAssert.assertEquals(true,Actual.contains(Expected));
	 softAssert.assertEquals(Actual,Expected);
	 
	//Assert.assertEquals(Actual, Expected);
	   waitforclick(smallclosebtn);
	   
     softAssert.assertAll();
	}
	
	public void clickOnLargeModel()
	{
		waitforclick(largeModal);
//		String Actual=largebtntext.getText();
//		String Expected=getPropertiesData("Large Modal");
//		Assert.assertEquals(Actual, Expected);
//		
		
		System.out.println("nitish");
		waitforclick(largeclosebtn);
		
	}
	
	
	
	
	
	
}
