package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ReceivingWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Receiving Asset page
	 */
	
	@FindBy (id = "tab-pnlCallSheet__ext-comp-1035")
	public WebElement receivingReceivingDetailsTab;
	
	@FindBy (id = "tab-pnlCallSheet__ext-comp-1040")
	public WebElement receivingWOExtendedDataTab;
	
	@FindBy (id = "tab-pnlCallSheet__ext-comp-1041")
	public WebElement receivingLogNotesTab;

	@FindBy (xpath = "//*[@type='button' and contains(text(),'Process')]")
	public WebElement receivingProcessButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Close')]")
	public WebElement receivingCloseButton;
	
	@FindBy (xpath = "//*[@id ='nDepartmentUID_display']/following-sibling::img")
	public WebElement elipsisButtonDepartment;
	
	@FindBy (id = "nDepartmentUID_display")
	public WebElement receivingDepartment;
	
	@FindBy (id = "chkCopynDepartmentUID")
	public WebElement receivingDepartmentCheckbox;
	
	@FindBy (id = "cLocation")
	public WebElement receivingLocation;
	
	@FindBy (id = "chkCopycLocation")
	public WebElement receivingLocationCheckbox;
	
	@FindBy (xpath = "//*[@id ='cArea']/following-sibling::img")
	public WebElement receivingWorkAreaButton;
	
	@FindBy (xpath = "//*[@class='combo-result-item']/div")
	public List<WebElement> receivingWorkAreaList;
	
	@FindBy (id = "cArea")
	public WebElement receivingWorkArea;
	
	@FindBy (id = "chkCopycArea")
	public WebElement receivingWorkAreaCheckbox;
	
	@FindBy (xpath = "//*[@id ='cServiceReason']/following-sibling::img")
	public WebElement receivingReasonOfServiceButton;
	
	@FindBy (xpath = "//*[@class='combo-result-item']/div")
	public List<WebElement> receivingReasonOfServiceList;
	
	@FindBy (id = "cServiceReason")
	public WebElement receivingReasonOfService;
	
	@FindBy (id = "chkCopycServiceReason")
	public WebElement receivingReasonOfServiceCheckbox;
	
	@FindBy (xpath = "//*[@id ='cInitialCondition']/following-sibling::img")
	public WebElement receivingInitialConditionButton;
	
	@FindBy (xpath = "//*[@class='combo-result-item']/div")
	public List<WebElement> receivingInitialConditionList;
	
	@FindBy (id = "cInitialCondition")
	public WebElement receivingInitialCondition;
	
	@FindBy (id = "chkCopycInitialCondition")
	public WebElement receivingInitialConditionCheckbox;
	
	@FindBy (id = "nPriority")
	public WebElement receivingPriority;
	
	@FindBy (id = "chkCopynPriority")
	public WebElement receivingPriorityCheckbox;
	
	@FindBy (id = "nQuantity")
	public WebElement receivingQuantity;
	
	@FindBy (id = "chkCopynQuantity")
	public WebElement receivingQuantityCheckbox;
	
	@FindBy (xpath = "//*[@id ='nJobNumberUID_display']/following-sibling::img")
	public WebElement elipsisJobNumber;
	
	@FindBy (id = "nJobNumberUID_display")
	public WebElement receivingJobNumber;
	
	@FindBy (id = "chkCopynJobNumberUID")
	public WebElement receivingJobNumberCheckbox;
	
	@FindBy (id = "cContactInfo")
	public WebElement receivingContactInfo;
	
	@FindBy (id = "chkCopycContactInfo")
	public WebElement receivingContactInfoCheckbox;
	
	@FindBy (id = "lOnSite")
	public WebElement receivingOnSite;
	
	@FindBy (id = "chkCopylOnSite")
	public WebElement receivingOnSiteCheckbox;
	
	@FindBy (id = "lExpedite")
	public WebElement receivingExpedite;
	
	@FindBy (id = "chkCopylExpedite")
	public WebElement receivingExpediteCheckbox;
	
	@FindBy (id = "lISOCert")
	public WebElement receivingISOCert;
	
	@FindBy (id = "chkCopylISOCert")
	public WebElement receivingISOCertCheckbox;
	
	@FindBy (xpath = "//*[@id ='cCallSheetType']/following-sibling::img")
	public WebElement receivingServiceTypeButton;
	
	@FindBy (xpath = "//*[@class='combo-result-item']/div")
	public List<WebElement> receivingServiceTypeList;
	
	@FindBy (id = "cCallSheetType")
	public WebElement receivingServiceType;
	
	@FindBy (id = "chkCopycCallSheetType")
	public WebElement receivingServiceTypeCheckbox;
	
	@FindBy (xpath = "//*[@id ='cCallSheetStatus']/following-sibling::img")
	public WebElement receivingStatusButton;
	
	@FindBy (xpath = "//*[@class='combo-result-item']/div")
	public List<WebElement> receivingStatusList;
	
	@FindBy (id = "cCallSheetStatus")
	public WebElement receivingStatus;
	
	@FindBy (id = "chkCopycCallSheetStatus")
	public WebElement receivingStatusCheckbox;
	
	@FindBy (id = "tOpenDate")
	public WebElement receivingOpenDate;
	
	@FindBy (id = "chkCopytOpenDate")
	public WebElement receivingOpenDateCheckbox;
	
	@FindBy (id = "tRequiredDate")
	public WebElement receivingRequiredDate;
	
	@FindBy (id = "chkCopytRequiredDate")
	public WebElement receivingRequiredDateCheckbox;
	
	@FindBy (xpath = "//*[@id ='nCategoryUID_display']/following-sibling::img")
	public WebElement elipsisCategory;
	
	@FindBy (id = "nCategoryUID_display")
	public WebElement receivingCategory;
	
	@FindBy (id = "chkCopynCategoryUID")
	public WebElement receivingCategoryCheckbox;
	
	@FindBy (id = "//*[@id ='nSubCategoryUID_display']/following-sibling::img")
	public WebElement elipsisSubCategory;
	
	@FindBy (id = "nSubCategoryUID_display")
	public WebElement receivingSubCategory;
	
	@FindBy (id = "chkCopynSubCategoryUID")
	public WebElement receivingSubCategoryCheckbox;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Select')]")
	public WebElement receivingSelectButton;
	
	@FindBy (xpath = "//*[@type ='button' and  @class = ' x-btn-text btn-add-sm']")
	public WebElement receivingAddAssetButton;
	
	@FindBy (xpath = "//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm']")
	public WebElement receivingRemoveAssetButton;
	
	@FindBy (xpath = "")
	public WebElement receivingEditAssetButton;
	
	@FindBy (xpath = "")
	public WebElement receivingEditWOButton;
	
	@FindBy (id = "copyExt")
	public WebElement receivingWOExtendedDataCheckbox;
	
	@FindBy (id = "mCallSheetNotes")
	public WebElement receivingWONotes;
	
	@FindBy (id = "chkCopymCallSheetNotes")
	public WebElement receivingWONotesCheckbox;
	
	/**
	 * End Elements from Receiving Asset page
	 */
	
public ReceivingWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}