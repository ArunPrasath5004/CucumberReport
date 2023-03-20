package org.stepdefinition;

import org.core.CommonMethods;
import org.junit.Assert;
import org.pages.Facebook_Login_Page;

import io.cucumber.java.en.*;

public class Login_Valid extends CommonMethods{
	Facebook_Login_Page login;
	
	@Given("User should be launch the URL")
	public void user_should_be_launch_the_url() {
		get("https://en-gb.facebook.com/");
	    
	}

	@Given("After that provide the valid {string} and {string}")
	public void after_that_provide_the_valid_and(String username, String password) throws InterruptedException {
		login=new Facebook_Login_Page();
		sendValues(login.username, username);
		sendValues(login.password, password);
		Thread.sleep(1000);
	   
	}

	@Given("click the login button")
	public void click_the_login_button() {
		clickBtn(login.loginBtn);
	   
	}

	@Then("User should be in home screen page")
	public void user_should_be_in_home_screen_page() {
	    Assert.assertEquals("Facebook", "s");
	}

}
