package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class FindUserWindowElements extends BaseClass {
	
	/**
	 * Beginning Elements from Find User Screen
	 */
		
	@FindBy (xpath = "//*[@class = 'x-grid3-col x-grid3-cell x-grid3-td-cValue x-grid3-cell-last x-grid3-cell-selected']")
	public WebElement findUserLastNameSearchValue;
		
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[5]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement FindButton;
	
	@FindBy (xpath = "/html/body/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr/td[13]/table/tbody/tr[2]/td[2]/em/button")
	public WebElement OkButton;
	
	public FindUserWindowElements() {
		
	PageFactory.initElements(driver, this);
	    
	/**
	* End Elements from Find User screen
	*/ 
		
}
}