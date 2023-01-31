package org.cbsl.pageObjects.pim;

import org.cbsl.utility.WebUtill;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMPage {
	
	@FindBy(xpath = "//ul[@class='oxd-main-menu']//span[text()='PIM']") private WebElement linkPIM;
	@FindBy(xpath = "//div[@class='orangehrm-header-container']//i") private WebElement btnAdd;
	@FindBy(xpath = "//input[@name='firstName']") private WebElement txtFirstName;
	@FindBy(xpath = "//input[@name='lastName']") private WebElement txtLastName;
	@FindBy(xpath = "//button[@type='submit']") private WebElement btnSave;
	@FindBy(xpath= "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']") private WebElement employeeID;
	
	WebUtill utill;
	
	public PIMPage(WebUtill utill) {
		this.utill=utill;
		PageFactory.initElements(utill.getDriver(), this);
	}
	 
	public void navigateToPIM() {
		utill.click(linkPIM);
	}
	public String setEmpID() {
	return	utill.getText(employeeID);
	}
	
	public void clickAddbtn() {
	utill.click(btnAdd);	
	}
	
	public void setFirstName(String firstName) {
		utill.setTextBoxValue(txtFirstName, firstName);
	}
	public void setLastName(String lastName) {
		utill.setTextBoxValue(txtLastName, lastName);
	}
	public void clickSavebtn() {
		utill.click(btnSave);
	}
	
	

}
