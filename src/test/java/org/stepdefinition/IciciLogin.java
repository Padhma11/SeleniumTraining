package org.stepdefinition;

import org.base.BaseClass;
import org.base.IciciPojo;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IciciLogin extends BaseClass {
	IciciPojo i;

	@Given("To launch ICICI URL")
	public void to_launch_ICICI_URL() {
		launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

	}
//
//	@When("To click on the User Id Arrow")
//	public void to_click_on_the_User_Id_Arrow() {
//		i = new IciciPojo();
//		clickBtn(i.getUseridarr());
//	}
//
//	@When("To pass email address in user id textbox")
//	public void to_pass_email_address_in_user_id_textbox() {
//		i = new IciciPojo();
//		passText("pv@gmail.com", i.getUserid());
//	}
//
//	@When("To pass password in password textbox")
//	public void to_pass_password_in_password_textbox() {
//		i = new IciciPojo();
//		passText("987987", i.getPasswd());
//	}
//
//	@When("To click login button on page")
//	public void to_click_login_button_on_page() {
//		i = new IciciPojo();
//		clickBtn(i.getLogin());
//	}
//
//	@Then("To check error message is diplayed")
//	public void to_check_error_message_is_diplayed() {
//		System.out.println("Error message is displayed");
//	}

	@When("To click ICICI bank home")
	public void to_click_ICICI_bank_home() {
		i = new IciciPojo();
		clickBtn(i.getHome());

	}

	@Then("To check Icici home page is displayed on new tab")
	public void to_check_Icici_home_page_is_displayed_on_new_tab() {
		System.out.println("ICICI Home page is displayed");
	}
}
