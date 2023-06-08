package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class EditWorkOrderElements extends BaseClass {
	
	/**
	 * Beginning Elements from Work Order page
	 */

	@FindBy (xpath = "//*[@type='button' and contains(text(),'Unlock')]")
	public WebElement woButtonUnlock;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Add Result')]")
	public WebElement woButtonAddResult;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Section Status')]")
	public WebElement woButtonSectionStatus;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Batch')]")
	public WebElement woButtonBatch;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Return')]")
	public WebElement woButtonReturn;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Save')]")
	public WebElement woButtonSave;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Close')]")
	public WebElement woButtonClose;
	
	@FindBy (xpath = "//*[@id ='nQCApprovedByUID_display']/following-sibling::img")
	public WebElement woQCApprovedByElipsisButton;
	
	@FindBy (id = "nQCApprovedByUID_display")
	public WebElement woQCApprovedBy;
	
	@FindBy (xpath = "//*[@id='tQCApprovedDate' and @name ='tQCApprovedDate']")
	public WebElement woQCApprovedDate;
	
	@FindBy (xpath = "//*[@id='cWorkOrderResults' and @name ='cWorkOrderResults']")
	public WebElement woResults;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Service']")
	public WebElement woServiceTab;
	
	@FindBy (xpath = "//*[@id='cCertificationNumber' and @name ='cCertificationNumber']")
	public WebElement woServiceCertNumber;
	
	@FindBy (id = "nDefaultProcedureUID_display")
	public WebElement woServiceDefaultProcedure;
	
	@FindBy (id = "nProcedureUID_display")
	public WebElement woServiceProcedureUsed;
	
	@FindBy (xpath = "//*[@id='cTemperature' and @name ='cTemperature']")
	public WebElement woServiceTemperature;
	
	@FindBy (xpath = "//*[@id='cHumidity' and @name ='cHumidity']")
	public WebElement woServiceHumidity;
	
	@FindBy (xpath = "//*[@id='cPressure' and @name ='cPressure']")
	public WebElement woServicePressure;
	
	@FindBy (xpath = "//*[@id ='nAssignedTechUID_display']/following-sibling::img")
	public WebElement woServiceAssignTechElipsisButton;
	
	@FindBy (id = "nAssignedTechUID_display")
	public WebElement woServiceAssignTech;
	
	@FindBy (xpath = "//*[@id='tMaintDate' and @name ='tMaintDate']")
	public WebElement woServiceServiceDate;
	
	@FindBy (xpath = "//*[@id='tMaintNextDate' and @name ='tMaintNextDate']")
	public WebElement woServiceDueDate;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Log Notes']")
	public WebElement woLogNotesTab;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-cStatus']")
	public WebElement woLogNotesStatus;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Labor / Files']")
	public WebElement woLaborFilesTab;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-add-sm'])[2]")
	public WebElement woLaborAddButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-delete-sm'])[2]")
	public WebElement woLaborDeleteButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-modify-sm'])[16]")
	public WebElement woLaborEditButton;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-nDuration ']")
	public WebElement woLaborDuration;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Standards / Accreditations']")
	public WebElement woStandardsAccreditationsTab;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Standards Only')]")
	public WebElement woStandardsOnlyButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-add-sm'])[4]")
	public WebElement woStandardsAddButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-delete-sm'])[4]")
	public WebElement woStandardsDeleteButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-modify-sm'])[18]")
	public WebElement woStandardsEditButton;
	
	@FindBy (xpath = "//*[@type='button' and @class = ' x-btn-text btn-fix-sm']")
	public WebElement woStandardSwapStandardButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'RT')]")
	public WebElement woStandardRTButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'FT')]")
	public WebElement woStandardFTButton;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Yes')]")
	public WebElement woStandardAttentionYesButton;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-cBarcode']")
	public WebElement woStandardBarcode;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-add-sm'])[5]")
	public WebElement woAcreditationAddButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-delete-sm'])[5]")
	public WebElement woAcreditationDeleteButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-modify-sm'])[19]")
	public WebElement woAcreditationEditButton;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-cCode']")
	public WebElement woAcreditationNumber;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Notes']")
	public WebElement woNotesTab;
	
	@FindBy (xpath = "//*[@id='mAccuracyNotes' and @name ='mAccuracyNotes']")
	public WebElement woNotesAccuracy;
	
	@FindBy (xpath = "//*[@id='mUncertaintyNotes' and @name ='mUncertaintyNotes']")
	public WebElement woNotesUncertainty;
	
	@FindBy (xpath = "//*[@id='mOOTNotes' and @name ='mOOTNotes']")
	public WebElement woNotesOOT;
	
	@FindBy (xpath = "//*[@id='mCallSheetNotes' and @name ='mCallSheetNotes']")
	public WebElement woNotesWO;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Parts']")
	public WebElement woPartsTab;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-add-sm'])[6]")
	public WebElement woPartsAddButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-delete-sm'])[6]")
	public WebElement woPartsDeleteButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-modify-sm'])[20]")
	public WebElement woPartsEditPartLinkButton;
	
	@FindBy (xpath = "(//*[@type='button' and @class = ' x-btn-text btn-modify-sm'])[21]")
	public WebElement woPartsEditPartButton;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-cPartNumber']")
	public WebElement woPartsNumber;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-nQuantity']")
	public WebElement woPartsQuantity;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and text()='Sub Contract / Estimate']")
	public WebElement woSubContractTab;
	
	@FindBy (xpath = "//*[@id ='nSubContractorUID_display']/following-sibling::img")
	public WebElement woSubContractorElipsisButton;
	
	@FindBy (id = "nSubContractorUID_display")
	public WebElement woSubContractor;
	
	@FindBy (xpath = "//*[@id='nSubContCost' and @name ='nSubContCost']")
	public WebElement woSubContCost;
	
	@FindBy (xpath = "//*[@id='nSubContLabCost' and @name ='nSubContLabCost']")
	public WebElement woSubContLabCost;
	
	@FindBy (xpath = "//*[@id='nSubContHours' and @name ='nSubContHours']")
	public WebElement woSubContHours;
	
	@FindBy (xpath = "//*[@id='tDelayDate' and @name ='tDelayDate']")
	public WebElement woSubContDelayDate;
	
	@FindBy (xpath = "//*[@id='mSubContractorNotes' and @name ='mSubContractorNotes']")
	public WebElement woSubContNotes;
	
	@FindBy (xpath = "//*[@class='x-tab-strip-text ' and contains(text(),'Results')]")
	public WebElement woResultsTab;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-cell-inner x-grid3-col-ProcedureName']")
	public WebElement woResultsProcedureName;
	
	/**
	 * End Elements Add Accreditation page
	 */	
	
public EditWorkOrderElements() {
		
	    PageFactory.initElements(driver, this);
}
}
