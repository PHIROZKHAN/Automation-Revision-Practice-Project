package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class FileUploadPage extends BaseLibrary{
	
	public FileUploadPage ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(text(),'×')]")
	private WebElement close;
	
	@FindBy(xpath = " //a[contains(text(),'Practice')]")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath = " //a[contains(text(),'upload and download')]")
	private WebElement uploaddownload;
	
	@FindBy(xpath = "//input[@id='File1']")
	private WebElement upload;
	
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
	public void clickOnUploaddownload()
	{
		waitforclick(uploaddownload);
	}
	public void clickOnUpload()
	{
		uploadFile(null);
		//waitforsendkey(upload, "C:\\Users\\PHIROZ KHAN\\OneDrive\\Desktop");
	}
	
	

}
