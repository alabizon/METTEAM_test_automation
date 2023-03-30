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
	
	@FindBy (xpath = "(//*[@class = ' x-form-text x-form-field x-abs-layout-item'])[1]")
	public WebElement typeItemCost;
	
	@FindBy (xpath = "(//*[@class = ' x-form-text x-form-field x-abs-layout-item'])[2]")
	public WebElement typeReplaceCost;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field'])[1]")
	public WebElement typeManufacturer;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement typeModelNumber;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[6]")
	public WebElement typeWeight;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement typeSize;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement typeStockNumber;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[7]")
	public WebElement typeDimension;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[3]")
	public WebElement typeClass;
	
	@FindBy (xpath = "(//*[@class = 'x-form-text x-form-field x-abs-layout-item'])[5]")
	public WebElement typeFamily;
	
	@FindBy (className = " x-btn-text tb-save")
	public WebElement typeSave;
	
	@FindBy (className = " x-btn-text tb-close")
	public WebElement typeClose;
	
	/**
	 * End Elements Add Type page
	 */
	
public AddTypeWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}