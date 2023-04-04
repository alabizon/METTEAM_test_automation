package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SetupSubMenuElements extends BaseClass {

	// Setup -> Contacts menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[1]")
	public WebElement setupContacts;
	
	// Setup -> Users menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[2]")
	public WebElement setupUsers;
		
	// Setup -> Services menu item 
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[3]")
	public WebElement setupServices;
		

public SetupSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

