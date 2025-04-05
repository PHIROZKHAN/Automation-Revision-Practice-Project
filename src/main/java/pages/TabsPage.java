package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;

public class TabsPage extends BaseLibrary {
	
	public TabsPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = " //button[@data-target='#widget']")
	private WebElement widgets;
	
	@FindBy(xpath = "//a[text()='tabs']")
	private WebElement Tabs;
	
	@FindBy(xpath = "//a[@id='home-tab']")
	private WebElement Tabs1;
	
	@FindBy(xpath = "//div[@id='home']/p")
	private WebElement Tab1stext;
	
	@FindBy(xpath = "//a[@id='profile-tab']")
	private WebElement Tabs2;
	
	@FindBy(xpath = "(//div[@id='profile']/p)[2]")
	private WebElement Tabs2text;
	@FindBy(xpath = "//a[@id='contact-tab']")
	private WebElement Tab3;
	@FindBy(xpath = "(//div[@id='contact']/p)[2]")
	private WebElement Tabs3text;
	
	
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
	public void clickOnTabs()
	{
		waitforclick(Tabs);
	}
	public void clickOnTabs1() throws InterruptedException
	{
		waitforclick(Tabs1);
		Thread.sleep(3000);
		String Expected="In order to do campaign";
		String Actual=Tab1stext.getText();
		System.out.println(Actual);
		Assert.assertEquals(true, Actual.contains(Expected));
		
	}
	public void clickOnTabs2() throws InterruptedException
	{
		waitforclick(Tabs2);
		Thread.sleep(3000);
		String Actual=Tabs2text.getText();
		String Expected="choice of specific words makes";
		Assert.assertEquals(true, Actual.contains(Expected));
		
	}
	public void cliclOnTabs3() throws InterruptedException
	{
		waitforclick(Tab3);
		Thread.sleep(2000);
		String Actual=Tabs3text.getText();
		String Expected="they bring to life all have a big impact";
		Assert.assertEquals(true, Actual.contains(Expected));
		
	}

}
