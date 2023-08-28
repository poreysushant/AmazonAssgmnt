package com.amazon.qa.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.util.UtilityClass;

public class AmazonProductPage2 
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtextbox2;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submitbtn2;
	@FindBy(xpath="//span[text()='Apple iPhone 14 Pro Max (256 GB) - Space Black']")private WebElement AppleMobile;
	@FindBy(xpath="//*[@id=\"submit.add-to-cart\"]/descendant::input")private WebElement addToCartbtn2;
	@FindBy(xpath="//input[@class=\"a-button-input\" and @aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")private WebElement Cartbtn2;
	@FindBy(xpath="//a[@id='nav-link-accountList']")private WebElement signOutbuttonA1;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutbuttonA2;
	
	
	public AmazonProductPage2 (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 public void EnterSearchTextbox2() throws EncryptedDocumentException, IOException
     {
		 searchtextbox2.sendKeys(UtilityClass.readDataFromExcel(1, 0));
     }
	 
	 public void clickOnsubmitbtn2()
     {
		 submitbtn2.click();
     }
     
	 public void clickonAppleMobile(WebDriver driver)
     { 
    	 UtilityClass.JavaScriptExcutor(driver,AppleMobile);
    	 AppleMobile.click();
     }
	 
	 public void clickOnaddToCartbtn2(WebDriver driver) throws InterruptedException
     {
		 UtilityClass.JavaScriptExcutor(driver,addToCartbtn2); 
		 Thread.sleep(1000);
		 addToCartbtn2.click();
     } 
	 public void clickCartbtn2(WebDriver driver) throws InterruptedException
     {

    	 Cartbtn2.click();
     }
	  
}
