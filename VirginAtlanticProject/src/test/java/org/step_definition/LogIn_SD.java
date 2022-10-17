package org.step_definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class LogIn_SD extends BaseClass{
	
	JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
	
	@When("user clicks the login link and it will navigate to login page")
	public void user_clicks_the_login_link_and_it_will_navigate_to_login_page() {
		implicitWaiting();
	    jfc.getLogIn().click();
	}

	@When("user fills valid username and valid password in respective textbox")
	public void user_fills_valid_username_and_valid_password_in_respective_textbox(DataTable d) {
		implicitWaiting();
		List<Map<String, String>> am = d.asMaps();
		String username = am.get(0).get("username");
		String password = am.get(0).get("password");
		jfc.getUserNameTxt().sendKeys(username);
		jfc.getPasswordTxt().sendKeys(password);
		
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		implicitWaiting();
		jfc.getLogInBtn().click();
	}

	@Then("verifying user should navigate to homepage")
	public void verifying_user_should_navigate_to_homepage() {
		implicitWaiting();
		Assert.assertTrue(jfc.getLoginMessage().getText().contains("ERROR_MSG_21"));
		closeBrowser();
	}

}
