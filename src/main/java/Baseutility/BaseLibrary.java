package Baseutility ;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationutility.ActionUtility;
import applicationutility.Applicationutility;
import applicationutility.Properties_Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary implements Applicationutility ,Properties_Utility,ActionUtility

   {
	
	public static WebDriver driver;
	
	public void launchUrl(String browser)
	{ 
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); // Create a new ChromeDriver instance
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver(); // Create a new ChromeDriver instance
		}
		else
		{
			WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver(); // Create a new ChromeDriver instance	
		}
		
		
		
        

        // Launch URL
        driver.get("https://testingbaba.com/old/");

        // Optional: Maximize the window
        driver.manage().window().maximize();
	//	WebDriverManager.chromedriver().setup();
		//driver.get("https://testingbaba.com/old/");
		//ChromeOptions option = new ChromeOptions();
		//option.setAcceptInsecureCerts(true);
		//option.addArguments("--incognito");
		
		//option.addArguments("--maximize");
	    //driver.manage().window().maximize();
		
	}
//<<<<---------------------Data Reading From Excel------------------------------>>>>
	@Override
	public String getReadData(int sheetno,int row,int col) {
		
		String path="C:\\Users\\PHIROZ KHAN\\Practice_Automation_Maven_project_Jan-2025\\testdata\\Textbox fill.xlsx";
		
		String value="";
		
	   try{
		FileInputStream fis= new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sht = wb.getSheetAt(sheetno);
		   value=sht.getRow(row).getCell(col).getStringCellValue();
	   }
	   catch(Exception e)
		 {
		 	System.out.println("issue getread data"+e); 
		 }
		return value;
	}
//<<<---------------------Data Reading Propertiese File-------------------->>>>
	@Override
	public String getPropertiesData(String key) {
		String value="";
		String path="C:\\Users\\PHIROZ KHAN\\Practice_Automation_Maven_project_Jan-2025\\testdata\\config.properties";
		try {
			FileInputStream fis= new FileInputStream(path);
			Properties prop= new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		    } 
		catch (Exception e) {
			System.out.println("issue get read data from propertiese file");
		    }
		return value;
	}
	
//	<<<-------------------Action class------------------------>>>


	@Override
	public void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	}
	@Override
	public void singleClick(WebElement ele) {
		Actions act= new Actions(driver);
		act.click(ele).perform();
		
	}
	@Override
	public void rightClick(WebElement ele) {
	Actions act= new Actions(driver);
	act.contextClick(ele).perform();
	}
	@Override
	public void dragAndDrop(WebElement ele) {
		Actions act =new Actions(driver);
		act.dragAndDrop(ele, ele);
	}
	@Override
	public void mouseOver(WebElement ele) {
		Actions act = new Actions(driver);
		act.moveToElement(ele);
		
	}
	@Override
	public void click(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void waitforclick(WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}
	@Override
	public void waitforsendkey(WebElement ele, String str) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfAllElements(ele))	;
		ele.clear();		
		ele.sendKeys(str);
		
		
				
	}
	@Override
	public void uploadFile(String Filepath)
	{
	StringSelection ss= new StringSelection(Filepath);	
		Clipboard cb= Toolkit.getDefaultToolkit().getSystemClipboard();
		
		cb.setContents(ss, null);
		try
		{
			Robot rb= new Robot();
			rb.delay(400);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			
		}
		catch(Exception e)
		{
			System.out.println("issue in file uploading");
		}	
	}
	@Override
	 public int getResponseCode(String url ) 
	{
		int getresponse=0;;
		
		try {
			URL curl = new URL (url);
			
			HttpURLConnection huc;	huc = (HttpURLConnection)curl.openConnection();
			//HttpURLConnection huc = (HttpURLConnection)();

			huc.setRequestMethod("GET");
			huc.connect();
			 getresponse=huc.getResponseCode();
			
		} 
		
		catch (IOException e) {
			
			System.out.println(" issue in get response ");
		}
		
		return getresponse;
	}
	@Override
	public void windowHandle(int tab) {
		// TODO Auto-generated method stub
	Set<String>	handles=driver.getWindowHandles();
	ArrayList<String> handle= new ArrayList<String>(handles);
	driver.switchTo().window(handle.get(tab));
	}
   }
	
	
	 
	 


