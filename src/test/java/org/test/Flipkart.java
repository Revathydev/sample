package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart extends BaseClass {
public static <WebElements> void main(String[] args) {
     launchBrowser("Chrome");
     launchUrl("https://www.amazon.in/");
     WebElement src=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     src.sendKeys("iphone");
     WebElement clk=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
     clk.click();
     
     WebElement d=driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']"));
     
     List<WebElement> text= driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
     for(WebElement x:text) {
    	 System.out.println(x.getText());
     }
	}
	

}
