package ehospital.ADT_Module.TestScripts;

import org.testng.annotations.Test;

import ehospital.ADT_Module.helper.ExistingPatientHelper;
import ehospital.Billing_Module.helper.PreparationOfReceiptsHelper;
import in.nic.ehospial.generic.BaseClass;
import in.nic.ehospial.generic.Xls_Reader;

public class ExistingPatientTestScripts extends BaseClass{
	ExistingPatientHelper eph;
	ExistingPatientTestScripts ept;
	PreparationOfReceiptsHelper porh;
	
	
	
@Test(priority = 1,groups = {"Functional","Smoke"})
public void AdmitthePatient() throws InterruptedException {
eph = new ExistingPatientHelper(driver);
porh = new PreparationOfReceiptsHelper(driver);
ept = new ExistingPatientTestScripts();
delay();

ept.switchtoLeftFrame();
delay();
eph.SelectIPDModule();
ept.switchtoinnerRightFrame();
delay();
Xls_Reader reader = new Xls_Reader("./ExcelFile/OPD Data driven Frame Work.xlsx");

String ValidID = reader.getCellData("OPD", "UHID", 2);
delay();
eph.AdmitthePatient(ValidID);
ept.switchtoLeftFrame();
delay();
eph.SelectDuplicateAdmissionSliplink();
ept.switchtoinnerRightFrame();
delay();
String ValidUHID = reader.getCellData("OPD", "UHID", 2);
delay();
eph.EnterUHID(ValidUHID);
delay();
String AdmissionId = eph.getAdmissionId();
reader.setCellData("OPD", "IPNumber", 2, AdmissionId);
delay();
ept.switchtoLeftFrame();
eph.ClickonADTModule();






}
}
