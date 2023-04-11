package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.JsCommonMethods;

public class CreateWorkOrderFromAsset extends CommonMethods {
	
	@When("Click on Maintenance and click on the Asset")
	public void click_on_Maintenance_and_click_on_the_Asset() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(concoleMenuMetTeamElements.btnMaintenance);
		Thread.sleep(1000);
		
		CommonMethods.click(maintenanceSubMenuElements.maintAssets);
		Thread.sleep(1000);
		
		}

	@Then("Find Asset {string} is open and click Add button")
	public void find_Asset_is_open_and_click_on_Add_button(String WindowName) throws Throwable {
		
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(findScreenWindowElements.addButton);
		CommonMethods.click(findScreenWindowElements.addButton);
		
	}
	
	@Then("{string} window is opened and click ellipsis button next to the Customer")
	public void window_is_opened_and_click_on_Elipsis_button_next_to_the_Customer(String WindowName) throws InterruptedException {
		
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(addAssetWindowElements.elipsisButtonCustomer);
		CommonMethods.click(addAssetWindowElements.elipsisButtonCustomer);
		Thread.sleep(1000);
		
	}
	 
	@Then("{string} window is open werify title and click Find button")
	public void window_is_open_werify_title_and_click_on_Find_button(String WindowName) throws Throwable {		
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		CommonMethods.swithToFrame(frames.Frame3);
		CommonMethods.waitForVisib(findScreenWindowElements.FindButton);
		CommonMethods.click(findScreenWindowElements.FindButton);
		Thread.sleep(1000);
		
	}
	
	@Then("find specific {string} from the grid and click OK button")
	public void find_specific_from_the_grid_and_click_ok_button(String string) throws Throwable {
	 	
		for (WebElement element : findScreenWindowElements.gridTypesFromTheFindFacility ) {
    		String name = element.getText();
    	
    	if(name.equals(string)){
    		
    	JsCommonMethods.drawBlueBorder(element);
    	CommonMethods.click(element);
    	Thread.sleep(2000);
    	
    	}
    	
}   
		
		CommonMethods.waitForVisib(findTypeWindowElements.okButton);
		CommonMethods.click(findTypeWindowElements.okButton); 

}
	@Then("Click ellipsis button next to the Type Description {string} window is open")
	public void click_on_elipsis_button_next_to_the_Type_Description_window_is_open(String string) throws Throwable {
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(addAssetWindowElements.elipsisButtonTypeDescription);
	    CommonMethods.click(addAssetWindowElements.elipsisButtonTypeDescription);
	    Thread.sleep(1000);
	}

	@Then("Click Find button then find {string} from the grid and click OK button")
	public void click_on_the_Find_button_then_find_from_the_grid_and_click_ok_button(String string) throws Throwable  {
		
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		Thread.sleep(1000);
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(findScreenWindowElements.FindButton);
	    CommonMethods.click(findScreenWindowElements.FindButton);
	    Thread.sleep(1000);
	    	    	
	    	for (WebElement element : findTypeWindowElements.gridTypesFromTheFindType ) {
	    		String name = element.getText();
	    	
	    	
	    	if(name.equals(string)){
	    		
	    	JsCommonMethods.drawBlueBorder(element);
	    	CommonMethods.click(element);
	    	Thread.sleep(2000);
	    	
	    	}
	    	
	}   
	    	
	    	CommonMethods.waitForVisib(findTypeWindowElements.okButton);
	    	CommonMethods.click(findTypeWindowElements.okButton); 

	}
	@Then("click yes on 'Update all Asset data with current Type data?' window")
	public void click_yes_on_Update_all_Asset_data_with_current_Type_data_window() throws Throwable {
		Thread.sleep(3000);
	    CommonMethods.swithToFrame(frames.Frame1);
	    CommonMethods.waitForVisib(findTypeWindowElements.buttonYesOnChildWindow);
	    CommonMethods.click(findTypeWindowElements.buttonYesOnChildWindow);
	    Thread.sleep(2000);
	    
	}
	
	
	@Then("click Save button and click Receive Asset button")
	public void click_on_save_button_and_Receive_Asset() throws Throwable {
		driver.switchTo().parentFrame();
		CommonMethods.swithToFrame(frames.Frame1);
		CommonMethods.waitForVisib(addAssetWindowElements.buttonSave);
		CommonMethods.click(addAssetWindowElements.buttonSave);
		
		CommonMethods.waitForVisib(addAssetWindowElements.buttonReceive);
		JsCommonMethods.drawRedBorder(addAssetWindowElements.buttonReceive);
		CommonMethods.waitForVisib(addAssetWindowElements.buttonReceive);
		CommonMethods.click(addAssetWindowElements.buttonReceive);
		//CommonMethods.waitForVisib(addAssetWindowElements.buttonReceive);
		//CommonMethods.click(addAssetWindowElements.buttonReceive);
		Thread.sleep(2000);
	}
	
	@Then("{string} window is opened verify title and click Add Result button")
	public void window_is_opened_verify_title_and_click_on_Add_Result_button(String string) throws Throwable {
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		CommonMethods.swithToFrame(editWorkOrderElements.FrameWorkOrder);
		CommonMethods.waitForClickability(editWorkOrderElements.buttonAddResult);
		CommonMethods.click(editWorkOrderElements.buttonAddResult);
		Thread.sleep(3000);
	}
	
	@Then("Open Chromidium")
	public void open_Chromidium() throws Throwable {
		
		
		DesktopOptions options  = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files (x86)\\Fluke\\METCAL\\mcrt.exe");
		//WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		
		
		
//		WebElement el = driver.findElementByName("Open mcrt");
//		WebElement close = driver.findElementByName("Close");
//		close.click();
		
		
		//CommonMethods.click(el);
		Thread.sleep(7000);

		Thread.sleep(3000);
	}

	
	
	}



	


