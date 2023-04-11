package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class MaintenanceSubMenuElements extends BaseClass {

	// Maintenance -> Asset menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[1]/a/span")
	public WebElement maintAssets;
	
	// Maintenance -> Types menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[2]/a/span")
	public WebElement maintTypes;
		
	// Maintenance -> Procedures menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[3]/a/span")
	public WebElement maintProcedures;
		
	// Maintenance -> Facilities menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[4]/a/span")
	public WebElement maintFacilities;
		
	// Maintenance -> JobNumbers menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[5]/a/span")
	public WebElement maintJobNumbers;
		
	// Maintenance -> Units menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[6]/a/span")
	public WebElement maintUnits;
	
	// Maintenance -> Parts menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[8]/a/span")
	public WebElement maintParts;
	
	// Maintenance -> ManualTemplates menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[10]/a/span")
	public WebElement maintManualTemplates;
	
	// Maintenance -> Files menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[11]/a/span")
	public WebElement maintFiles;
	
	// Maintenance -> Accreditations menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[12]/a/span")
	public WebElement maintAccreditations;
	
	// Maintenance -> DataCleanup menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[14]/a/span")
	public WebElement maintDataCleanup;
	
	
public MaintenanceSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

