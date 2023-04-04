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
	 * Beginning Elements from FindScreen
	 */
	//this element switch to frame from main page to find screen
		
	@FindBy (className = " x-btn-text tb-find")
	public WebElement FindButton;
	
	@FindBy (className = "x-grid3-cell-inner x-grid3-col-cFacilityName")
	public WebElement topGridTopRecord;
	
	@FindBy (xpath = "//*[@type='button' and contains(text(),'Add')]")
	public WebElement addButton;
	
	@FindBy (className = " x-btn-text tb-ok")
	public WebElement OkButton;
	
	@FindBy (xpath = "//*[@class=\"x-grid3-body\"]/div/table/tbody/tr/td/div")
	public List<WebElement> gridTypesFromTheFindFacility;
			
	public FindScreenWindowElements() {
		
	    PageFactory.initElements(driver, this);
	    
	    /**
	     * End Elements from FindScreen
	     */ 
		
}
}