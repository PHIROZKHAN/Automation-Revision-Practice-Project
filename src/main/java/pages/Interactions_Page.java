package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutility.BaseLibrary;

public class Interactions_Page  extends BaseLibrary
    {
	
	public Interactions_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[contains(text(),'×')]")
	private WebElement close;
	
	@FindBy(xpath="//a[contains(text(),'Practice')]")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target='#interations']")
	private WebElement interactions;
	
	@FindBy(xpath = " //a[contains(text(),'draggable')]")
	private WebElement dragable;
	
	@FindBy(xpath="//div[@id='draggable']")
	private WebElement dargablepoint;
	
	@FindBy(xpath="//iframe[@src='Checkbox.html']")
	private WebElement frame;
	
	public void clickOnClose()
	{
		waitforclick(close);
	
	}
	public void clickOnPractice()
	{
		waitforclick(practice);
	}
	public void clickOnInteractions()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);",interactions);
		
		interactions.click();
		
	}
	public void clickOnDragable()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",dragable);
		
		dragable.click();
		
		
	}
	public void clickOnDragablepoint() throws InterruptedException
	{
		
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		dragAndDropAt(dargablepoint, 530, 800);
		
		driver.switchTo().defaultContent();
		
		
	}
	
	
	
	

}
