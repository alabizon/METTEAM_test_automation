package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ConfigureSubMenuElements extends BaseClass {

	// Configure -> Send System Message menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[1]/a/span")
	public WebElement confSysMessage;
	
	// Configure -> System Defaults menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[2]/a/span")
	public WebElement confSysDefaults;
		
	// Configure -> Menu Security menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[3]/a/span")
	public WebElement confMenuSecurity;
		
	// Configure -> MET/CAL Security menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[4]/a/span")
	public WebElement confMetcalSecurity;
		
	// Configure -> MET/CAL Prompts menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[5]/a/span")
	public WebElement confMetcalPrompts;
		
	// Configure -> Data Checks menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[6]/a/span")
	public WebElement confDataChecks;
	
	// Configure -> Extended Data menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[7]/a/span")
	public WebElement confExtData;
	
	// Configure -> Groups menu item 
	@FindBy (xpath = "/html/body/div[10]/ul/li[8]/a/span")
	public WebElement confGroups;
	
	// Configure -> Alert Engine Configuration menu item
	@FindBy (xpath = "/html/body/div[10]/ul/li[9]/a/span")
	public WebElement confAlertEngineConfig;
	
	
public ConfigureSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

