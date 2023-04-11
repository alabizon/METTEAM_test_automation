package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddShippingWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Shipping page
	 */
	
	//this element switch to frame from find asset screen to add asset screen
	@FindBy (xpath = "//*[@id =\"frame_2\"]")
	public WebElement windowSwitch;
	
	
	@FindBy (id = "btn-nFacilityUID_display")
	public WebElement elipsisButtonCustomer;
	
	@FindBy (id = "btn-nTypeUID_display")
	public WebElement elipsisButtonTypeDescription;
	
	@FindBy (id = "btn-tbSave")
	public WebElement buttonSave;
	
	@FindBy (id = "btn-tbReceive")
	public WebElement buttonReceive;
	
	/**
	 * End Elements Add Shipping page
	 */
	
public AddShippingWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}