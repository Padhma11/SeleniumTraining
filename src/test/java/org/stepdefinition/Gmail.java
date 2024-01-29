package org.stepdefinition;

import org.base.BaseClass;
import org.base.GmailPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmail extends BaseClass {
	
	GmailPojo g;

	@Given("User has to launch the browser and maximise the browser")
	public void user_has_to_launch_the_browser_and_maximise_the_browser() {
		launchBrowser();
		windowMax();
	}

	@When("User has to launch the gmail url")
	public void user_has_to_launch_the_gmail_url() {
		launchUrl("https:\\www.gmail.com");
	}

	@When("User has to pass email address {string} in email field")
	public void user_has_to_pass_email_address_in_email_field(String em) {
		g = new GmailPojo();
		passText(em, g.getE());
	}

	@When("User has to click next button")
	public void user_has_to_click_next_button() {
		clickBtn(g.getN());

	}

	@Then("User has to close the entire browser")
	public void user_has_to_close_the_entire_browser() {
		closeBrowser();
	}

}
