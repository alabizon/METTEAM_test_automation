package stepDefinitions;

import io.cucumber.java.en.Then;
import utils.CommonMethods;
import utils.Constants;
import utils.ExcelUtility;

public class CreateManyFacilities extends CommonMethods {
	
	public static String FacilityName;
	
	@Then("Enter Customer2 Facility Name and check Customer checkbox")
	public void enter_Customer2_Facility_Name_and_check_Customer_checkbox() {
		driver.switchTo().defaultContent();
		CommonMethods.swithToFrame(frames.Frame2);
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Cust2_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_CUST2_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityCustomer);
		
	}
	
	@Then("Click Save facility button")
	public void click_Save_facility_button() throws Throwable {
		CommonMethods.click(addFacilityWindowElements.buttonSave);
		Thread.sleep(1000);
		
	}

	@Then("Click Add button")
	public void click_Add_button() {
		CommonMethods.click(addFacilityWindowElements.buttonAdd);
		
	}
	
	@Then("Enter Customer3 Facility Name and check Customer checkbox")
	public void enter_Customer3_Facility_Name_and_check_Customer_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Cust3_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_CUST3_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityCustomer);
		
	}

	@Then("Enter Manufacturer Facility Name and check Manufacturer checkbox")
	public void enter_Manufacturer_Facility_Name_and_check_Manufacturer_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Manufacturer_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_MANUFACTURER_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityManufacturer);
		
	}

	@Then("Enter Sub Contractor Facility Name and check Sub Contractor checkbox")
	public void enter_Sub_Contractor_Facility_Name_and_check_Sub_Contractor_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Subcontractor_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_SUBCONTRACTOR_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilitySubContractor);
		
	}

	@Then("Enter Lab1 Facility Name and check Customer checkbox")
	public void enter_Lab1_Facility_Name_and_check_Customer_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Lab1_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_LAB1_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityLab);
		
	}

	@Then("Enter Lab2 Facility Name and check Customer checkbox")
	public void enter_Lab2_Facility_Name_and_check_Customer_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Lab2_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_LAB2_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityLab);
		
	}

	@Then("Enter Lab3 Facility Name and check Customer checkbox")
	public void enter_Lab3_Facility_Name_and_check_Customer_checkbox() {
		CommonMethods.waitForVisib(addFacilityWindowElements.facilityName);
		FacilityName = "Facility_Lab3_"+CommonMethods.getDateAsString();
		CommonMethods.sendKeys(addFacilityWindowElements.facilityName, FacilityName);
				
		ExcelUtility.writeToExcel(Constants.TESTDATA_FILEPATH, "TestExel", Constants.FACILITY_LAB3_CELL, 1, FacilityName);
		
		CommonMethods.click(addFacilityWindowElements.facilityLab);
		
	}

}


	


