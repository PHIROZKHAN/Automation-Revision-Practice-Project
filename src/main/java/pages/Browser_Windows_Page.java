package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class Browser_Windows_Page extends BaseLibrary {
	
	public Browser_Windows_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement AlertFrameWindow;
	
	@FindBy(xpath="//a[text()='browser windows']")
	private WebElement browserWindow;
	
	@FindBy(xpath = "//div[@id='tab_11']//a[@target='_blank']")
	private WebElement newTab;
	
	@FindBy(xpath = "//a[text()='New Window']")
	private WebElement newWindow;
	
	@FindBy(xpath = "//a[text()='New Window Message']")
	private WebElement newWindowMassage;
	
	@FindBy(xpath = "//textarea[@aria-controls='Alh6id']")
	private WebElement googlesarch;
	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
	public void clickOnAlertFrameWindow() throws InterruptedException
	{	Thread.sleep(5000);
		waitforclick(AlertFrameWindow);
	}
	public void clickOnBrowserWindow()
	{
		waitforclick(browserWindow);
	}
	public void clickOnNewTab() throws InterruptedException
	{
		waitforclick(newTab);
		windowHandle(1);
		googlesarch.sendKeys("mobile" + Keys.ENTER);
	Thread.sleep(5000);
		driver.close();
		
	}
	public void clickOnNewWindow()
	{
		windowHandle(0);
		waitforclick(newWindow);
		windowHandle(1);
		driver.manage().window().maximize();
		//driver.close();
		windowHandle(0);
	}
	public void clickOnNewWindowMassage()
	{
		waitforclick(newWindowMassage);
		driver.manage().window().maximize();
		//driver.close();
		windowHandle(0);
	}
	
	
	
	
	
	

}
