package pages;              
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class Accordian_Page extends BaseLibrary {
	
	public Accordian_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	//team member
	// tumhra next day ka kam
	//2rd day work done by team
	// 3 day phiroz work
//3rd dayy team work
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='accordion']")
	private WebElement accordian;
	
	@FindBy(xpath="//button[@data-target='#collapse1']")
	private WebElement paragraph1;
	
	@FindBy(xpath = "//div[@id='collapse1']/div[@class='card-body']/p")
	private WebElement para1text;
	
	@FindBy(xpath = "//button[@data-target='#collapse2']")
	private WebElement paragraph2;
	
	@FindBy(xpath = "//div[@id='collapse2']/div[contains(text(), 'Anim pariatur cliche reprehenderit,')]")
	private WebElement para2text;
	
	@FindBy(xpath = "//button[@data-target='#collapse3']")
	private WebElement paragraph3;
	
	@FindBy(xpath = "//div[@id='collapse3']/div[text()] ")
	private WebElement para3text;
	
	
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
	public void clickOnAccordian()
	{
		waitforclick(accordian);
	}
	
	public void clickOnParagraph1() throws InterruptedException
	{
		Thread.sleep(3000);
		SoftAssert softassert= new SoftAssert();
		waitforclick(paragraph1);
		String Actualtext=para1text.getText();
		String Expected="Accordions are useful when you";
		softassert.assertEquals(true, Actualtext.contains(Expected));
		
		//softassert.assertAll();
	}
	
	public void clickOnParagraph2() 
	{
		waitforclick(paragraph2);
		SoftAssert softassert= new SoftAssert();
		String Actual=para2text.getText();
		//String Expected=getPropertiesData("paragraph2text");
		String Expected="Food truck quinoa nesciunt laborum eiusmod.";
			
		softassert.assertEquals(true, Actual.contains(Expected));
	}

	
	
}
