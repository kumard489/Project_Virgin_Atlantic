package org.pojo_classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPojo extends DestinationsAndOnBoardPojo {

	public LogInPojo() {
		PageFactory.initElements(driver, this);
	}

	// Setters
	@FindBy(xpath = "//input[@id='userId']")
	private WebElement userNameTxt;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lastNameLogInTxt;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordTxt;

	@FindBy(xpath = "//label[text()='Remember me']")
	private WebElement rememberMe;

	@FindBy(xpath = "//button[text()=' Log in ']")
	private WebElement logInBtn;

	@FindBy(xpath = "//a[text()=' Forgot password? ']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//a[text()=' Forgot Flying Club number? ']")
	private WebElement forgotFlyingClubNumber;

	@FindBy(xpath = "//a[@href='/profile/enrolllanding.action']")
	private WebElement joinFlyingClub;

	@FindBy(xpath = "//h1[@class='px-5 d-flex align-items-end loginHeaderText']")
	private WebElement logInLabel;

	// Getters
	public WebElement getUserNameTxt() {
		return userNameTxt;
	}

	public WebElement getLastNameLogInTxt() {
		return lastNameLogInTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getRememberMe() {
		return rememberMe;
	}

	public WebElement getLogInBtn() {
		return logInBtn;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getForgotFlyingClubNumber() {
		return forgotFlyingClubNumber;
	}

	public WebElement getJoinFlyingClub() {
		return joinFlyingClub;
	}

	public WebElement getLogInLabel() {
		return logInLabel;
	}

}
