package pageObject;

import org.openqa.selenium.By;

public class abstractPage {
	public static final By singIn = By.cssSelector("button[id= 'accountInfo' i]");
	public static final By singInfield = By.cssSelector("input[name='loginemail' i]");
	public static final By password = By.cssSelector("input[name='loginpassword' i]");
	public static final By loginButton = By.cssSelector("button[type='submit' i]");
	
	
	

}
