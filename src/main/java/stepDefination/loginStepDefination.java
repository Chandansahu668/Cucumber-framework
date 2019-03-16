package stepDefination;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import Generalfunction.generalFunction;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverUtil.webDriverUtill;
import junit.framework.Assert;
import pageObject.abstractPage;

public class loginStepDefination {

	WebDriver driver;
@After(order=0)
public void closingBrowser() {
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.quit();
}
@After(order=1)
public void afterScenario(Scenario scenario) {
	generalFunction.afterfailedScenario(scenario, driver);
}

//public void afterScenario(Scenario scenario) {
//	System.out.println("After Scenario");
//	 if (scenario.isFailed()) {
//	 String screenshotName = scenario.getName().replaceAll(" ", "_");
//	 try {
//	 //This takes a screenshot from the driver at save it to the specified location
//	 File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	 
//	 //Building up the destination path for the screenshot to save
//	 //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
//	 File destinationPath = new File(System.getProperty("user.dir") + "/testresults/screenshots/" + screenshotName+"_failed.png");
//	 
//	 //Copy taken screenshot from source location to destination location
//	 Files.copy(sourcePath, destinationPath);   
//	 
//	 //This attach the specified screenshot to the test
//	 Reporter.addScreenCaptureFromPath(destinationPath.toString());
//	 System.out.println("Screenshot taken");
//	 } catch (IOException e) {
//	 }
//		
//	 }
//	 }
//@After (order=0)
//public void copyTestResultToTestLog() {
//	SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyyHHmmss");  
//    Date date = new Date();
//    String currentDate = formatter.format(date);
//	new File(System.getProperty("user.dir")+"/testresults/"+currentDate).mkdir();
//	
//	File source = new File(System.getProperty("user.dir")+"/target/cucumber-reports/report.html");
//	File destination = new File(System.getProperty("user.dir")+"/testresults/"+currentDate+"/report.html");
//	try {
//		Files.copy(source, destination);
//		System.out.println("File copied");
//	} catch (IOException e) {
//		System.out.println(e);
//	}
//	
//}

@Given("^User in on Home Page\\.$")
public void user_in_on_Home_Page(){
	System.setProperty("webdriver.chrome.driver", "C:/Users/Chandan/Desktop/selenium/chromedriver.exe"); 
	driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.navigate().to("https://www.yankeecandle.com");

}

@When("^The Page Title is Yankee Candle\\.$")
public void the_Page_Title_is_Yankee_Candle() {
	String title = driver.getTitle();
	System.out.println(title);
	webDriverUtill.waitForPageLoad(driver,20);
	driver.navigate().refresh();
	Assert.assertEquals("Yankee Candle | Candles, Air Fresheners & Home Fragrance", title);
	
	
}

@Then("^User clicks on sign in link$")
public void user_clicks_on_sign_in_link() {
driver.findElement(abstractPage.singIn).click();
}

@Then("^User is on sign in page$")
public void user_is_on_sign_in_page() throws Throwable {
  webDriverUtill.waitForPageLoad(driver, 20);
  //driver.navigate().refresh();
  String url = driver.getCurrentUrl();
 Assert.assertEquals(true, url.contains("login"));
}

@Then("^User enter the \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enter_the_Username_and_Password(String Username,String Password) throws Throwable {
	webDriverUtill.waitForPageLoad(driver, 20);
	driver.findElement(abstractPage.singInfield).sendKeys(Username);
	driver.findElement(abstractPage.password).sendKeys(Password);
	
}

@Then("^click on Login button$")
public void click_on_Login_button() throws InterruptedException {
	
	driver.findElement(abstractPage.loginButton).click();
	webDriverUtill.waitForElementToInvisible(abstractPage.singInfield, driver, 10);
}

@Then("^User is get sign in\\.$")
public void user_is_get_sign_in(){
	//webDriverUtill.waitForPageLoad(driver, 20);
	 String url = driver.getCurrentUrl();
	 Assert.assertEquals(true, url.contains("myaccount"));
	
}





}


