package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Baseutility.BaseLibrary;

public class Nested_Frames_Page extends BaseLibrary {
	
	public Nested_Frames_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement AlertFrameWindow;
	
	@FindBy(xpath="//a[text()='nested frames']")
	private WebElement  nestedFrame;
	
	
	@FindBy(xpath="//iframe[@frameborder='0']")
	private WebElement iframe0;
	@FindBy(xpath = " //iframe[@src='text.html']")
	private WebElement iframe1;
	
	@FindBy(xpath = "//iframe[@src='example.html']")
	private WebElement iframe2;
	
	@FindBy(xpath = "//a[text()='Click Here']")
	private WebElement click;
	
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
	public void clickOnNestedFrame()
	{
		waitforclick(nestedFrame);
	}
	public void clickOnClick() 
	{ 
		driver.switchTo().frame(iframe0);
		driver.switchTo().frame(iframe1);
		driver.switchTo().frame(iframe2);
		waitforclick(click);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	
}
