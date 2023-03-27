package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ManagementSubMenuElements extends BaseClass {

	// Management -> Business Status menu item 
	@FindBy (id = "txt-mnuBusinessStatus")
	public WebElement manageBusinessStatus;
	
	// Management -> Billing menu item 
	@FindBy (id = "txt-mnuBilling")
	public WebElement manageBilling;
		
	// Management -> Problem Reports menu item 
	@FindBy (id = "txt-mnuProblemReports")
	public WebElement manageProblemReports;
		
	// Management -> Tech Assignment menu item 
	@FindBy (id = "txt-mnuTechAssignments")
	public WebElement manageTechAssignment;
		
	// Management -> Quote menu item 
	@FindBy (id = "txt-mnuQuote")
	public WebElement manageQuote;
		
	// Management -> Contract Pricing menu item 
	@FindBy (id = "txt-mnuContractPricing")
	public WebElement manageContractPricing;
	
	// Management -> Calendar menu item 
	@FindBy (id = "txt-mnuManageCalendar")
	public WebElement manageCalendar;
	
	
public ManagementSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

