package pages;              
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Baseutility.BaseLibrary;

public class MenuPage extends BaseLibrary {
	
	public MenuPage()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath = "//a[text()='menu']")
	private WebElement Menu;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement Home;
	
	@FindBy(xpath = "//a[text()='About']")
	private WebElement About;
	
	//@FindBy(xpath = "//div[@id='tab_23']/descendant::li/i[@class='fas fa-angle-down']")
	@FindBy(xpath="(//nav[@id='navbar']/descendant::i[@class=\"fas fa-angle-down\"])[1]")
	private WebElement Services;
	
	@FindBy(xpath = "//div[@id='tab_23']/descendant::li/a[text()='Web Development']")
	private WebElement WebDevlopment;
	
	@FindBy(xpath="//a[contains(text(),'Mobile Development')]")
	private WebElement mobiledevlopment;
	
	@FindBy(xpath = "(//nav[@id='navbar']/descendant::li/i[@class='fas fa-angle-down'])[2] ")
	private WebElement blog ;
	
	@FindBy(xpath="//a[contains(text(),'JavaScript')]")
	private WebElement javascript;
	
	@FindBy(xpath = "//nav[@id='navbar']/descendant::a[text()='Contact']")
	private WebElement Contact;

	
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
	public void clickOnMenu()
	{
		waitforclick(Menu);
	}
	
	public void clickOnHomeAbout() throws InterruptedException
	{
		
		mouseOver(Home);
		
		Thread.sleep(3000);
		
		mouseOver(About);
		
	}
	public void clickOnServices() throws InterruptedException 
	{
		
		mouseOver(Services);
		Thread.sleep(4000);
		waitforclick(mobiledevlopment);
		System.out.println("clicked on mobiledevelopment");
		
	}
	public void clickOnBlog() throws InterruptedException
	{
		Thread.sleep(2000);
		mouseOver(blog);
		Thread.sleep(2000);
		waitforclick(javascript);
		System.out.println("clicked on javascript");
		
	}
	public void clickOnContact()
	{
		
		mouseOver(Contact);
	}

	
	
}
