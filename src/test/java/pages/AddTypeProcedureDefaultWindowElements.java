package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddTypeProcedureDefaultWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Type Procedure Default page
	 */
	
	@FindBy (xpath = "/html/body/div[3]/div/form/div[1]/div/div/img")
	public WebElement elipsisButtonProcName;
	
	@FindBy (id = "nProcedureUID_display")
	public WebElement defprocProcedureName;
	
	@FindBy (xpath = "/html/body/div[3]/div/form/div[6]/div/div/img")
	public WebElement elipsisButtonDataSheet;
	
	@FindBy (id = "nAttTemplateUID_display")
	public WebElement defprocDataSheet;
	
	@FindBy (xpath = "//*[@id='cInterval' and @class = 'x-form-text x-form-field x-abs-layout-item']")
	public WebElement defprocInterval;
	
	@FindBy (id = "btnSave")
	public WebElement defprocSave;
	
	@FindBy (id = "btnClose")
	public WebElement defprocClose;
	
	/**
	 * End Elements Add Type page
	 */
	
public AddTypeProcedureDefaultWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}