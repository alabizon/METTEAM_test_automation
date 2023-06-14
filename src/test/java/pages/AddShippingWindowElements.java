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
		
	@FindBy (xpath = "//*[@id ='cShipMode' and @name = 'cShipMode']")
	public WebElement shipShipper;
	
	@FindBy (id = "cShipMode")
	public WebElement shipShipperValue;
	
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
	
	@FindBy (xpath = "//*[@class='x-grid3-cell-inner x-grid3-col-cBarcode' and text()='SAMPLE-10']")
	public WebElement shipAddAssetSearchResult;
	
	@FindBy (id = "tbAddNonAsset")
	public WebElement shipAddNonAsset;
	
	@FindBy (xpath = "/html/body/div[10]/div[2]/div[2]/div/div/div/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[2]")
	public WebElement alertYesButton;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr/td[2]/div")
	public WebElement firstGridNomenclature;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr/td[3]/div")
	public WebElement firstGridModNumber;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr/td[4]/div")
	public WebElement firstGridSerNumber;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[1]/table/tbody/tr/td[5]/div")
	public WebElement firstGridBarcode;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/table/tbody/tr/td[2]/div")
	public WebElement secondGridNomenclature;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/table/tbody/tr/td[3]/div")
	public WebElement secondGridModNumber;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/table/tbody/tr/td[4]/div")
	public WebElement secondGridSerNumber;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/table/tbody/tr/td[5]/div")
	public WebElement secondGridBarcode;

	
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