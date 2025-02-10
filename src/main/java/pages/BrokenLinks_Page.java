package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//a[text()='Moved']")
	private WebElement moved;
	
	@FindBy(xpath = "//a[text()='Bad Request']")
	private WebElement badrequest;
	
	@FindBy(xpath = "//a[text()='Unauthorized']")
	private WebElement unauthorize;
	
	@FindBy(xpath = "//a[text()='Forbidden']")
	private WebElement forbidden;
	
	@FindBy(xpath="//a[text()='Not Found']")
	private WebElement notfound;
	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
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
			
			int resp=getResponseCode(url);
			
			if(resp==200)
			{
				System.out.println("these are the links ok ");
			}
			else
			{
				System.out.println("these are the links broken ");
			}
		}
	}
	
	public void clickOnDemo() throws InterruptedException
	{
		demo.click();
		close.click();
		driver.manage().window().maximize();
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		Thread.sleep(1000);
		windowHandle(0);
		}
	
	public void clickOnCreated()
	{
		
	}
}