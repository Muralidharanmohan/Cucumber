package Org.step;


import Org.Base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	public void openBrowser() {
		browserConfigChrome();
		openUrl("https://www.facebook.com");
		maximizeWindow();
	}
	@After
	public void closeBrowser() {
	    driver.close();

	}
	

}
