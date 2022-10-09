package org.step_definition;

import java.awt.KeyEventPostProcessor;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class JoinFlyingClub_SD extends BaseClass{
	
	JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
	
	@Given("user opens the Browser and then launching the URL")
	public void user_opens_the_Browser_and_then_launching_the_URL() {
	   launchChrome();
	   chromeObject();
	   winMax();
	   launchUrl("https://www.virginatlantic.com/in/en");
	}

	@When("user clicks the JoinFlyingclub link on homepage and it will navigate to respective page")
	public void user_clicks_the_JoinFlyingclub_link_on_homepage_and_it_will_navigate_to_respective_page() {
	    implicitWaiting();
		jfc.getCookiesHomePage().click();
		jfc.getJoinFlyingClub().click();
	    Assert.assertTrue(jfc.getJoinFlyingClubLabel().getText().contains("About"));
	}

	@When("user clicks the PhoneCountryCode dropdown")
	public void user_clicks_the_PhoneCountryCode_dropdown() {
		implicitWaiting();
		jfc.getCookiesHomePage().click();
	    moveCursorActions(jfc.getPhoneCountryCode());
	    SingleClkActions(jfc.getPhoneCountryCode());
	}

	@Then("user should verify all the country codes are available in that dropdown")
	public void user_should_verify_all_the_country_codes_are_available_in_that_dropdown() {
		implicitWaiting();
		Select slt=new Select(jfc.getPhoneCountryCode());
	    List<WebElement> countryCodes = slt.getOptions();
	    
	    for (int i = 0; i <countryCodes.size(); i++) {
	    	System.out.println(getData(1, i+1, 3)+"="+countryCodes.get(i).getText());
	    	keyPrsAndrlseRobot(KeyEvent.VK_DOWN);
	    	Assert.assertEquals(getData(1, i+1, 3), countryCodes.get(i).getText());
		}
	}

	@Then("user should verify the createMyAccount button is disable")
	public void user_should_verify_the_createMyAccount_button_is_disable() {
		implicitWaiting();
		jsScroll(jfc.getAcceptAndCreateAccountlabel());
		Assert.assertFalse(jfc.getCreateMyAccount().isEnabled());
		closeBrowser();
	}
	
	
	
	
	
	
	
	

}
