package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConfigureSubMenuElements extends BaseClass {

	// Configure -> Send System Message menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemEvent\']")
	public WebElement confSysMessage;
	
	// Configure -> System Defaults menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemDefaults\']")
	public WebElement confSysDefaults;
		
	// Configure -> Menu Security menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemConfigureMenu\']")
	public WebElement confMenuSecurity;
		
	// Configure -> MET/CAL Security menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemConfigureMetCalMenu\']")
	public WebElement confMetcalSecurity;
		
	// Configure -> MET/CAL Prompts menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemMetCalPromptsMenu\']")
	public WebElement confMetcalPrompts;
		
	// Configure -> Data Checks menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemValidations\']")
	public WebElement confDataChecks;
	
	// Configure -> Extended Data menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuSystemExtendedData\']")
	public WebElement confExtData;
	
	// Configure -> Groups menu item 
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuConfigureGroups\']")
	public WebElement confGroups;
	
	// Configure -> Alert Engine Configuration menu item
	@FindBy (xpath = "//*[@id=\'x-menu-el-mnuAlertingEngine\']")
	public WebElement confAlertEngineConfig;
	
	
public ConfigureSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

