package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends BaseClass{
	public Booking() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fName;
	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement ccExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ccExpYr;
	@FindBy(id="cc_cvv")
	private WebElement cvvNum;
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getFirstName() {
		return fName;
	}
	public WebElement getLastName() {
		return lName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNumber() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpiryMonth() {
		return ccExpMonth;
	}
	public WebElement getCcExpiryYear() {
		return ccExpYr;
	}
	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return book;
	}

}
