package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddContractPricingWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Contract Pricing page
	 */
	
	@FindBy (xpath = "//*[@id ='nFacilityUID_display']/following-sibling::img")
	public WebElement elipsisButtonCustomer;
	
	@FindBy (id = "nFacilityUID_display")
	public WebElement pricingCustomer;
	
	@FindBy (xpath = "//*[@id ='nWorkingFacilityUID_display']/following-sibling::img")
	public WebElement elipsisButtonWorkingFacility;
	
	@FindBy (id = "nWorkingFacilityUID_display")
	public WebElement pricingWorkingFacility;
	
	@FindBy (xpath = "//*[@id ='nTypeProcedureDefaultUID_display']/following-sibling::img")
	public WebElement elipsisButtonDefaultProcedure;
	
	@FindBy (id = "nTypeProcedureDefaultUID_display")
	public WebElement pricingDefaultProcedure;
	
	@FindBy (id = "nTypeUID_display")
	public WebElement pricingDescription;
	
	@FindBy (id = "tEffectiveDate")
	public WebElement pricingEffectiveDate;
	
	@FindBy (id = "tExpireDate")
	public WebElement pricingExpireDate;
	
	@FindBy (xpath = "//*[@id='nPrice' and @class = ' x-form-text x-form-field x-abs-layout-item']")
	public WebElement pricingPrice;
	
	@FindBy (id = "nStandardPrice")
	public WebElement pricingStdPrice;
	
	@FindBy (id = "nTyManufacturerUID_display")
	public WebElement pricingManufacturer;
	
	@FindBy (id = "cTyModelNumber")
	public WebElement pricingModelNumber;
	
	@FindBy (id = "mNotes")
	public WebElement pricingNotes;
	
	@FindBy (id = "btnSave")
	public WebElement buttonSave;
	
	@FindBy (xpath = "//*[@class = ' x-btn-text tb-add-small' and @type = 'button']")
	public WebElement buttonAdd;
	
	@FindBy (id = "btnClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Contract Pricing page
	 */
	
public AddContractPricingWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}