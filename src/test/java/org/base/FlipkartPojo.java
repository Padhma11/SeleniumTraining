package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass{
	public FlipkartPojo() {
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement phone;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPhone() {
		return phone;
	}
	
}
