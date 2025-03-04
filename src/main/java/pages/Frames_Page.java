package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;

public class Frames_Page extends BaseLibrary {
	
	public Frames_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement AlertFrameWindow;
	
	@FindBy(xpath="//a[text()='frames'] ")
	private WebElement  frames;
	@FindBy(xpath="//iframe[@title='Iframe Example']")
	private WebElement iframe;
	@FindBy(xpath = "  //h1[contains (text() , ' a sample page')]")
	private WebElement Frame1;
	
	@FindBy(xpath = "//h1[contains (text() , ' a sample page')] ")
	private WebElement Frame2;
	
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
	public void clickOnFrame()
	{
		waitforclick(frames);
	}
	public void clickOnFrame1() 
	{ driver.switchTo().frame(iframe);
		waitforclick(Frame1);
		String Actual=Frame1.getText();
		//String Expected=""
	Assert.assertEquals(true, Actual.contains("a sample page"));
		
		driver.switchTo().defaultContent();
	}
	public void clickOnFrame2()
	{
		driver.switchTo().frame(iframe);
		waitforclick(Frame2);
		String Actual=Frame2.getText();
		String Expected="a sample page";
		
		Assert.assertEquals(true, Actual.contains(Expected));
		
		driver.switchTo().defaultContent();
		
	}
	
}
