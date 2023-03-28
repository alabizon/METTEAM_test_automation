package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AttachDataSheetElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Procedure page
	 */
	
	//this element switch to frame from find procedures screen to add procedures screen
	@FindBy (xpath = "//*[@id =\"frame_3\"]")
	public WebElement windowSwitch2;
	
	@FindBy (id = "ext-comp-1016")
	public WebElement attachDataSheetLinkToSearchValue;
	
	@FindBy (id = "btn-btnFind")
	public WebElement attachDataSheetFind;
	
	@FindBy (id = "btn-btnOk")
	public WebElement attachDataSheetOk;
	
	/**
	 * End Elements Add Procedure page
	 */
	
public AttachDataSheetElements() {
		
	    PageFactory.initElements(driver, this);
}
}