package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddAccreditationWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Accreditation page
	 */
	
	@FindBy (id = "cCode")
	public WebElement accredCode;
	
	@FindBy (id = "cType")
	public WebElement accredType;
	
	@FindBy (id = "cDescription")
	public WebElement accredDescription;
	
	@FindBy (id = "tStartDate")
	public WebElement accredStartDate;
	
	@FindBy (id = "tEndDate")
	public WebElement accredEndDate;
	
	@FindBy (id = "tbSave")
	public WebElement buttonSave;
	
	@FindBy (id = "tbClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Accreditation page
	 */
	
public AddAccreditationWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}