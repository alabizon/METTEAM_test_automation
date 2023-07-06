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
	public WebElement addLaborNoCharge;
	
	@FindBy (xpath = "//*[@id='tStartTime' and @class = 'x-form-text x-form-field']")
	public WebElement addLaborStartDate;
	
	@FindBy (xpath = "//*[@id='nDuration' and @class = 'x-form-text x-form-field x-abs-layout-item']")
	public WebElement addLaborDuration;
	
	@FindBy (xpath = "//*[@id ='nUserUID_display']/following-sibling::img")
	public WebElement addLaborUserElipsisButton;
	
	@FindBy (id = "nUserUID_display")
	public WebElement addLaborUser;
	
	@FindBy (xpath = "//*[@id ='nCategoryUID_display']/following-sibling::img")
	public WebElement addLaborCategoryElipsisButton;
	
	@FindBy (id = "nCategoryUID_display")
	public WebElement addLaborCategory;
	
	@FindBy (xpath = "//*[@id ='nSubCategoryUID_display']/following-sibling::img")
	public WebElement addLaborSubCategoryElipsisButton;
	
	@FindBy (id = "nSubCategoryUID_display")
	public WebElement addLaborSubCategory;
	
	@FindBy (xpath = "//*[@id='nRate' and @name ='nRate']")
	public WebElement addLaborRate;
	
	@FindBy (xpath = "//*[@id='nCost' and @name ='nCost']")
	public WebElement addLaborCost;
	
	@FindBy (xpath = "//*[@id='tbSave' and @class = 'x-btn x-btn-icon-text x-btn-text-icon']")
	public WebElement addLaborSaveButton;
	
	@FindBy (xpath = "//*[@class = ' x-btn-text tb-close']")
    public WebElement addLaborCloseButton;
	
	/**
	 * End Elements Add Labor page
	 */
	
public AddLaborWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}