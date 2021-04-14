package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage extends BaseClass{
	public FinishPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="continue")
	private WebElement click;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	public WebElement getClick() {
		return click;
	}
	public WebElement getRadio() {
		return radio;
	}

}
