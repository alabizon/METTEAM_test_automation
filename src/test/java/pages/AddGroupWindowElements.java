package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddGroupWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Group page
	 */
	
	@FindBy (id = "cGroupName")
	public WebElement groupName;
	
	@FindBy (xpath = "//*[@id=\'tbSave\']")
	public WebElement groupBtnSave;
	
	@FindBy (xpath = "//*[@id=\'cmdAddMember\']")
	public WebElement groupAddNewMember;
	
	@FindBy (xpath = "//*[@id=\'tbClose\']")
	public WebElement groupBtnClose;
	
	/**
	 * End Elements Add Group page
	 */
	
public AddGroupWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}