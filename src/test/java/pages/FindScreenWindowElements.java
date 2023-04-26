package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FindScreenWindowElements extends BaseClass {
	
	/**
     * Beginning Elements which give the Title finds screen Name"
     */ 
	
	@FindBy (id = "ext-gen74")
	public WebElement TextFromTheTitle;
	/**
     * End Elements which give the Title finds screen Name"
     */
	
	
	/**
	 * Beginning Elements from Find Screen
	 */
	@FindBy (id = "ID_Remember")
	public WebElement RememberButton;
	
	@FindBy (id = "btnFind")
	public WebElement FindButton;
	
	@FindBy (xpath = "//*[@class=\" x-btn-text tb-reset-all\"]")
	public WebElement ResetAllButton;
	
	@FindBy (xpath = "//*[@class=' x-btn-text' and contains(text(),'Yes')]")
	public WebElement ResetAllAlertYesButton;
	
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-cValue x-grid3-cell-last x-grid3-cell-selected']/div")
	public WebElement findFacilityFacilityNameSearchValue;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Add')]")
	public WebElement addButton;
	
	@FindBy (id = "btnOk")
	public WebElement OkButton;
	
	@FindBy (xpath = "//*[@class=\"x-grid3-body\"]/div/table/tbody/tr/td/div")
	public List<WebElement> gridTypesFromTheFindFacility;
			
	public FindScreenWindowElements() {
		
	    PageFactory.initElements(driver, this);
	    
	    /**
	     * End Elements from Find Screen
	     */ 
		
}
}