package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddLogNoteWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Log Note page
	 */
	
	@FindBy (xpath = "//*[@id ='cStatus']/following-sibling::img")
	public WebElement addlognoteStatusButton;
	
	@FindBy (xpath = "")
	public List<WebElement> addlognoteStatusList;
	
	@FindBy (xpath = "//*[@id='cStatus' and @class = 'x-form-text x-form-field x-trigger-noedit']")
	public WebElement addlognoteStatus;
	
	@FindBy (id = "cLocation")
	public WebElement addlognoteLocation;
	
	@FindBy (id = "mLogNote")
	public WebElement addlognotelogNote;
	
	@FindBy (xpath = "//*[@id ='nUserUID_display']/following-sibling::img")
	public WebElement elipsisUser;
	
	@FindBy (id = "nUserUID_display")
	public WebElement addlognoteUser;
	
	@FindBy (xpath = "//*[@id='tbSave' and @class = 'x-btn x-btn-icon-text x-btn-text-icon']")
	public WebElement addlognoteSaveButton;
	
	@FindBy (id = "")
	public WebElement addlognoteCloseButton;
	
	/**
	 * End Elements Add Log Note page
	 */
	
public AddLogNoteWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}