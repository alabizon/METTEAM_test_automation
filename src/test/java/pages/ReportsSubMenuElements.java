package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class ReportsSubMenuElements extends BaseClass {

	// Reports -> Recall menu item 
	@FindBy (id = "txt-mnuRecall")
	public WebElement reportRecall;
	
	// Reports -> Batch Printing menu item 
	@FindBy (id = "txt-mnuBatchCert")
	public WebElement reportBatchPrinting;
		
	// Reports -> Custom Reports menu item 
	@FindBy (id = "txt-mnuCustomReports")
	public WebElement reportCustomReports;
		
	// Reports -> Alerting Schedules menu item 
	@FindBy (id = "txt-mnuAlerting")
	public WebElement reportAlertingSchedules;
		

public ReportsSubMenuElements() {
		
	    PageFactory.initElements(driver, this);
		
}
}

