package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Baseutility.BaseLibrary;
public class ToolTipsPage extends BaseLibrary {
	
	public ToolTipsPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = " //button[@data-target='#widget']")
	private WebElement widgets;
	
	@FindBy(xpath = "//a[text()='tool tips']")
	private WebElement Tooltip;
	
	@FindBy(xpath = " //button[@data-toggle='tooltip']")
	private WebElement hovertosee1;
//	@FindBy (xpath = "//button[@title='you hovered over the button']")
//	private WebElement Title;
	
	@FindBy(xpath = "//input[@placeholder='Hover me to see']")
	private WebElement hovertosee2;
	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	
	public void clickOnPractice()
	{
		
		waitforclick(practice);
	}
	
	public void clcikOnWidgets()
	{
		waitforclick(widgets);
	}
	public void clickOnTootip()
	{
		waitforclick(Tooltip);
	}
	public void clickOnHover1() throws InterruptedException
	{
		mouseOver(hovertosee1);
		Thread.sleep(3000);
		String Expected="you hovered over the button";
		String Actual=hovertosee1.getAttribute("title");
		System.out.println(Actual);
		Assert.assertEquals(true, Actual.contains(Expected));
		
	}
	public void clickOnHover2() throws InterruptedException
	{
		mouseOver(hovertosee2);
		Thread.sleep(3000);
		//String Actual=
		///String Expected="choice of specific words makes";
		//Assert.assertEquals(true, Actual.contains(Expected));
		
	}

}
