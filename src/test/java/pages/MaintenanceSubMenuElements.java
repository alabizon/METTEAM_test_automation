package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class MaintenanceSubMenuElements extends BaseClass {

	// Maintenance -> Asset menu item 
	@FindBy (id = "txt-mnuMaintAssets")
	public WebElement maintAssets;
	
	// Maintenance -> Types menu item 
	@FindBy (id = "txt-mnuMaintTypes")
	public WebElement maintTypes;
		
	// Maintenance -> Procedures menu item 
	@FindBy (id = "txt-mnuMaintProcedures")
	public WebElement maintProcedures;
		
	// Maintenance -> Facilities menu item 
	@FindBy (id = "txt-mnuMaintFacilities")
	public WebElement maintFacilities;
		
	// Maintenance -> JobNumbers menu item 
	@FindBy (id = "txt-mnuMaintJobNumbers")
	public WebElement maintJobNumbers;
		
	// Maintenance -> Units menu item 
	@FindBy (id = "txt-mnuMaintUnits")
	public WebElement maintUnits;
	
	// Maintenance -> Parts menu item 
	@FindBy (id = "txt-mnuMaintParts")
	public WebElement maintParts;
	
	// Maintenance -> ManualTemplates menu item 
	@FindBy (id = "txt-mnuMaintManualTemplates")
	public WebElement maintManualTemplates;
	
	// Maintenance -> Files menu item 
	@FindBy (id = "txt-mnuMaintFiles")
	public WebElement maintFiles;
	
	// Maintenance -> Accreditations menu item 
	@FindBy (id = "txt-mnuMaintAccreditation")
	public WebElement maintAccreditations;
	
	// Maintenance -> DataCleanup menu item 
	@FindBy (id = "txt-mnuMaintDataCleanup")
	public WebElement maintDataCleanup;
	
	
public MaintenanceSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

