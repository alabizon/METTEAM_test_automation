package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class CreateTemplate extends CommonMethods {
	
	public static String TemplateName;
	
	@When("Click Maintenance and click Manual Templates")
	public void click_Maintenance_and_click_Manual_Templates() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		maintenanceSubMenuElements.maintManualTemplates.click();

	}

	@Then("Add Manual Template window is open and enter Template Name and click Template_Design tab")
	public void add_Manual_Template_window_is_open_and_enter_Template_Name_and_click_Template_Design_tab() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		TemplateName = "Template_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addTemplateWindowElements.tempateName, TemplateName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.MANUAL_TEMPLATE_CELL, 1, TemplateName);
		
		CommonMethods.click(addTemplateWindowElements.templateTabTemplateDesign);
		
	}
	
	@Then("drag right border, extend and drop it")
	public void drag_right_border_extend_and_drop_it() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Point point1 = addTemplateWindowElements.templateLeftBorder.getLocation();
		int leftBorderCoord = point1.getX();
		//Point point2 = addTemplateWindowElements.templateRightBorder.getLocation();
		//int rightBorderCoord = point2.getX();
		//System.out.print("----------------------------- " + leftBorderCoord);
		//System.out.print("----------------------------- " + rightBorderCoord);
		
		if (leftBorderCoord > 400) {
			CommonMethods.dragAndDrop(addTemplateWindowElements.templateLeftBorder, -200, 0);
			Thread.sleep(2000);
			CommonMethods.dragAndDrop(addTemplateWindowElements.templateRightBorder, 400, 0);
		}
		
	}
	
//	@Then("Right-click and select {string} from context menu {int} times")
//	public void right_click_and_select_from_context_menu_times(String string, Integer int1) throws InterruptedException {
//		driver.switchTo().defaultContent();
//		CommonMethods.swithToFrame(frames.Frame2);
//		
//		CommonMethods.rightClick(addTemplateWindowElements.templateDesignSpace);
//		CommonMethods.click(addTemplateWindowElements.templateSubmenuAddRowFirst);
//		
//		for (int i=0; i<12; i++) {
//			
//			for (int j=12; j<24; j++) {
//				
//				String elemLocator = "(//*[text()='Add Row'])[" + j + "]";
//				//String elemLocator = "/html/body/div[" + j + "]/ul/li[1]/a/span";
//				System.out.println("----------------------------------- " + elemLocator);
//			
//				CommonMethods.rightClick(addTemplateWindowElements.templateDesignSpace);
//				//Thread.sleep(500);
//				driver .findElement(By.xpath(elemLocator)).click();
//				Thread.sleep(1000);
//			
//			}
//			
//		}
//			
//		
//	}
	
	@Then("Right-click and select {string} from context menu")
	public void right_click_and_select_from_context_menu(String string) {
		driver.switchTo().defaultContent();
 		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.rightClick(addTemplateWindowElements.templateDesignSpace);
		CommonMethods.click(addTemplateWindowElements.templateSubmenuStepWizard);
		
	}
	
	@Then("Enter Start, End, Step Size and select {string} Unit")
	public void enter_Start_End_Step_Size_and_select_Unit(String string) throws Throwable {
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizStart, "7.25");
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizEnd, "100");
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizStepSize, "12.30");
		CommonMethods.click(addTemplateWindowElements.templateWizUnitButton);
		CommonMethods.selectValueFromBootStrapDropDown(addTemplateWindowElements.templateWizUnit, string);
		
	}
	
	@Then("Enter %Reading, %FS, Floor and Resolution")
	public void enter_Reading_FS_Floor_and_Resolution() {
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizReading, "0.2");
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizFs, "1");
		CommonMethods.sendKeys(addTemplateWindowElements.templateWizFloor, "2");
		driver.findElement(By.id("txtWizardResolution")).clear();
		driver.findElement(By.id("txtWizardResolution")).click();
		driver.findElement(By.id("txtWizardResolution")).sendKeys("4");
		
	}
	
	@Then("Click Save wizard, click Save template and click Close")
	public void click_Save_wizard_click_Save_template_and_click_Close() throws Throwable {
		CommonMethods.click(addTemplateWindowElements.templateWizSave);
		Thread.sleep(500);
		CommonMethods.click(addTemplateWindowElements.templateSave);
		Thread.sleep(1000);
		CommonMethods.click(addTemplateWindowElements.templateClose);
		
	}
	
}


	


