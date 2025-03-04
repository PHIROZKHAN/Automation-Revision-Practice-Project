package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Baseutility.BaseLibrary;

public class ProgressBarPage extends BaseLibrary {
	
	public ProgressBarPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = " //button[@data-target='#widget']")
	private WebElement widgets;
	
	@FindBy(xpath = "//*[text()='progress bar']")
	private WebElement progressbar;
	
	@FindBy(xpath = "//button[@id='resetButton']")
	private WebElement startbtn;
	
	@FindBy(xpath = "//div[@id='myBar']")
	private WebElement mybar;
	
	
	
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
	public void clickOnProgress()
	{
		waitforclick(progressbar);
	}
	public void clickOnStart() throws InterruptedException
	{
		waitforclick(startbtn);
		Thread.sleep(3000);
		String Actual=mybar.getAttribute("style");
		String Expected = "width: 100%;";
		//approach for validation
		//String Actual= mybar.getText();
//		String Expected = "100%";
		Assert.assertEquals(Actual, Expected);
	}

}
