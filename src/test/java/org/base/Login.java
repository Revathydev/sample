package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
	public Login() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtUsername;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(id="login")
	private WebElement logIn;
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	

}
