package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FileSubMenuElements extends BaseClass {

	// File -> Logoff menu item 
	@FindBy (xpath = "/html/body/div[6]/ul/li[1]/a/span")
	public WebElement fileLogoff;
	
	// File -> Import menu item 
	@FindBy (xpath = "/html/body/div[6]/ul/li[3]/a/span")
	public WebElement fileImport;
		
	// File -> Mobile menu item 
	@FindBy (xpath = "<span class=\"x-menu-item-text\" id=\"txt-mnuMobile\">Mobile</span>")
	public WebElement fileMobile;
		

public FileSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

