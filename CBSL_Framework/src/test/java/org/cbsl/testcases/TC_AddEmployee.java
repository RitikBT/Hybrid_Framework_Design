package org.cbsl.testcases;

import org.apache.log4j.Logger;
import org.cbsl.pageObjects.pim.ContactDetailsPage;
import org.cbsl.pageObjects.pim.DependentPage;
import org.cbsl.pageObjects.pim.EmergencyContactsPage;
import org.cbsl.pageObjects.pim.PIMPage;
import org.cbsl.pageObjects.pim.PersonalDetailsPage;
import org.cbsl.utility.BaseClass;
import org.testng.annotations.Test;

public class TC_AddEmployee extends BaseClass {
	
	
	private DependentPage depPage;
	
	private  final Logger logger = Logger.getLogger(TC_AddEmployee.class);
	
	@Test
	public void testcase001_loginTest() throws Exception {
		
		pimPage= new PIMPage(utill);
		pimPage.navigateToPIM();
		pimPage.clickAddbtn();
		pimPage.setFirstName("Vikas");
		pimPage.setLastName("Singh");
		pimPage.setEmpID();
		pimPage.clickSavebtn();
		
		personalDetails =new  PersonalDetailsPage(utill);
	//	personalDetails.clickEditbtn();
		personalDetails.enterLicenNumber("DL03 20180045666");
		personalDetails.enterLicenExpDate("2028-12-09");
		personalDetails.enterSSN_Number("000000012398");
		personalDetails.enterSIN_Number("09876580000");
		personalDetails.enterDOB("1995-03-26");
		personalDetails.selectGender('M');
		personalDetails.selChkBxSmoker('N');
		personalDetails.clickOnSavebtn();
		personalDetails.bloodType("AB-");
		//personalDetails.fileUpload();
		
		contactDetails=new ContactDetailsPage(utill);
		contactDetails.navigateToContactDetailPage();
		contactDetails.contactDetailsFields();
		//contactDetails.uploadFile();
		
		emgContact=new EmergencyContactsPage(utill);
		emgContact.navigateToEmergencyContact();
		emgContact.addEmergencyContacts();
		
		depPage=new DependentPage(utill);
		depPage.naviagteToDependent();
		depPage.addDependentField();
		
		
		logger.info("Personal Details has been filled");
		
	}
	
	@Test
	public void testcase002_Test() {
		pimPage= new PIMPage(utill);
		pimPage.navigateToPIM();
		pimPage.clickAddbtn();
		pimPage.setFirstName("Vikas");
		pimPage.setLastName("Singh");
		pimPage.setEmpID();
		pimPage.clickSavebtn();
		
		personalDetails =new  PersonalDetailsPage(utill);
		personalDetails.clickEditbtn();
		personalDetails.enterLicenNumber("DL03 20180045666");
		personalDetails.enterLicenExpDate("2028-12-09");
		personalDetails.enterSSN_Number("000000012398");
		personalDetails.enterSIN_Number("09876580000");
		personalDetails.enterDOB("1995-03-26");
		personalDetails.selectGender('M');
		personalDetails.selChkBxSmoker('N');
		personalDetails.clickOnSavebtn();
		personalDetails.bloodType("AB-");	
	}

}
