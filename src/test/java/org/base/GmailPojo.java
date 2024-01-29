package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass{
	public GmailPojo() {
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath = "//input[@name='identifier']")
	private WebElement e;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement n;

	public WebElement getE() {
		return e;
	}

	public WebElement getN() {
		return n;
	}
	
	
}
