package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddProcedureWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Procedure page
	 */
	
	//this element switch to frame from find procedures screen to add procedures screen
	@FindBy (xpath = "//*[@id =\"frame_2\"]")
	public WebElement windowSwitch;
	
	@FindBy (id = "cProcedureName")
	public WebElement procName;
	
	@FindBy (id = "cProcedureNumber")
	public WebElement procNumber;
	
	@FindBy (id = "cVersion")
	public WebElement procVersion;
	
	@FindBy (id = "tProcedureDate")
	public WebElement procDate;
	
	@FindBy (id = "btn-nAttTemplateUID_display")
	public WebElement elipsisButtonDataSheet;
	
	@FindBy (id = "cRevision")
	public WebElement procRevision;
	
	@FindBy (id = "tRevisionDate")
	public WebElement procRevisionDate;
	
	@FindBy (id = "btn-nCategoryUID_display")
	public WebElement elipsisButtonCategory;
	
	@FindBy (id = "btn-btnSave")
	public WebElement buttonSave;
	
	@FindBy (id = "btn-btnClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Procedure page
	 */
	
public AddProcedureWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}