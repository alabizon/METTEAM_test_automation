package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HelpSubMenuElements extends BaseClass {

	// Help -> Help menu item 
	@FindBy (id = "txt-mnuHelpHelps")
	public WebElement helpHelp;
	
	// Help -> Website menu item 
	@FindBy (id = "txt-mnuHelpWebsite")
	public WebElement helpWebsite;
		
	// Help -> About menu item 
	@FindBy (id = "txt-mnuHelpAbout")
	public WebElement helpAbout;
		

public HelpSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

