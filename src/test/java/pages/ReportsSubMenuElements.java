package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ReportsSubMenuElements extends BaseClass {

	// Reports -> Recall menu item 
	@FindBy (xpath = "/html/body/div[8]/ul/li[1]/a/span")
	public WebElement reportRecall;
	
	// Reports -> Batch Printing menu item 
	@FindBy (xpath = "/html/body/div[8]/ul/li[3]/a/span")
	public WebElement reportBatchPrinting;
		
	// Reports -> Custom Reports menu item 
	@FindBy (xpath = "/html/body/div[8]/ul/li[5]/a/span")
	public WebElement reportCustomReports;
		
	// Reports -> Alerting Schedules menu item 
	@FindBy (xpath = "/html/body/div[8]/ul/li[5]/a/span")
	public WebElement reportAlertingSchedules;
		

public ReportsSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

