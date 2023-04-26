package pages;

import java.util.List;

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
	
	@FindBy (id = "lRecallMaintenanceType")
	public WebElement assetRecalledCheckbox;
	
	@FindBy (id = "lOnSite")
	public WebElement assetOnSiteCheckbox;
	
	@FindBy (id = "lNonTracked")
	public WebElement assetNotTrackedCheckbox;
	
	@FindBy (id = "lOptional")
	public WebElement assetOptionalCheckbox;
	
	@FindBy (id = "lStandard")
	public WebElement assetStandardCheckbox;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger x-form-arrow-trigger'])[1]")
	public WebElement assetStandardTypeButton;
	
	@FindBy (xpath = "//*[@class='x-combo-list-inner']/div")
	public List<WebElement> assetStandardTypeList;
	
	@FindBy (xpath = "//*[@name = 'cStandardType' and @id = 'cStandardType']")
	public WebElement assetStandardType;
	
	@FindBy (xpath = "//*[@class = 'x-window-header-text' and contains(text(),'Attention')]")
	public WebElement assetAlertWindow;
	
	@FindBy (xpath = "//*[@type= 'button' and contains(text(),'OK')]")
	public WebElement assetOkButtonOnAlert;
	
	@FindBy (id = "cPhysicalLocation")
	public WebElement assetPhysicalLocation;
	
	@FindBy (id = "tPurchaseDate")
	public WebElement assetPurchaseDate;
	
	@FindBy (id = "tInServiceDate")
	public WebElement assetInServiceDate;
	
	@FindBy (id = "tWarrantyDate")
	public WebElement assetWarrantyDate;
	
	@FindBy (id = "tInventoryDate")
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
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Yes')]")
	public WebElement assetTypeUpdateAlert;
	
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
	
	@FindBy (id = "cGroup")
	public WebElement assetGroup;
	
	@FindBy (id = "cAssignedContact")
	public WebElement assetAssignedContact;
	
	@FindBy (id = "cAssignedGroup")
	public WebElement assetAssignedNumber;
	
	@FindBy (id = "tAssignedGroupDate")
	public WebElement assetAssignedDate;
	
	@FindBy (id = "cmdAssignment")
	public WebElement assetAssignmentButton;
	
	@FindBy (id = "cOptional1")
	public WebElement assetOptional1;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Save')]")
	public WebElement buttonSave;
	
	@FindBy (id = "tbReceive")
	public WebElement buttonReceive;
	
	/**
	 * End Elements Add Asset page
	 */
	
public AddAssetWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}