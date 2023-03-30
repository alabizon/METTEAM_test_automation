package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HelpSubMenuElements extends BaseClass {

	// Help -> Help menu item 
	@FindBy (id = "ext-gen180")
	public WebElement helpHelp;
	
	// Help -> Website menu item 
	@FindBy (id = "ext-gen182")
	public WebElement helpWebsite;
		
	// Help -> About menu item 
	@FindBy (id = "ext-gen185")
	public WebElement helpAbout;
		

public HelpSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

