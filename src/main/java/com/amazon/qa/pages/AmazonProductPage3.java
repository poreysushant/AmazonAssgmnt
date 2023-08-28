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
	@FindBy(xpath="//span[@class=\"a-color-state a-text-bold\"]")private WebElement textasertR3;

	@FindBy(xpath="//span[text()='Redmi Note 12 Pro+ 5G (Obsidian Black, 8GB RAM, 256GB Storage)']")private WebElement RedmeMobile;
	@FindBy(xpath="//div[@id=\"apex_desktop\"]//descendant::span[@data-a-size=\"xl\"]")
	private WebElement price3;
	@FindBy(xpath="//input[@id='add-to-cart-button']")private WebElement addToCartbtn3;
	@FindBy(xpath="//input[@class=\"a-button-input\" and @aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")private WebElement Cartbtn3;
	@FindBy(xpath="//span[@class=\"a-button-text a-declarative\"]")private WebElement btn_qnty3;
	@FindBy(xpath="//span[@class=\"a-truncate-full a-offscreen\"]//following-sibling::span")private WebElement txt_name3;
	@FindBy(xpath="//div[@class=\"sc-badge-price-to-pay\"]//descendant::span")private WebElement txt_price3;

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
	 public String gettextasertR3()
     {
       	String actR3=textasertR3.getText();
    	 return actR3;
     }
     
	 public void clickonRedmeMobile(WebDriver driver)
     { 
    	 UtilityClass.JavaScriptExcutor(driver,RedmeMobile);
    	 RedmeMobile.click();
     }
	 
	 public String getpriceasert3()
     {

    	String actRP3=price3.getText();
    	 return actRP3;
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
	 public String verifyQuantity3()
     {
   	  String act=btn_qnty3.getText();
   	  return act;
     }
	 
	   public String verifyName3()
	      {
	    	  String act=txt_name3.getText();
	    	  return act;
	      }
	   public String verifyPrice3()
	      {
	    	  String act=txt_price3.getText();
	    	  
	    	  return act;
	      }
}
