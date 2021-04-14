package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowser(String browsername) {
		switch(browsername) {
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Pjhoton Workspace\\Maven_adactin\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox": 
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\Desktop\\Pjhoton Workspace\\Maven_adactin\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
	}
	public static void launchUrl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
	}
	public static void fillTextBox(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement b) {
		b.click();
	}
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public static void close() {
		driver.quit();
	}
	public static String getAttribute(WebElement element) {
		return element.getAttribute("value");
	}
	public static void selectByIndex(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	

}
