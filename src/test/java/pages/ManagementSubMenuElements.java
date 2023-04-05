package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ManagementSubMenuElements extends BaseClass {

	// Management -> Business Status menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[1]/a/span")
	public WebElement manageBusinessStatus;
	
	// Management -> Billing menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[2]/a/span")
	public WebElement manageBilling;
		
	// Management -> Problem Reports menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[4]/a/span")
	public WebElement manageProblemReports;
		
	// Management -> Tech Assignment menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[5]/a/span")
	public WebElement manageTechAssignment;
		
	// Management -> Quote menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[6]/a/span")
	public WebElement manageQuote;
		
	// Management -> Contract Pricing menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[7]/a/span")
	public WebElement manageContractPricing;
	
	// Management -> Calendar menu item 
	@FindBy (xpath = "/html/body/div[7]/ul/li[9]/a/span")
	public WebElement manageCalendar;
	
	
public ManagementSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

