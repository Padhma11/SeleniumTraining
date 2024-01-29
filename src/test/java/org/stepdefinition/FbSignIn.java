package org.stepdefinition;

import org.base.BaseClass;
import org.base.SignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbSignIn extends BaseClass {
	SignInPojo s;

	@Given("Launch the chrome browser and maximise the window")
	public void launch_the_chrome_browser_and_maximise_the_window() {
		launchBrowser();
		windowMax();
	}

	@When("Hit the facebook Url")
	public void hit_the_facebook_Url() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("Click on the create new account button")
	public void click_on_the_create_new_account_button() {
		s = new SignInPojo();
		clickBtn(s.getCreateNewAcc());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box() throws InterruptedException {
		Thread.sleep(3000);
		s = new SignInPojo();
		passText("Padhma", s.getFirstnameTxtBox());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		s = new SignInPojo();
		passText("Vinodhini", s.getLastnameTxtBox());
	}

	@When("To email in email field")
	public void to_email_in_email_field() {
		s = new SignInPojo();
		passText("pv1996@gmail.com", s.getEmailTxtBox());
	}

	@When("To password in passsword field")
	public void to_password_in_passsword_field() {
		s = new SignInPojo();
		passText("PV@1996", s.getPasswdTxtBox());
	}

	@Then("Close the browser")
	public void close_the_browser() {
		//closeBrowser();
	}

}
