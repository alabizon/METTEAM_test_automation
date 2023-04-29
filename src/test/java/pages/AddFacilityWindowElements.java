package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddFacilityWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Facility page
	 */
	
	@FindBy (id = "cFacilityName")
	public WebElement facilityName;
	
	@FindBy (id = "cTaxNumber")
	public WebElement facilityTaxNumber;
	
	@FindBy (id = "cFacilityNumber")
	public WebElement facilityNumber;
	
	@FindBy (id = "cFedNumber")
	public WebElement facilityFedNumber;
	
	@FindBy (id = "cIndustryCode")
	public WebElement facilityIndustryCode;
	
	@FindBy (id = "cAccountNumber")
	public WebElement facilityAccountNumber;
	
	@FindBy (id = "cCompanyCode")
	public WebElement facilityCompanyCode;
	
	@FindBy (id = "cFacilityWebSite")
	public WebElement facilityWebSite;
	
	@FindBy (xpath = "//*[@id ='cDivision']/following-sibling::img")
	public WebElement facilityShippingMethodButton;
	
	@FindBy (id = "cDivision")
	public WebElement facilityShippingMethod;
	
	@FindBy (xpath = "//*[@class = 'x-combo-list-inner']/div")
	public List<WebElement> facilityShipMethod;
	
	@FindBy (xpath = "//*[@id ='cDistrict']/following-sibling::img")
	public WebElement facilityRecallRuleButton;
	
	@FindBy (id = "cDistrict")
	public WebElement facilityRecallRule;
	
	@FindBy (xpath = "//*[@class = 'x-combo-list-inner']/div")
	public List<WebElement> facilityRecall;
	
	@FindBy (id = "lCustomer")
	public WebElement facilityCustomer;
	
	@FindBy (id = "lManufacturer")
	public WebElement facilityManufacturer;
	
	@FindBy (id = "lSubContractor")
	public WebElement facilitySubContractor;
	
	@FindBy (id = "lLab")
	public WebElement facilityLab;
	
	@FindBy (id = "lHandHeldUse")
	public WebElement facilityOptional1;
	
	@FindBy (id = "lInspectionRate")
	public WebElement facilityInspectAll;
	
	@FindBy (id = "lNoTax")
	public WebElement facilityNoTax;
	
	@FindBy (id = "TotalAssets")
	public WebElement facilityTotalAssets;
	
	@FindBy (id = "nTaxRate")
	public WebElement facilityTaxRate;
	
	@FindBy (id = "nRate1")
	public WebElement facilityHourlyRate;
	
	@FindBy (id = "nRate2")
	public WebElement facilityDiscount;
	
	@FindBy (id = "nRate3")
	public WebElement facilityExpediteFee;
	
	@FindBy (xpath = "//*[@class=' x-btn-text tb-save']")
	public WebElement buttonSave;
	
	@FindBy (id = "tbClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Facility page
	 */
	
public AddFacilityWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}