package pages;              
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class SelectMenuPage extends BaseLibrary {
	
	public SelectMenuPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='select menu']")
	private WebElement SelectMenu;
	
	@FindBy(xpath="(//select[@class='form-control'])[2]")
	private WebElement selectValue;
	
//	@FindBy(xpath=" //option[text()='Group 2, Option 2']")
//	private WebElement option3;
	
	@FindBy(xpath = "(//select[@class='form-control'])[3]")
	private WebElement selectone;
	
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
	public void clickOnSelectMenu()
	{
		waitforclick(SelectMenu);
	}
	
	public void clickOnSelectValue()
	{
		Select sel = new Select (selectValue);
		
		sel.selectByIndex(3);
		
	}
	
}
