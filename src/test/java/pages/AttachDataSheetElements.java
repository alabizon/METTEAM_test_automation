package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AttachDataSheetElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Procedure page
	 */
	
	@FindBy (className = "x-form-text x-form-field x-trigger-noedit x-form-focus")
	public WebElement attachDataSheetLinkToSearchValue;
	
	@FindBy (xpath = "//*[@class = \"x-combo-list-inner\"]/div")
	public List<WebElement> linkToSearchValueClick;
	
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement attachDataSheetFind;
	
	@FindBy (xpath = "//*[@class='x-grid3-col x-grid3-cell x-grid3-td-cFileName ']/div")
	public List<WebElement> attachDataSheetResults;
	
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[13]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement attachDataSheetOk;

	
	/**
	 * End Elements Add Procedure page
	 */
	
public AttachDataSheetElements() {
		
	    PageFactory.initElements(driver, this);
}
}