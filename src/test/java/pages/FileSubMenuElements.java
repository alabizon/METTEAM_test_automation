package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FileSubMenuElements extends BaseClass {

	// File -> Logoff menu item 
	@FindBy (id = "txt-mnuLogoff")
	public WebElement fileLogoff;
	
	// File -> Import menu item 
	@FindBy (id = "txt-mnuImport")
	public WebElement fileImport;
		
	// File -> Mobile menu item 
	@FindBy (id = "txt-mnuMobile")
	public WebElement fileMobile;
		

public FileSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

