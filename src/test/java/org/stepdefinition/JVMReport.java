package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class JVMReport {

	public static void generateJvmReport(String jsonfile) {
		
		Configuration con = new Configuration(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports"),"FacebookAutomation");
	
		con.addClassifications("Appname", "Facebook");
		con.addClassifications("platform", "windows");
		
		List <String>li = new ArrayList<String>();
		li.add(jsonfile);
		
		ReportBuilder build = new ReportBuilder(li, con);
		build.generateReports();
		
	}
	
}
