package pages;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class BrokenLinks_Page extends BaseLibrary {

	public BrokenLinks_Page ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[@href='#tab_6']")
	private WebElement Link;
	
	@FindBy(xpath = "//a")
	private List<WebElement> brokenLinkslist; 
	
	@FindBy(xpath = "//a[text()='Demo Page']")
	private WebElement demo;
	
	@FindBy(xpath = "//a[text()='Created']")
	private WebElement creat;
	
	@FindBy(xpath = "//a[text()='No Content']")
	private WebElement content;
	
	@FindBy(xpath = "//p[@id='link-result']")
	//@FindBy(xpath = "//a[text()='Moved']")
	private WebElement moved;
	
	
	@FindBy(xpath = "//a[text()='Bad Request']")
	private WebElement badrequest;
	
	@FindBy(xpath = "//a[text()='Unauthorized']")
	private WebElement unauthorize;
	
	@FindBy(xpath = "//a[text()='Forbidden']")
	private WebElement forbidden;
	
	@FindBy(xpath="//a[text()='Not Found']")
	private WebElement notfound;
	SoftAssert softassert= new SoftAssert();
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}

	// phiroz kaam pura kr diya
	public void clickOnElement()
	{
		waitforclick(element);
	}
	public void clickOnLinks()
	{
		waitforclick(Link);
	}
	public void veryfyLink()
	{
		System.out.println("printing all the links which are persent in this page ");
		for(WebElement link:brokenLinkslist)
		{
			
			String url=link.getAttribute("href");
			
			System.out.println(url);
			
			int resp=getResponseCode(url);
			
			
			
			if(resp==200)
			{
				System.out.println("this is the link ok ");
			}
			else
			{
				System.out.println("this is the link broken ");
			}
		}
	}
	
	public void clickOnDemo() throws InterruptedException
	{
		Thread.sleep(6000);
		demo.click();
		windowHandle(1);
		close.click();
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(1000);
		windowHandle(0);
		}
	
	public void clickOnCreated()
	{
		creat.getText();
		String Actual= creat.getText();
		String Ecpected=" 201 ";
		softassert.assertEquals(true,Actual.contains(Ecpected));
		
	}
	public void clickOnNoContent()
	{
		content.click();
		String actual=content.getText();
//		String expected=" 204 ";
		
		softassert.assertEquals(true,actual.contains("204") );
		
	}
	
	public void clickOnMoved()
	{
		moved.click();
	String	Actual= moved.getText();
	System.out.println(Actual);
	//String Expected= "301";
		Assert.assertEquals(true,Actual.contains("301"));
	}
	
}
