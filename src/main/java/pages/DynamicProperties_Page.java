package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Baseutility.BaseLibrary;

public class DynamicProperties_Page extends BaseLibrary {
	
	public DynamicProperties_Page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = "//a[@onclick='changeText(this),dynamicproperties();']")
	private WebElement clickOnDynamicProperties;
	
	@FindBy(xpath = "//button[@id='Enable']")
	private WebElement clickOnenable;
	
	@FindBy(xpath = "//button[text()='Color Change']")
	private WebElement clorchange;
	
	@FindBy(xpath = "//button[@id='Visible']")
	private WebElement visibleInFivesecond;
	
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
	public void clickOnDynamicProperties()
	{
		waitforclick(clickOnDynamicProperties);
	}
	public void clickOnEnable()
	{
		waitforclick(clickOnenable);
		
//		String expected="Color Change";
//	    	String actual=clorchange.getText();
//	    	
//	    	Assert.assertEquals(actual, expected);
	
	}
	public void clickOnVisibleInFiveSecond()
	{
		visibleInFivesecond.isDisplayed();
		
	}
	
	
	
	
	
	

}
