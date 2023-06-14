package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddPartWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Part page
	 */
	
	@FindBy (id = "cDescription")
	public WebElement partDescription;
	
	@FindBy (id = "cPartNumber")
	public WebElement partPartNumber;
	
	@FindBy (id = "nQuantityonhand")
	public WebElement partOnHand;
	
	@FindBy (id = "nQuantityReOrder")
	public WebElement partReOrder;
	
	@FindBy (id = "nOrderLevel")
	public WebElement partLastQty;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[1]")
	public WebElement elipsisButtonManufacturer;
	
	@FindBy (id = "nManufacturerUID_display")
	public WebElement partManufacturer;
	
	@FindBy (id = "cClass")
	public WebElement partClass;
	
	@FindBy (id = "cUOM")
	public WebElement typePurchaseUnit;
	
	@FindBy (id = "nItemPrice")
	public WebElement partPrice;
	
	@FindBy (id = "cStockNumber")
	public WebElement partStockNumber;
	
	@FindBy (id = "cGroup")
	public WebElement partGroup;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[3]")
	public WebElement elipsisButtonInventoriedBy;
	
	@FindBy (id = "nInventoryByUID_display")
	public WebElement partInventoriedBy;
	
	@FindBy (id = "tInventoryDate")
	public WebElement partDateInventoried;
	
	@FindBy (id = "nItemCost")
	public WebElement partCost;
	
	@FindBy (id = "cPhysicalLocation")
	public WebElement partLocation;
		
	@FindBy (id = "cSupplier")
	public WebElement partSupplier;
	
	@FindBy (id = "tLastDatePurchased")
	public WebElement partLastOrdered;
	
	@FindBy (id = "cLastPurchaseAmount")
	public WebElement partLastCost;
	
	@FindBy (id = "btnSave")
	public WebElement partSave;
	
	@FindBy (id = "btnClose")
	public WebElement partClose;
	
	
	/**
	 * End Elements Add Part page
	 */
	
public AddPartWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}