package com.training.base;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.utilities.CommonUtilities;

public class BasePage {

	WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	String expectedusername;
	String expectedloginErrMsg;
	CommonUtilities common = new CommonUtilities();

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void addObject(String logicalName, By by) {
		ObjRep.put(logicalName, by);

	}

	public void enterIntoTextBox(String logicalName, String InputData) {
		WebElement element = getWebElement(logicalName);
		enterIntoTextBox(element, InputData);

	}

	public void clickCheckBox(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickCheckBox(element);

	}

	public void clickonButton(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickonButton(element);

	}

	public void clickUserMenu(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickUserMenu(element);

	}

	public void validUserName(String logicalName) {
		WebElement element = getWebElement(logicalName);
		validUserName(element);
	}

	public void clickForgotPassword(String logicalName) {
		WebElement element = getWebElement(logicalName);
		clickForgotPassword(element);
	}

	public void loginErrorMessage(String logicalName) {
		WebElement element = getWebElement(logicalName);
		loginErrorMessage(element);

	}

	public void opportunitiesDropDown(String logicalName) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = getWebElement(logicalName);
		opportunitiesDropDown(element);
		
	}


	

	/*-------------------------------------------------------------*/

	private void enterIntoTextBox(WebElement element, String inputData) {
		waitforElement(element);
		element.sendKeys(inputData);

	}

	private void waitforElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	private void clickonButton(WebElement element) {
		waitforElement(element);
		element.click();

	}

	private void clickCheckBox(WebElement element) {
		waitforElement(element);
		element.click();

	}

	private void clickUserMenu(WebElement element) {
		waitforElement(element);
		element.click();

	}

	private void validUserName(WebElement element) {
		waitforElement(element);
		String actual = element.getText();
		try {
			expectedusername = common.getproperty("expectedusername");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(actual, expectedusername);
	}

	private void clickForgotPassword(WebElement element) {
		waitforElement(element);
		element.click();

	}

	private void loginErrorMessage(WebElement element) {
		waitforElement(element);
		try {
			// Thread.sleep(2000);
			String actualloginErrMsg = element.getText();
			expectedloginErrMsg = common.getproperty("expectedloginErrMsg");
			assertEquals(actualloginErrMsg, expectedloginErrMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void opportunitiesDropDown(WebElement element) {
	//	waitforElement(element);
		
		try {
			//Thread.sleep(2000);
			waitforElement(element);
			String actualOppDropDown = element.getText();
			String expectedOppDropDown = common.getproperty("expectedOppDropDown");
			assertEquals(actualOppDropDown, expectedOppDropDown);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private WebElement getWebElement(String logicalName) {
		By by = ObjRep.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
	}

}
