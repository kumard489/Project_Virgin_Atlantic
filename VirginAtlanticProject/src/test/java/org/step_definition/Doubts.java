package org.step_definition;

import org.junit.Assert;
import org.junit.Test;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

public class Doubts extends BaseClass{
	
	
	
	
	public static void main(String arg[]) {
		
		launchChrome();
		chromeObject();
		winMax();
		launchUrl("https://www.virginatlantic.com/in/en");
		implicitWaiting();
		
		JoinFlyingClubPojo jfc =new JoinFlyingClubPojo();
		jfc.getCookiesHomePage().click();
		jfc.getMyBooking().click();
		Assert.assertTrue(jfc.getMyBookingLabel().getText().contains("Find"));
		closeBrowser();
		
	}

}
