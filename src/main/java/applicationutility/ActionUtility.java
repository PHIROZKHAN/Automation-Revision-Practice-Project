package applicationutility;

import org.openqa.selenium.WebElement;

public interface ActionUtility {
	
	public void doubleclick(WebElement ele);
	public void click(WebElement ele);
	public void rightClick(WebElement ele);
	public void dragAndDrop(WebElement ele);
	public void mouseOver(WebElement ele);
	public void singleClick(WebElement ele);
	public void waitforclick(WebElement ele);
    public void waitforsendkey(WebElement ele,String str);
    public void uploadFile(String Filepath);
    public int getResponseCode(String url);
    public void windowHandle(int tab);
}
