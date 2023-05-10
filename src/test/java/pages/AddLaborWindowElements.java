package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddLaborWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Labor page
	 */
	
	@FindBy (id = "lNoCharge")
	public WebElement addlaborNoCharge;
	
	@FindBy (xpath = "//*[@id='tStartTime' and @class = 'x-form-text x-form-field']")
	public WebElement addlaborStartDate;
	
	@FindBy (xpath = "//*[@id='nDuration' and @class = 'x-form-text x-form-field x-abs-layout-item']")
	public WebElement addlaborDuration;
	
	@FindBy (xpath = "//*[@id ='nUserUID_display']/following-sibling::img")
	public WebElement elipsisUser;
	
	@FindBy (id = "nUserUID_display")
	public WebElement addlaborUser;
	
	@FindBy (xpath = "")
	public WebElement elipsisCategory;
	
	@FindBy (id = "")
	public WebElement addlaborCategory;
	
	@FindBy (xpath = "")
	public WebElement elipsisSubCategory;
	
	@FindBy (id = "")
	public WebElement addlaborSubCategory;
	
	@FindBy (id = "nRate")
	public WebElement addlaborRate;
	
	@FindBy (id = "")
	public WebElement addlaborCost;
	
	@FindBy (xpath = "//*[@class='x-btn x-btn-icon-text x-btn-text-icon x-btn-over']")
	public WebElement addlaborSaveButton;
	
	@FindBy (id = "")
	public WebElement addlaborCloseButton;
	
	/**
	 * End Elements Add Labor page
	 */
	
public AddLaborWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}