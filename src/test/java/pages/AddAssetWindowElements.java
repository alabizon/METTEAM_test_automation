package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddAssetWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Asset page
	 */
	
	@FindBy (id = "cID")
	public WebElement assetID;
	
	@FindBy (id = "cBarcode")
	public WebElement assetBarcode;
	
	@FindBy (id = "cSerialNumber")
	public WebElement assetSerialNum;

	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[1]")
	public WebElement elipsisButtonCustomer;
	
	@FindBy (id = "nFacilityUID_display")
	public WebElement assetCustomer;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[2]")
	public WebElement elipsisButtonDepartment;
	
	@FindBy (id = "nDepartmentUID_display")
	public WebElement assetDepartment;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[3]")
	public WebElement elipsisButtonParent;
	
	@FindBy (id = "nParentUID_display")
	public WebElement assetParent;
	
	@FindBy (xpath = "//*[@id ='lRecallMaintenanceType' and  @class = ' x-form-checkbox x-form-field']")
	public WebElement assetRecalledCheckbox;
	
	@FindBy (xpath = "//*[@id ='lOnSite' and  @class = ' x-form-checkbox x-form-field']")
	public WebElement assetOnSiteCheckbox;
	
	@FindBy (xpath = "//*[@id ='lNonTracked' and  @class = ' x-form-checkbox x-form-field']")
	public WebElement assetNotTrackedCheckbox;
	
	@FindBy (xpath = "//*[@id ='lOptional' and  @class = ' x-form-checkbox x-form-field']")
	public WebElement assetOptionalCheckbox;
	
	@FindBy (xpath = "//*[@id ='lStandard' and  @class = ' x-form-checkbox x-form-field']")
	public WebElement assetStandardCheckbox;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger x-form-arrow-trigger'])[1]")
	public WebElement assetStandardTypeButton;
	
	@FindBy (xpath = "//*[@id ='cStandardType' and  @class = 'x-form-text x-form-field x-trigger-noedit x-form-focus']")
	public WebElement assetStandardType;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[4]")
	public WebElement assetPhysicalLocation;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[3]")
	public WebElement assetPurchaseDate;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[4]")
	public WebElement assetInServiceDate;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[5]")
	public WebElement assetWarrabtyDate;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[6]")
	public WebElement assetDateInventoried;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[4]")
	public WebElement elipsisButtonInventoriedBy;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[7]")
	public WebElement assetInventoriedBy;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[5]")
	public WebElement assetAssetDescription;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[6]")
	public WebElement assetAssetModelNumber;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[8]")
	public WebElement assetAssetManufacturer;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[6]")
	public WebElement elipsisButtonTypeDescription;
	
	@FindBy (id = "nTypeUID_display")
	public WebElement assetTypeDescription;
	
	@FindBy (id = "Type_cModelNumber")
	public WebElement assetTypeModelNumber;
	
	@FindBy (id = "Type_nManufacturerUID_display")
	public WebElement assetTypeManufacturer;
	
	@FindBy (id = "Type_cArea")
	public WebElement assetTypeWorkArea;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[7]")
	public WebElement elipsisAssignedFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[9]")
	public WebElement assetAssignedFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[8]")
	public WebElement elipsisServiceFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[10]")
	public WebElement assetServiceFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[9]")
	public WebElement elipsisAuthorizingFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[11]")
	public WebElement assetAuthorizingFacility;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[7]")
	public WebElement assetGroup;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[8]")
	public WebElement assetAssignedContact;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[9]")
	public WebElement assetAssignedNumber;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[12]")
	public WebElement assetAssignedDate;
	
	@FindBy (id = "cmdAssignment")
	public WebElement assetAssignmentButton;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[10]")
	public WebElement assetOptional1;
	
	@FindBy (id = "btn-tbSave")
	public WebElement buttonSave;
	
	@FindBy (id = "btn-tbReceive")
	public WebElement buttonReceive;
	
	/**
	 * End Elements Add Asset page
	 */
	
public AddAssetWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}