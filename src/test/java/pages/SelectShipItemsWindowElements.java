package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class SelectShipItemsWindowElements extends BaseClass {
	
	/**
	 * Beginning Elements from Select Shipment Item Screen
	 */
		
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-cValue x-grid3-cell-last x-grid3-cell-selected']")
	public WebElement findShipItemBarcodeSearchValue;
		
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement FindButton;
	
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[13]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement OkButton;
	
	@FindBy (xpath = "//*[@class ='x-grid3-row-table']/tbody/tr/td/div")
	public List<WebElement> listElementsFromTheFindScreen;
	
	public SelectShipItemsWindowElements() {
		
	PageFactory.initElements(driver, this);
	    
	/**
	* End Elements from Select Shipment Item screen
	*/ 
		
}
}