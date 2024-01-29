package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass {
	public SignInPojo() {
		PageFactory.initElements(d, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;

	@FindBy(xpath = "(//input[@type ='text'])[2]")
	private WebElement firstnameTxtBox;

	@FindBy(name = "lastname")
	private WebElement lastnameTxtBox;

	@FindBy(name = "reg_email__")
	private WebElement emailTxtBox;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement passwdTxtBox;

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstnameTxtBox() {
		return firstnameTxtBox;
	}

	public WebElement getLastnameTxtBox() {
		return lastnameTxtBox;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPasswdTxtBox() {
		return passwdTxtBox;
	}

}
