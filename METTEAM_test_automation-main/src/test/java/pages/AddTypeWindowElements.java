package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddTypeWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Type page
	 */
	
	@FindBy (id = "cDescription")
	public WebElement typeDescription;
	
	@FindBy (id = "nItemCost")
	public WebElement typeItemCost;
	
	@FindBy (id = "nReplacementCost")
	public WebElement typeReplaceCost;
	
	@FindBy (xpath = "(//*[@class = 'x-form-trigger btn-trigger-search'])[1]")
	public WebElement elipsisButtonManufacturer;
	
	@FindBy (id = "cModelNumber")
	public WebElement typeModelNumber;
	
	@FindBy (id = "cWeight")
	public WebElement typeWeight;
	
	@FindBy (id = "cPartNumber")
	public WebElement typeSize;
	
	@FindBy (id = "cStockNumber")
	public WebElement typeStockNumber;
	
	@FindBy (id = "cDimension")
	public WebElement typeDimension;
	
	@FindBy (id = "cClass")
	public WebElement typeClass;
	
	@FindBy (id = "cFamily")
	public WebElement typeFamily;
	
	@FindBy (id = "tbSave")
	public WebElement typeSave;
	
	@FindBy (id = "tbClose")
	public WebElement typeClose;
	
	/**
	 * End Elements Add Type page
	 */
	
public AddTypeWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}