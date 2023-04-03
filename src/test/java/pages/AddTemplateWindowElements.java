package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddTemplateWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Manual Template page
	 */
	
	@FindBy (id = "cTemplateName")
	public WebElement tempateName;
	
	@FindBy (id = "tab-tabPanel1__panel1")
	public WebElement templateTabTemplate;
	
	@FindBy (id = "tab-tabPanel1__panel2")
	public WebElement templateTabTemplateDesign;
	
	@FindBy (className = "x-grid3-scroller")
	public WebElement templateDesignSpace;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[19]")
	public WebElement templateSubmenuAddRow;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[20]")
	public WebElement templateSubmenuCopyRow;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[21]")
	public WebElement templateSubmenuRemoveRow;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[22]")
	public WebElement templateSubmenuUpdateFormula;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[23]")
	public WebElement templateSubmenuDeleteFormula;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[24]")
	public WebElement templateSubmenuRemoveAll;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[25]")
	public WebElement templateSubmenuResequence;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[26]")
	public WebElement templateSubmenuStepWizard;
	
	@FindBy (xpath = "(//*[@class = 'x-menu-item-text'])[27]")
	public WebElement templateSubmenuStepWizardTrans;
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy (id = "btnSave")
	public WebElement partSave;
	
	@FindBy (id = "btnClose")
	public WebElement partClose;
	
	
	/**
	 * End Elements Add Manual Template page
	 */
	
public AddTemplateWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}