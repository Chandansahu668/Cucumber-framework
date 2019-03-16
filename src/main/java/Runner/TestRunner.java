package Runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Generalfunction.generalFunction;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/main/java/features"}, //the path of the feature files
			glue={"stepDefination"},//the path of the step definition files
			format= {"pretty","html:test-Log","junit:Test-Report/cucumber.xml"},
			dryRun=false,
			plugin = { "com.cucumber.listener.ExtentCucumberFormatter:"}
			
			
			)

public class TestRunner {
		
//		WebDriver driver;
		@BeforeClass
		public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyyHHmmss");  
	    Date date = new Date();
	    String currentDate = formatter.format(date);
		new File(System.getProperty("user.dir")+"/testresults/"+currentDate).mkdir();
		extentProperties.setReportPath(System.getProperty("user.dir")+"/testresults/"+currentDate+"/report.html");
		}

		@AfterClass()
		 public static void writeExtentReport() {
		 Reporter.loadXMLConfig(new File(generalFunction.getReportConfigPath()));
		 Reporter.setSystemInfo("User Name", "Chandan");
	     Reporter.setSystemInfo("Time Zone","IST");
	     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	     Reporter.setSystemInfo("Selenium", "3.7.0");
	     Reporter.setSystemInfo("Maven", "3.5.2");
	     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	    
		}
	  
	 
		

}
