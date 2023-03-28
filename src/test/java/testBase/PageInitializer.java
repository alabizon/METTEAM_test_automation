package testBase;

import pages.AddAssetWindowElements;
import pages.AddProcedureWindowElements;
import pages.AttachDataSheetElements;
import pages.ConsoleMenuMetTeamElements;
import pages.EditWorkOrderElements;
import pages.FindScreenWindowElements;
import pages.FindTypeWindowElements;
import pages.LoginPageElements;
import pages.MaintenanceSubMenuElements;


public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static ConsoleMenuMetTeamElements concoleMenuMetTeamElements;
	protected static MaintenanceSubMenuElements maintenanceSubMenuElements;
	protected static FindScreenWindowElements findScreenWindowElements;
	protected static AddAssetWindowElements addAssetWindowElements;
	protected static FindTypeWindowElements findTypeWindowElements;
	protected static EditWorkOrderElements editWorkOrderElements;
	protected static AddProcedureWindowElements addProcedureWindowElements;
	protected static AttachDataSheetElements attachDataSheetElements;
	public static void initializePageObjects() {
		findScreenWindowElements = new FindScreenWindowElements();
		loginPageElements = new LoginPageElements();	
		concoleMenuMetTeamElements = new ConsoleMenuMetTeamElements();
		maintenanceSubMenuElements = new MaintenanceSubMenuElements();
		addAssetWindowElements = new AddAssetWindowElements();
		findTypeWindowElements = new FindTypeWindowElements();
		editWorkOrderElements = new EditWorkOrderElements();
		addProcedureWindowElements = new AddProcedureWindowElements();
		attachDataSheetElements = new AttachDataSheetElements();
			
	}
}
