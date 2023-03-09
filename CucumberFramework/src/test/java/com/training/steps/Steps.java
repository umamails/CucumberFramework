package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.training.base.BasePage;
import com.training.base.BaseTest;
import com.training.pageFactory.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest{
	
	
	PageFactory pageFactory = new PageFactory();
	BasePage page;
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		page=pageFactory.initialize(pageName);
	}
	@When("User enter into text box {string} {string}")
	public void user_enter_into_text_box(String logicalName, String InputData) {
		page.enterIntoTextBox(logicalName,InputData);
	}
	@Then("User Clicks on CheckBox {string}")
	public void user_clicks_on_check_box(String logicalName) {
	   page.clickCheckBox(logicalName);
	}
	@Then("User Clicks on Button {string}")
	public void user_clicks_on_button(String logicalName) {
	   page.clickonButton(logicalName);
	}
	@Then("User Clicks on UsermenuDropDown {string}")
	public void user_clicks_on_usermenu_drop_down(String logicalName) {
	   page.clickUserMenu(logicalName);
	}
	@Then("Validate Username text box diplaying with {string}")
	public void validate_username_text_box_diplaying_with(String logicalName) {
		 page.validUserName(logicalName);
	}
	@When("User Clicks on ForgotLink {string}")
	public void user_clicks_on_forgot_link(String logicalName) {
		page.clickForgotPassword(logicalName);
		
	}
	@Then("validate LoginErrorMessage {string}")
	public void validate_login_error_message(String logicalName) {
		page.loginErrorMessage(logicalName);
	}
	@Then("validate Opportunities dropdown {string}")
	public void validate_opportunities_dropdown(String logicalName) {
	   page.opportunitiesDropDown(logicalName);
	}
	@After
	public void teardown(Scenario scenario) {
		 byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.attach(screenshot, "image/png",scenario.getName()); 
			driver.close();
		driver = null;
	}
	
}
