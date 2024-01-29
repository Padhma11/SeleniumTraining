package org.stepdefinition;

import org.base.BaseClass;
import org.base.Pojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	Pojo p ;
	
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMax();
	}

	@When("To launch the Url of the facebook application")
	public void to_launch_the_Url_of_the_facebook_application() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		p = new Pojo();
		passText("amy@gmail.com", p.getVarRef());
	    
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
	    p = new Pojo();
	    passText(" ", p.getPass());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   p = new Pojo();
	   clickBtn(p.getLogin());
	}

	@When("To check whether navigate to home page or not")
	public void to_check_whether_navigate_to_home_page_or_not() {
	   System.out.println("Navigated to home page");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   closeBrowser();
	}
	
	@Given("User has to launch the browser and maximise the window")
	public void user_has_to_launch_the_browser_and_maximise_the_window() {
	   launchBrowser();
	   windowMax();
	}

	@When("User has to hit the facebook url")
	public void user_has_to_hit_the_facebook_url() {
	   launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		p = new Pojo();
		passText(em, p.getVarRef());
	}

	@When("User has to pass the data {string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String pass) {
	    p = new Pojo();
	    passText(pass, p.getPass());
	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
	    p = new Pojo();
	    clickBtn(p.getLogin());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	   closeBrowser();
	}



}
