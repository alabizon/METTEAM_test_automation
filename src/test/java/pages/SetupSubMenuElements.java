package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SetupSubMenuElements extends BaseClass {

	// Setup -> Contacts menu item 
	@FindBy (id = "ext-gen68")
	public WebElement setupContacts;
	
	// Setup -> Users menu item 
	@FindBy (id = "ext-gen70")
	public WebElement setupUsers;
		
	// Setup -> Services menu item 
	@FindBy (id = "ext-gen72")
	public WebElement setupServices;
		

public SetupSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

