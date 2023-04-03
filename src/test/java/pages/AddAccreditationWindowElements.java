package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddAccreditationWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Accreditation page
	 */
	
	@FindBy (xpath = "//*[@id='cCode' and @name ='cCode']")
	public WebElement accredCode;
	
	@FindBy (xpath = "//*[@id='cType' and @class = 'x-form-text x-form-field x-abs-layout-item']")
	public WebElement accredType;
	
	@FindBy (xpath = "//*[@id='cDescription' and @class = 'x-form-text x-form-field x-abs-layout-item']")
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