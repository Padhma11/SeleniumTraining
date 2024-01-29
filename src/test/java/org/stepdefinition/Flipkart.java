package org.stepdefinition;

import org.base.BaseClass;
import org.base.FlipkartPojo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart extends BaseClass {
	FlipkartPojo fp;
	@Given("To launch the chrome browser")
	public void to_launch_the_chrome_browser() {
		launchBrowser();
	}

	@When("To launch the Url of the flipkart application")
	public void to_launch_the_Url_of_the_flipkart_application() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("Click on the Login button")
	public void click_on_the_Login_button() {
		fp = new FlipkartPojo();
		clickBtn(fp.getLogin());
		
	}

	@When("To pass valid phone number in phone number field")
	public void to_pass_valid_phone_number_in_phone_number_field() throws InterruptedException {
		fp = new FlipkartPojo();
		passText("0938393020", fp.getPhone());
	}

	@Then("To end the browser")
	public void to_end_the_browser() {
		closeBrowser();
	}

}
