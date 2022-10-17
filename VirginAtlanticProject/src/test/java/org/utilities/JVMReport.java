package org.utilities;

import java.awt.geom.FlatteningPathIterator;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	
	public static void JVMReport(String jsonPath) {
		
		File f=new File(System.getProperty("user.dir")+"\\target\\Report\\JVMReports");
		
		Configuration cfgn=new Configuration(f, "Project Virgin Atlantic");
		
		cfgn.addClassifications("Bowser Name", "Chrome");
		cfgn.addClassifications("Bowser Version", "106");
		cfgn.addClassifications("Platform Name", "Windows 10");
		
		List<String> li=new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder rb=new ReportBuilder(li, cfgn);
		rb.generateReports();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
