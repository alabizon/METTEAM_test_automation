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
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement procRevision;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[2]")
	public WebElement procRevisionDate;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[4]")
	public WebElement elipsisButtonCategory;
	
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