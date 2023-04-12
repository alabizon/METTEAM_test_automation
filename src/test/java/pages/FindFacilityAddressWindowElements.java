package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FindFacilityAddressWindowElements extends BaseClass {
	
	/**
	 * Beginning Elements from Find Facility Address Screen
	 */
		
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-cValue x-grid3-cell-last x-grid3-cell-selected']")
	public WebElement findFacilityAddressFacilityNameSearchValue;
		
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement findFacilityAddressFindButton;
	
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[13]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement findFacilityAddressOkButton;
	
	public FindFacilityAddressWindowElements() {
		
	PageFactory.initElements(driver, this);
	    
	/**
	* End Elements from Find Facility Address screen
	*/ 
		
}
}