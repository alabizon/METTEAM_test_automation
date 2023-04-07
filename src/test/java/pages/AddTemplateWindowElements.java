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
	
	@FindBy (xpath = "(//*[@class = 'x-tab-right'])[1]")
	public WebElement templateTabTemplate;
	
	@FindBy (xpath = "(//*[@class = 'x-tab-right'])[2]")
	public WebElement templateTabTemplateDesign;
	
	@FindBy (xpath = "/html/body/div[4]/div/form/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[2]")
	public WebElement templateDesignSpace;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[1]")
	public WebElement templateSubmenuAddRow;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[2]")
	public WebElement templateSubmenuCopyRow;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[3]")
	public WebElement templateSubmenuRemoveRow;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[5]")
	public WebElement templateSubmenuUpdateFormula;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[6]")
	public WebElement templateSubmenuDeleteFormula;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[8]")
	public WebElement templateSubmenuRemoveAll;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[10]")
	public WebElement templateSubmenuResequence;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[12]")
	public WebElement templateSubmenuStepWizard;
	
	@FindBy (xpath = "/html/body/div[10]/ul/li[13]")
	public WebElement templateSubmenuStepWizardTrans;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[1]")
	public WebElement templateDescription1;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[2]")
	public WebElement templateDescription2;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[3]")
	public WebElement templateDescription3;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[4]")
	public WebElement templateDescription4;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[5]")
	public WebElement templateDescription5;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[6]")
	public WebElement templateDescription6;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[7]")
	public WebElement templateDescription7;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[8]")
	public WebElement templateDescription8;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[9]")
	public WebElement templateDescription9;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-2'])[10]")
	public WebElement templateDescription10;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[1]")
	public WebElement templateLabel1;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[2]")
	public WebElement templateLabel2;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[3]")
	public WebElement templateLabel3;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[4]")
	public WebElement templateLabel4;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[5]")
	public WebElement templateLabel5;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[6]")
	public WebElement templateLabel6;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[7]")
	public WebElement templateLabel7;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[8]")
	public WebElement templateLabel8;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[9]")
	public WebElement templateLabel9;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-3'])[10]")
	public WebElement templateLabel10;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[1]")
	public WebElement templateRowType1;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[2]")
	public WebElement templateRowType2;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[3]")
	public WebElement templateRowType3;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[4]")
	public WebElement templateRowType4;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[5]")
	public WebElement templateRowType5;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[6]")
	public WebElement templateRowType6;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[7]")
	public WebElement templateRowType7;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[8]")
	public WebElement templateRowType8;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[9]")
	public WebElement templateRowType9;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-4'])[10]")
	public WebElement templateRowType10;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[1]")
	public WebElement templateNominal1;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[2]")
	public WebElement templateNominal2;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[3]")
	public WebElement templateNominal3;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[4]")
	public WebElement templateNominal4;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[5]")
	public WebElement templateNominal5;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[6]")
	public WebElement templateNominal6;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[7]")
	public WebElement templateNominal7;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[8]")
	public WebElement templateNominal8;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[9]")
	public WebElement templateNominal9;
	
	@FindBy (xpath = "(//*[@class = 'x-grid3-cell-inner x-grid3-col-7'])[10]")
	public WebElement templateNominal10;
	
	
	
	
	
	
	
	
	
	
	
	
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