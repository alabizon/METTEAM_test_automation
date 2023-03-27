package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConfigureSubMenuElements extends BaseClass {

	// Configure -> Send System Message menu item 
	@FindBy (id = "txt-mnuSystemEvent")
	public WebElement confSysMessage;
	
	// Configure -> System Defaults menu item 
	@FindBy (id = "txt-mnuSystemDefaults")
	public WebElement confSysDefaults;
		
	// Configure -> Menu Security menu item 
	@FindBy (id = "txt-mnuSystemConfigureMenu")
	public WebElement confMenuSecurity;
		
	// Configure -> MET/CAL Security menu item 
	@FindBy (id = "txt-mnuSystemConfigureMetCalMenu")
	public WebElement confMetcalSecurity;
		
	// Configure -> MET/CAL Prompts menu item 
	@FindBy (id = "txt-mnuSystemMetCalPromptsMenu")
	public WebElement confMetcalPrompts;
		
	// Configure -> Data Checks menu item 
	@FindBy (id = "txt-mnuSystemValidations")
	public WebElement confDataChecks;
	
	// Configure -> Extended Data menu item 
	@FindBy (id = "txt-mnuSystemExtendedData")
	public WebElement confExtData;
	
	// Configure -> Groups menu item 
	@FindBy (id = "txt-mnuConfigureGroups")
	public WebElement confGroups;
	
	// Configure -> Alert Engine Configuration menu item - - - - - - - - - Need ID!!! 
	//@FindBy (id = "txt-mnuMaintFiles")
	//public WebElement maintFiles;
	
	
public ConfigureSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

