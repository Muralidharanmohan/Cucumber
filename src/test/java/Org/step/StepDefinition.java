package Org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import Org.Base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class StepDefinition extends BaseClass {

	@Given("Verify the user is on Facebook page.")
	public void verify_the_user_is_on_Facebook_page() {
	  
	}

	@When("User enters valid username and invalid password.")
	public void user_enters_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
	
		WebElement txtemail = driver.findElement(By.id("email"));
		  List<Map<String, String>> listemail = dataTable.asMaps();
		  String string = listemail.get(2).get("username");
	      txtemail.sendKeys(string);
		  
		  WebElement txtpass = driver.findElement(By.id("pass"));
		  List<Map<String, String>> listpass = dataTable.asMaps();
		  String string1 = listpass.get(2).get("password");
		  txtpass.sendKeys(string1);
		  
	}

	@When("user click the login button.")
	public void user_click_the_login_button() {
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();


	}

	@Then("Error page for invalid password is displayed.")
	public void error_page_for_invalid_password_is_displayed() {
		
	    System.out.println("facebook error page is displayed");
	}

}
