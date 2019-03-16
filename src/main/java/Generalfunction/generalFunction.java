package Generalfunction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import cucumber.api.Scenario;

public class generalFunction {


@SuppressWarnings("unused")
public static String getReportConfigPath(){
 String reportConfigPath = "C:/Users/Chandan/eclipse-workspace/FreeCrmBDDFramework/extent-config.xml";
 if(reportConfigPath!= null) return reportConfigPath;
 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
}
//Take screenshot after failed scenario(Can make for pass scenario)
public static void afterfailedScenario(Scenario scenario,WebDriver driver) {
	System.out.println("After Scenario");
	 if (scenario.isFailed()) {
	 String screenshotName = scenario.getName().replaceAll(" ", "_");
	 try {
	 //This takes a screenshot from the driver at save it to the specified location
	 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
	 //Building up the destination path for the screenshot to save
	 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
	 File destinationPath = new File(System.getProperty("user.dir") + "/testresults/screenshots/" + screenshotName+"_failed.png");
	 
	 //Copy taken screenshot from source location to destination location
	 Files.copy(sourcePath, destinationPath);   
	 
	 //This attach the specified screenshot to the test
	 Reporter.addScreenCaptureFromPath(destinationPath.toString());
	 System.out.println("Screenshot taken");
	 } catch (IOException e) {
	 }
		
	 }
	 }

}
