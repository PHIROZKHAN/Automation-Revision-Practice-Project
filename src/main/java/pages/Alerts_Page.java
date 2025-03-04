package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class Alerts_Page extends BaseLibrary {
	
	public Alerts_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement AlertFrameWindow;
	
	@FindBy(xpath="//a[text()='alerts']")
	private WebElement alerts;
	
	@FindBy(xpath = "//button[@onclick='myalert()'] ")
	private WebElement myalert;
	
	@FindBy(xpath = " //button[@onclick='aftersec5()']")
	private WebElement alert5sec;
	
	@FindBy(xpath = " //button[@onclick='myconfirm()']")
	private WebElement myconfirmalert;
	
	@FindBy(xpath = " //button[@onclick='myprompt()']")
	private WebElement mypromptalert;
	
	public void clickOnClose()
	{
		waitforclick(close);
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
	public void clickOnAlertFrameWindow() throws InterruptedException
	{	Thread.sleep(2000);
		waitforclick(AlertFrameWindow);
	}
	public void clickOnAlerts()
	{
		waitforclick(alerts);
	}
	public void clickOnMyalerts() 
	{
		waitforclick(myalert);
		
		driver.switchTo().alert().accept();

	}
	public void clickOnAlert5sec() throws InterruptedException
	{
		waitforclick(alert5sec);
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
	}
	public void clickOnConfirmalerts() throws InterruptedException
	{
		waitforclick(myconfirmalert);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}
	public void clickOnMypromptalerts()
	{
		waitforclick(mypromptalert);
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("phiroz");
		alert.accept();
	}
	
	
	
	
	
	
	

}
