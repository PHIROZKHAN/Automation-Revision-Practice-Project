package pages;              


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class AutocompletePage extends BaseLibrary {
	
	public AutocompletePage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='auto complete']")
	private WebElement Autocomplete;
	
	@FindBy(xpath = "//iframe[@src='Autocomplete.html']")
	private WebElement ifarme;
	
	@FindBy(xpath="//input[@id='myInput']")
	private WebElement textbar;
	
//	@FindBy(xpath = "//div[@class='autocomplete']")
	
	@FindBy(xpath = "/html/body/form")
	private WebElement textbaar;

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
	public void clickOnAutocomplete()
	{
		waitforclick(Autocomplete);
	}
	public void clickOnTextbar()
	{
		Actions act = new Actions(driver);
		driver.switchTo().frame(ifarme);
		waitforclick(textbar);
		textbar.sendKeys("ind");//indonesia 2nd option
		act.sendKeys(Keys.ARROW_DOWN).perform();;
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		//String Actual=textbaar.getText();
		String Actual=textbar.getAttribute("value");
		System.out.println(Actual);
		System.out.println("phiroz");
		String Expected="Indonesia";
		driver.switchTo().defaultContent();

	}

}
