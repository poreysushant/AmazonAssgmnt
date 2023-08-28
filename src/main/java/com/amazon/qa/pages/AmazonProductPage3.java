package com.amazon.qa.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.qa.util.UtilityClass;

public class AmazonProductPage3
{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtextbox3;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submitbtn3;
	@FindBy(xpath="//span[text()='Redmi Note 12 Pro+ 5G (Obsidian Black, 8GB RAM, 256GB Storage)']")private WebElement RedmeMobile;
	@FindBy(xpath="//input[@id='add-to-cart-button']")private WebElement addToCartbtn3;
	@FindBy(xpath="//input[@class=\"a-button-input\" and @aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")private WebElement Cartbtn3;
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement signOutbuttonR1;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutbuttonR2;
	
	
	public AmazonProductPage3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	 public void EnterSearchTextbox3() throws EncryptedDocumentException, IOException
     {
		 searchtextbox3.sendKeys(UtilityClass.readDataFromExcel(2, 0));
     }
	 
	 public void clickOnsubmitbtn3()
     {
		 submitbtn3.click();
     }
     
	 public void clickonRedmeMobile(WebDriver driver)
     { 
    	 UtilityClass.JavaScriptExcutor(driver,RedmeMobile);
    	 RedmeMobile.click();
     }
	 
	 public void clickOnaddToCartbtn3(WebDriver driver) throws InterruptedException
     {
		 UtilityClass.JavaScriptExcutor(driver,addToCartbtn3); 
		 addToCartbtn3.click();
     } 
	 public void clickCartbtn3(WebDriver driver) throws InterruptedException
     {
    	 Cartbtn3.click();
     }
	 
}
