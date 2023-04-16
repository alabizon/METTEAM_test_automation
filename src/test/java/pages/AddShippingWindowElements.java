package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddShippingWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Shipping page
	 */
	
	@FindBy (xpath = "//*[@id= 'nFromUID_display']")
	//@FindBy (xpath = "//*[@class = 'x-form-text x-form-field x-form-focus']")
	public WebElement shipFrom;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[1]")
	public WebElement elipsisButtonShipFrom;
	
	@FindBy (id = "nToUID_display")
	public WebElement shipTo;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[2]")
	public WebElement elipsisButtonShipTo;
	
	@FindBy (id = "btnFrom")
	public WebElement shipBtnFrom;
	
	@FindBy (id = "mFromAddress")
	public WebElement shipFromAddress;
	
	@FindBy (id = "btnTo")
	public WebElement shipBtnTo;
	
	@FindBy (id = "mToAddress")
	public WebElement shipToAddress;
	
	@FindBy (id = "cShipmentName")
	public WebElement shipShipmentName;
	
	@FindBy (id = "cLocation")
	public WebElement shipLocation;
		
	@FindBy (xpath = "/html/body/div[3]/div/form/div/div[2]/div/div[1]/div/div/div[6]")
	public WebElement shipShipper;
	
	@FindBy (xpath = "//*[@class ='x-combo-list-inner']/div")
	public List<WebElement> shipShipperList;
	
	@FindBy (id = "cDesignator")
	public WebElement shipTrackingNum;
	
	@FindBy (id = "tRequiredDate")
	public WebElement shipReqDate;
	
	@FindBy (id = "cAuthority")
	public WebElement shipAuthority;
	
	@FindBy (id = "mNotes")
	public WebElement shipNotes;
	
	@FindBy (id = "cAppropriationData")
	public WebElement shipAddInfo;
	
	@FindBy (id = "cIssuedBy")
	public WebElement shipIssuedBy;
	
	@FindBy (xpath = "(//*[@class = 'x-tab-left'])[2]")
	public WebElement shipItemsTab;
	
	@FindBy (id = "tbAddAsset")
	public WebElement shipAddAsset;
	
	@FindBy (id = "tbAddNonAsset")
	public WebElement shipAddNonAsset;
	
	@FindBy (xpath = "/html/body/div[10]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]")
	public WebElement alertYesButton;
	
	@FindBy (id = "btnSave")
	public WebElement buttonSave;
	
	@FindBy (id = "btnClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Shipping page
	 */
	
public AddShippingWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}