package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddProcedureWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Procedure page
	 */
	
	@FindBy (id = "cProcedureName")
	public WebElement procName;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[1]")
	public WebElement procNumber;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[2]")
	public WebElement procVersion;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[1]")
	public WebElement procDate;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[1]")
	public WebElement elipsisButtonDataSheet;
	
	@FindBy (xpath = "//*[@id ='nAttTemplateUID_display' and  @class = 'x-form-text x-form-field']")
	public WebElement procDataSheet;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement procRevision;
	
	@FindBy (xpath = "//*[@id ='tRevisionDate' and  @class = 'x-form-text x-form-field']")
	public WebElement procRevisionDate;
	
	@FindBy (xpath = "//*[@id ='cProcedureType' and  @class = 'x-form-text x-form-field x-trigger-noedit']")
	public WebElement procServiceType;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[4]")
	public WebElement elipsisButtonCategory;
	
	@FindBy (xpath = "//*[@id ='nCategoryUID_display' and  @class = 'x-form-text x-form-field autoLookUpDisable']")
	public WebElement procCategory;
	
	@FindBy (id = "ext-gen291")
	public WebElement buttonSave;
	
	@FindBy (id = "ext-gen297")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Procedure page
	 */
	
public AddProcedureWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}