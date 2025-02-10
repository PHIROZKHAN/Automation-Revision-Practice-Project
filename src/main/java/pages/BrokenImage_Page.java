package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class BrokenImage_Page extends BaseLibrary {

	public BrokenImage_Page ()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[@href=\"#tab_10\"  ]")
	private WebElement brokenimage;
	
	@FindBy(xpath = "//img")
	private List<WebElement> brokenimagelist; 
	
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
	public void clickOnBrokenImage()
	{
		waitforclick(brokenimage);
	}
	public void veryfyLink()
	{
		System.out.println(" all image links are here below ");
		for(WebElement dd:brokenimagelist)
		{
		String url=dd.getAttribute("src");
		System.out.println(url);
		
		int rsp = getResponseCode(url);
		
		if(rsp== 200) {
			System.out.println("Link is Okay ");
		}
		else {
			System.out.println("bad Request...!!!");
		}
		}
	}
	
}
