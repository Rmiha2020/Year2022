package com.stepdefinition;

//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.amazonSearchBase;
import com.pagesobjectmodel.amazonPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazonSearchStep  extends amazonSearchBase{
	
	amazonPages page;
	
	@Given("user  on Amazon homepage")
	public void user_on_amazon_homepage() {
	
	getDriver();
	
	
	page = PageFactory.initElements(driver, amazonPages.class);
	}

	@When("user clicks on  Hello  Sign In button")
	public void user_clicks_on_hello_sign_in_button() {
	page.getsinging();
	//driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
	
	}

	@When("user Clicks  on Create An Amazon Account button")
	public void user_clicks_on_create_an_amazon_account_button() {
	 page.getsubmit();
		// driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	}

	@When("user enter {string}")
	public void user_enter(String name) {
	    page.getname(name);
	    //driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(name);
	}

	@When("user enters  email as {string}")
	public void user_enters_email_as(String email) {
	    page.getemailbx(email);
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
	    
	}

	@When("user enters  password as {string}")
	public void user_enters_password_as(String password) {
	    page.getpassword(password);
	    //driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
	}

	@When("user enters repaswword as  {string}")
	public void user_enters_repaswword_as(String repass) {
	    page.getrepassword(repass);
	    //driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys(repass);
	}

	@When("user clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    page.getContinue();
	    //driver.findElement(By.xpath("//input[@id='continue']")).click();
	}

	@Then("user verifies the error message")
	public void user_verifies_the_error_message() {
	   Assert.assertEquals(driver.getTitle(),"Authentication required"); 
	  getClose();  
	}

}
