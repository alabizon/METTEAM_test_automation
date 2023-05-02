package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;
import utils.JsCommonMethods;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VerifyContractPricing extends CommonMethods {
	
	public static String FieldContent;
		
	@Then("Click OK button on the {string} screen")
	public void click_OK_button_on_the_screen(String string) throws Throwable {
		CommonMethods.click(findScreenWindowElements.OkButton);
		Thread.sleep(1000);
		
	}
	
	@Then("Verify Customer is {string}")
	public void verify_Customer_is(String string) {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		FieldContent = CommonMethods.getAttribute(addContractPricingWindowElements.pricingCustomer);
		Assert.assertEquals(string, FieldContent);
		
	}

	@Then("Verify Working Facility is {string}")
	public void verify_Working_Facility_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContractPricingWindowElements.pricingWorkingFacility);
		Assert.assertEquals(string, FieldContent);
		
	}

	@Then("Verify Effective Date is {string}")
	public void verify_Effective_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContractPricingWindowElements.pricingEffectiveDate);
		Assert.assertEquals(string, FieldContent);
		
	}

	@Then("Verify Expire Date is {string}")
	public void verify_Expire_Date_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContractPricingWindowElements.pricingExpireDate);
		Assert.assertEquals(string, FieldContent);
		
	}
	
	@Then("Verify Contract Price is {string}")
	public void verify_Contract_Price_is(String string) {
		FieldContent = CommonMethods.getAttribute(addContractPricingWindowElements.pricingPrice);
		Assert.assertEquals(string, FieldContent);
		
	}
	
}


	


