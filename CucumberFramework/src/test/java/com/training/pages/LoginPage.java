package com.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.training.base.BasePage;
import com.training.base.BaseTest;

public class LoginPage extends BasePage{
	
	static WebDriver driver;
	
	public LoginPage() {
		super(driver=BaseTest.getDriver());
	//Method which accepts String , By byobj 
	addObject("Username", By.id("username"));
	addObject("Password", By.id("password"));
	addObject("RememberMe", By.id("rememberUn"));
	addObject("Login", By.name("Login"));
	addObject("UserMenuDropDown", By.xpath("//span[@id='userNavLabel']"));
	addObject("Logout", By.xpath ("//a[@title='Logout']"));
	addObject("expectedusername",By.xpath("//span[@id='idcard-identity']"));
	addObject("Forgot password",By.xpath("//a[contains(text(),'Forgot Your Password')]"));
	//addObject("un",By.id("un"));
	addObject("un",By.xpath("//input[@id='un']"));
	addObject("Continue",By.xpath("//input[@id='continue']"));
	addObject("expextedErrorMessage",By.id("error"));
	addObject("Opportunities",By.xpath("//li[@id='Opportunity_Tab']"));
	addObject("expectedOppDropDown",By.xpath("//select[@id='fcf']"));
	addObject("New",By.xpath("//input[@title='New']"));
	addObject("Opportunities Name",By.id("opp3"));
	addObject("Account Name",By.id("opp4"));
	addObject("AccSearch",By.id("lksrch"));
	addObject("Go",By.xpath("//input[@name='go']"));
	addObject("AccNameLight",By.xpath("//tr[@class='dataRow even last first']/th/a"));
	addObject("CloseDate",By.id("opp9"));
	addObject("TodayDate",By.xpath("//a[@class='calToday']"));
	addObject("StageDropDown",By.xpath("//select[@id='opp11']"));
	addObject("Probability",By.xpath("//input[@id='opp12']"));
	addObject("Lead Source",By.xpath("//select[@id='opp6']"));
	addObject("Primary Campaign Source",By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']"));
	addObject("Save",By.xpath("//input[@title='Save']"));
}
}
