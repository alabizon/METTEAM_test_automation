package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class HelpSubMenuElements extends BaseClass {

	// Help -> Help menu item 
	@FindBy (xpath = "/html/body/div[9]/ul/li[1]/a/span")
	public WebElement helpHelp;
	
	// Help -> Website menu item 
	@FindBy (xpath = "/html/body/div[9]/ul/li[2]/a/span")
	public WebElement helpWebsite;
		
	// Help -> About menu item 
	@FindBy (xpath = "/html/body/div[9]/ul/li[4]/a/span")
	public WebElement helpAbout;
		

public HelpSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

