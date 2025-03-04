package pages;              
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class DatePickerPage extends BaseLibrary {
	
	public DatePickerPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='date picker']")
	private WebElement DatePicker;
	
	@FindBy(xpath="//div[@id='tab_18']/descendant::input[@type='date']")
	private WebElement date;
	
	@FindBy(xpath = "//div[@id='tab_18']/descendant::input[@type='datetime-local']")
	private WebElement datetime;

	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
	public void clickOnWidget()
	{	
		waitforclick(widget);
	}
	public void clickOnDatePicker()
	{
		waitforclick(DatePicker);
	}
	public void clickOnDate() 
	{
		date.sendKeys("22-03-2025");

	}
	public void clickOnDatetime() 
	{
		datetime.sendKeys("13-05-2025 17:22");
	}
	
}
