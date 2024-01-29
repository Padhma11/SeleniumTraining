package org.stepdefinition;

import org.base.BaseClass;
import org.base.IciciPojo;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class IciciHooks extends BaseClass {

	@Before
	private void precondition() {
		launchBrowser();
		windowMax();
	}
	
	@After
	private void postcondition() {
//		closeBrowser();
		System.out.println("Close the browser");
	}
}
