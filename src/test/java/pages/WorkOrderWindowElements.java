package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class WorkOrderWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Work Order page
	 */
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Service')]")
	public WebElement woServiceTab;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Add Result')]")
	public WebElement woAddResultButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Section Status')]")
	public WebElement woSectionStatusButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Batch')]")
	public WebElement woBatchButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Get Ambient')]")
	public WebElement woGetAmbientButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Return')]")
	public WebElement woreturnButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Save')]")
	public WebElement woSaveButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Close')]")
	public WebElement woCloseButton;
	
	@FindBy (xpath = "//*[@id ='nQCApprovedByUID_display']/following-sibling::img")
	public WebElement elipsisQCApprovedBy;
	
	@FindBy (id = "nQCApprovedByUID_display")
	public WebElement woQCApprovedBy;
	
	@FindBy (xpath = "//*[@id ='nWorkingFacilityUID_display']/following-sibling::img")
	public WebElement elipsisWorkingLab;
	
	@FindBy (id = "nWorkingFacilityUID_display")
	public WebElement woWorkingLab;
	
	@FindBy (xpath = "//*[@id ='cCallSheetStatus']/following-sibling::img")
	public WebElement woStatusButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[1]/div")
	public List<WebElement> woStatusList;
	
	@FindBy (id = "cCallSheetStatus")
	public WebElement woStatus;
	
	@FindBy (id = "tQCApprovedDate")
	public WebElement woQCApprovedDate;
	
	@FindBy (xpath = "//*[@id ='nOwningLabUID_display']/following-sibling::img")
	public WebElement elipsisAdminLab;
	
	@FindBy (id = "nOwningLabUID_display")
	public WebElement woAdminLab;
	
	@FindBy (id = "cContactInfo")
	public WebElement woContactInfo;
	
	@FindBy (xpath = "//*[@id ='cWorkOrderResults']/following-sibling::img")
	public WebElement woWOResultsButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[2]/div")
	public List<WebElement> woWOResultsList;
	
	@FindBy (id = "cWorkOrderResults")
	public WebElement woWOResults;
	
	@FindBy (id = "tRequiredDate")
	public WebElement woRequiredDate;
	
	@FindBy (id = "cCallSheetNumber")
	public WebElement woWONumber;
	
	@FindBy (id = "cCertificationNumber")
	public WebElement woCertNumber;
	
	@FindBy (id = "cStickerType")
	public WebElement woStickerType;
	
	@FindBy (id = "cCertFormat")
	public WebElement woCertFormat;
	
	@FindBy (xpath = "//*[@id ='nAssignedTechUID_display']/following-sibling::img")
	public WebElement elipsisAssignedTech;
	
	@FindBy (id = "nAssignedTechUID_display")
	public WebElement woAssignedTech;
	
	@FindBy (xpath = "//*[@id ='nTechnicianUID_display']/following-sibling::img")
	public WebElement elipsisTechnician;
	
	@FindBy (id = "nTechnicianUID_display")
	public WebElement woTechnician;
	
	@FindBy (xpath = "//*[@id ='cArea']/following-sibling::img")
	public WebElement woWorkAreaButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[5]/div")
	public List<WebElement> woWorkAreaList;
	
	@FindBy (id = "cArea")
	public WebElement woWorkArea;
	
	@FindBy (id = "nPriority")
	public WebElement woPriority;
	
	@FindBy (id = "tOpenDate")
	public WebElement woOpenDate;
	
	@FindBy (id = "tMaintDate")
	public WebElement woServiceDate;
	
	@FindBy (id = "cInterval")
	public WebElement woInterval;
	
	@FindBy (xpath = "//*[@id ='cIntervalUOM']/following-sibling::img")
	public WebElement woUomButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[6]/div")
	public List<WebElement> woUomList;
	
	@FindBy (id = "cIntervalUOM")
	public WebElement woUom;
	
	@FindBy (id = "tMaintNextDate")
	public WebElement woDueDate;
	
	@FindBy (id = "nDefaultProcedureUID_display")
	public WebElement woDefaultProcedure;
	
	@FindBy (xpath = "//*[@id ='nProcedureUID_display']/following-sibling::img")
	public WebElement elipsisProcedureUsed;
	
	@FindBy (id = "nProcedureUID_display")
	public WebElement woProcedureUsed;
	
	@FindBy (xpath = "//*[@id ='cInitialCondition']/following-sibling::img")
	public WebElement woInitialConditionButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[7]/div")
	public List<WebElement> woInitialConditionList;
	
	@FindBy (id = "cInitialCondition")
	public WebElement woInitialCondition;
	
	@FindBy (xpath = "//*[@id ='cServiceReason']/following-sibling::img")
	public WebElement woReasonForServiceButton;
	
	@FindBy (xpath = "(//*[@class = 'x-combo-list-inner'])[8]/div")
	public List<WebElement> woReasonForServiceList;
	
	@FindBy (id = "cServiceReason")
	public WebElement woReasonForService;
	
	@FindBy (id = "cTemperature")
	public WebElement woTemperature;
	
	@FindBy (id = "cHumidity")
	public WebElement woHumidity;
	
	@FindBy (id = "cPressure")
	public WebElement woPressure;
	
	@FindBy (id = "lOnSite")
	public WebElement woOnSiteChkb;
	
	@FindBy (id = "lExpedite")
	public WebElement woExpediteChkb;
	
	@FindBy (id = "lSubContracted")
	public WebElement woSubContractedChkb;
	
	@FindBy (id = "lISOCert")
	public WebElement woIsoCertChkb;
	
	@FindBy (id = "lCancelled")
	public WebElement woCancelledChkb;
	
	@FindBy (id = "lOOT")
	public WebElement woReceivedOotChkb;
	
	@FindBy (id = "lReturnNoMaint")
	public WebElement woReturnNoMaintChkb;
	
	@FindBy (id = "lDelayed")
	public WebElement woRejectedChkb;
	
	@FindBy (id = "lOptional1")
	public WebElement woOptional1Chkb;
	
	@FindBy (id = "lOptional2")
	public WebElement woOptional2Chkb;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Extended Data')]")
	public WebElement woExtendedDataTab;
	
	@FindBy (id = "tClosedDate")
	public WebElement woClosedDate;
	
	@FindBy (id = "nCost")
	public WebElement woCost;
	
	@FindBy (xpath = "//*[@id ='nCategoryUID_display']/following-sibling::img")
	public WebElement elipsisCategory;
	
	@FindBy (id = "nCategoryUID_display")
	public WebElement woCategory;
	
	@FindBy (xpath = "//*[@id ='nSubCategoryUID_display']/following-sibling::img")
	public WebElement elipsisSubCategory;
	
	@FindBy (id = "nSubCategoryUID_display")
	public WebElement woSubCategory;
	
	@FindBy (id = "nQuantity")
	public WebElement woQuantity;
	
	@FindBy (id = "nInvoiceUID_display")
	public WebElement woInvoiceNumber;
	
	@FindBy (id = "nReturnedByUID_display")
	public WebElement woReturnedBy;
	
	@FindBy (id = "tReturnedDate")
	public WebElement woReturnedDate;
	
	@FindBy (id = "cReturnedTo")
	public WebElement woReturnedTo;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Log Notes')]")
	public WebElement woLogNotesTab;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[1]")
	public WebElement woAddNewLogNoteButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[1]")
	public WebElement woDeleteSelectedLogNoteButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[15]")
	public WebElement woEditSelectedLogNoteButton;

	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Labor / Files')]")
	public WebElement woLaborTab;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[2]")
	public WebElement woAddNewLaborButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[2]")
	public WebElement woDeleteSelectedLaborButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[16]")
	public WebElement woEditSelectedLaborButton;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Standards / Accreditations')]")
	public WebElement woStandardsTab;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[4]")
	public WebElement woAddNewStandardButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[4]")
	public WebElement woDeleteSelectedStandardButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[18]")
	public WebElement woEditSelectedStandardButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[5]")
	public WebElement woAddNewAccreditationButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[5]")
	public WebElement woDeleteSelectedAccreditationButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[19]")
	public WebElement woEditSelectedAccreditationButton;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Notes')]")
	public WebElement woNotesTab;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Parts')]")
	public WebElement woPartsTab;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[6]")
	public WebElement woAddNewPartButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[6]")
	public WebElement woDeleteSelectedPartButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[20]")
	public WebElement woEditSelectedPartLinkButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[21]")
	public WebElement woEditSelectedPartButton;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Sub Contract / Estimate')]")
	public WebElement woSubContractTab;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Results')]")
	public WebElement woResultsTab;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-add-sm'])[7]")
	public WebElement woAddWoResultButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-delete-sm'])[7]")
	public WebElement woDeleteWoResultButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify2-sm'])[2]")
	public WebElement woViewResultsButton;
	
	@FindBy (xpath = "(//*[@type ='button' and  @class = ' x-btn-text btn-modify-sm'])[23]")
	public WebElement woEditManualCalButton;
	
	
	/**
	 * End Elements Work Order page
	 */
	
public WorkOrderWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}