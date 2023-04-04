package testBase;

import pages.AddAccreditationWindowElements;
import pages.AddAssetWindowElements;
import pages.AddContactWindowElements;
import pages.AddPartWindowElements;
import pages.AddProcedureWindowElements;
import pages.AddTemplateWindowElements;
import pages.AddTypeWindowElements;
import pages.AttachDataSheetElements;
import pages.CategoryWindowElements;
import pages.ConsoleMenuMetTeamElements;
import pages.EditWorkOrderElements;
import pages.FindFacilityWindowElements;
import pages.FindScreenWindowElements;
import pages.FindTypeWindowElements;
import pages.FindUserWindowElements;
import pages.Frames;
import pages.LoginPageElements;
import pages.MaintenanceSubMenuElements;
import pages.SetupSubMenuElements;


public class PageInitializer extends BaseClass {

	protected static LoginPageElements loginPageElements;
	protected static Frames frames;
	protected static ConsoleMenuMetTeamElements concoleMenuMetTeamElements;
	protected static MaintenanceSubMenuElements maintenanceSubMenuElements;
	protected static FindScreenWindowElements findScreenWindowElements;
	protected static AddAssetWindowElements addAssetWindowElements;
	protected static FindTypeWindowElements findTypeWindowElements;
	protected static EditWorkOrderElements editWorkOrderElements;
	protected static AddProcedureWindowElements addProcedureWindowElements;
	protected static AttachDataSheetElements attachDataSheetElements;
	protected static CategoryWindowElements categoryWindowElements;
	protected static AddTypeWindowElements addTypeWindowElements;
	protected static FindFacilityWindowElements findFacilityWindowElements;
	protected static AddPartWindowElements addPartWindowElements;
	protected static FindUserWindowElements findUserWindowElements;
	protected static AddAccreditationWindowElements addAccreditationWindowElements;
	protected static AddTemplateWindowElements addTemplateWindowElements;
	protected static SetupSubMenuElements setupSubMenuElements;
	protected static AddContactWindowElements addContactWindowElements;
	public static void initializePageObjects() {
		findScreenWindowElements = new FindScreenWindowElements();
		loginPageElements = new LoginPageElements();
		frames = new Frames();
		concoleMenuMetTeamElements = new ConsoleMenuMetTeamElements();
		maintenanceSubMenuElements = new MaintenanceSubMenuElements();
		addAssetWindowElements = new AddAssetWindowElements();
		findTypeWindowElements = new FindTypeWindowElements();
		editWorkOrderElements = new EditWorkOrderElements();
		addProcedureWindowElements = new AddProcedureWindowElements();
		attachDataSheetElements = new AttachDataSheetElements();
		categoryWindowElements = new CategoryWindowElements();
		addTypeWindowElements = new AddTypeWindowElements();
		findFacilityWindowElements = new FindFacilityWindowElements();
		addPartWindowElements = new AddPartWindowElements();
		findUserWindowElements = new FindUserWindowElements();
		addAccreditationWindowElements = new AddAccreditationWindowElements();
		addTemplateWindowElements = new AddTemplateWindowElements();
		setupSubMenuElements = new SetupSubMenuElements();
		addContactWindowElements = new AddContactWindowElements();
			
	}
}
