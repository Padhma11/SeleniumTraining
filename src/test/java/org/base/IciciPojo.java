 package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IciciPojo extends BaseClass{
	
	public IciciPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath = "//img[@onclick='goUserId();']")
	private WebElement useridarr;
	
	@FindBy(xpath = "//input[@title='User Id']")
	private WebElement userid;

	@FindBy(xpath = "//input[@title='Password']")
	private WebElement passwd;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='ICICI Bank Home']")
	private WebElement home;

	public WebElement getUseridarr() {
		return useridarr;
	}

	public WebElement getUserid() {
		return userid;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public WebElement getHome() {
		return home;
	}
	
	
}
