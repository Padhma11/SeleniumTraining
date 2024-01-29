package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	
	public Pojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindAll({@FindBy(xpath = "//input[@name='email']"),
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//button[@placeholder='Email address or phone number']")})
	private WebElement varRef;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;

	public WebElement getVarRef() {
		return varRef;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	

}
