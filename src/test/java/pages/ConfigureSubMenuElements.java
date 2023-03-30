package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConfigureSubMenuElements extends BaseClass {

	// Configure -> Send System Message menu item 
	@FindBy (id = "ext-gen159")
	public WebElement confSysMessage;
	
	// Configure -> System Defaults menu item 
	@FindBy (id = "ext-gen161")
	public WebElement confSysDefaults;
		
	// Configure -> Menu Security menu item 
	@FindBy (id = "ext-gen163")
	public WebElement confMenuSecurity;
		
	// Configure -> MET/CAL Security menu item 
	@FindBy (id = "ext-gen165")
	public WebElement confMetcalSecurity;
		
	// Configure -> MET/CAL Prompts menu item 
	@FindBy (id = "ext-gen167")
	public WebElement confMetcalPrompts;
		
	// Configure -> Data Checks menu item 
	@FindBy (id = "ext-gen169")
	public WebElement confDataChecks;
	
	// Configure -> Extended Data menu item 
	@FindBy (id = "ext-gen171")
	public WebElement confExtData;
	
	// Configure -> Groups menu item 
	@FindBy (id = "ext-gen173")
	public WebElement confGroups;
	
	// Configure -> Alert Engine Configuration menu item
	@FindBy (id = "ext-gen175")
	public WebElement confAlertEngineConfig;
	
	
public ConfigureSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

