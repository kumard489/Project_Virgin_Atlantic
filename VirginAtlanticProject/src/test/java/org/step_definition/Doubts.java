package org.step_definition;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

public class Doubts extends BaseClass{
	
	
	
	
	public static void main(String arg[]) {
		
		launchChrome();
		chromeObject();
		winMax();
		launchUrl("https://www.virginatlantic.com/in/en");
		implicitWaiting();
		
		JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
		jfc.getFrom().click();
		jfc.getFullAirportList().click();
		jfc.getAlphabetically().click();
		List<WebElement> airportsAlphabetically = jfc.getAirportsAlphabetically();
		for (int i = 0; i < airportsAlphabetically.size(); i++) {
			System.out.println(airportsAlphabetically.get(i).getText());
		}
	}

}
