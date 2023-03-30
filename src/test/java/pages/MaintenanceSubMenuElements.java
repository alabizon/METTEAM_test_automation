package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class MaintenanceSubMenuElements extends BaseClass {

	// Maintenance -> Asset menu item 
	@FindBy (id = "ext-gen131")
	public WebElement maintAssets;
	
	// Maintenance -> Types menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[2]/a/span")
	public WebElement maintTypes;
		
	// Maintenance -> Procedures menu item 
	@FindBy (xpath = "/html/body/div[4]/ul/li[3]/a/span")
	public WebElement maintProcedures;
		
	// Maintenance -> Facilities menu item 
	@FindBy (id = "ext-gen137")
	public WebElement maintFacilities;
		
	// Maintenance -> JobNumbers menu item 
	@FindBy (id = "ext-gen139")
	public WebElement maintJobNumbers;
		
	// Maintenance -> Units menu item 
	@FindBy (id = "ext-gen141")
	public WebElement maintUnits;
	
	// Maintenance -> Parts menu item 
	@FindBy (id = "ext-gen144")
	public WebElement maintParts;
	
	// Maintenance -> ManualTemplates menu item 
	@FindBy (id = "ext-gen147")
	public WebElement maintManualTemplates;
	
	// Maintenance -> Files menu item 
	@FindBy (id = "ext-gen149")
	public WebElement maintFiles;
	
	// Maintenance -> Accreditations menu item 
	@FindBy (id = "ext-gen151")
	public WebElement maintAccreditations;
	
	// Maintenance -> DataCleanup menu item 
	@FindBy (id = "ext-gen154")
	public WebElement maintDataCleanup;
	
	
public MaintenanceSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

