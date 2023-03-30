package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ManagementSubMenuElements extends BaseClass {

	// Management -> Business Status menu item 
	@FindBy (id = "ext-gen77")
	public WebElement manageBusinessStatus;
	
	// Management -> Billing menu item 
	@FindBy (id = "ext-gen79")
	public WebElement manageBilling;
		
	// Management -> Problem Reports menu item 
	@FindBy (id = "ext-gen82")
	public WebElement manageProblemReports;
		
	// Management -> Tech Assignment menu item 
	@FindBy (id = "ext-gen84")
	public WebElement manageTechAssignment;
		
	// Management -> Quote menu item 
	@FindBy (id = "ext-gen86")
	public WebElement manageQuote;
		
	// Management -> Contract Pricing menu item 
	@FindBy (id = "ext-gen88")
	public WebElement manageContractPricing;
	
	// Management -> Calendar menu item 
	@FindBy (id = "ext-gen91")
	public WebElement manageCalendar;
	
	
public ManagementSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

