package com.pagesobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPages   {
 public  WebDriver driver;
 public  amazonPages(WebDriver driver) {
	 
   this.driver = driver;
   PageFactory.initElements(driver, this);
   
}
  @FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")


   WebElement  signingBtn;

   public void getsinging() {
	signingBtn.click();
}
 @FindBy(xpath=("//a[@id='createAccountSubmit']"))
		 WebElement  submit;
       
     public void getsubmit() {
	   submit.click();
 }
 @FindBy(xpath=("//input[@id='ap_customer_name']"))
 WebElement entername;
 public void getname(String name ) {
	 entername.sendKeys(name);
 }

 @FindBy(xpath=("//input[@id='ap_email']"))
 WebElement  enteremail;
 public void getemailbx(String email) {
	 enteremail.sendKeys(email);
 }
 @FindBy(xpath=("//input[@id='ap_password']"))
 WebElement passwordbx;
 public void getpassword(String password) {
	 passwordbx.sendKeys(password);
 }
 @FindBy(xpath=("//input[@id='ap_password_check']"))
 WebElement  repasswordbx;
 public void getrepassword(String repass){
	 repasswordbx.sendKeys(repass);
 }
 
 @FindBy(xpath=("//input[@id='continue']"))
 WebElement  ContinueBtn ;
 public void getContinue() {
	 ContinueBtn.click();
 }
 
}
