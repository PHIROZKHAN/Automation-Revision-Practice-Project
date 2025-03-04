package pages;              
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class SliderPage extends BaseLibrary {
	
	public SliderPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='slider']")
	private WebElement slider;
	
	@FindBy(xpath="//input[@id='range-slider']")
	private WebElement sliderbar;
	
	
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
	public void clickOnSlider()
	{
		waitforclick(slider);
	}
	public void clickOnSliderbar()
	{
		dragAndDropAt(sliderbar, 40, 00);
	}
	
}
