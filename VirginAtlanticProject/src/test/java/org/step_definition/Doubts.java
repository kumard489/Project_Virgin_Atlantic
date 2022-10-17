package org.step_definition;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.pojo_classes.JoinFlyingClubPojo;
import org.utilities.BaseClass;

public class Doubts extends BaseClass{
	
	
	
	
	public static void main(String arg[]) {
		
		launchChrome();
		chromeObject();
		winMax();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		launchUrl("https://flights.virginatlantic.com/en-in/flights-to-new-york");
		implicitWaiting();
		JoinFlyingClubPojo jfc=new JoinFlyingClubPojo();
		
		
     }
}
