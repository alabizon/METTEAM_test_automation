package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddShipItemWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Shipment Item page
	 */
	
	@FindBy (id = "cNomenclature")
	public WebElement ship_itemNomenclature;
	
	@FindBy (id = "cModelNumber")
	public WebElement ship_itemModelNum;
	
	@FindBy (id = "cSerialNumber")
	public WebElement ship_itemSerialNum;
	
	@FindBy (id = "cBarcode")
	public WebElement ship_itemBarcode;
	
	@FindBy (xpath = "/html/body/div[3]/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table")
	public WebElement ship_itemSave;
	
	/**
	 * End Elements Add Shipment Item page
	 */
	
public AddShipItemWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}