package com.amazon.qa.pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.util.UtilityClass;

public class AmazonProductPage1
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtextbox1;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submitbtn1;
	@FindBy(xpath="//span[@class=\"a-color-state a-text-bold\"]")private WebElement textasert;

	@FindBy(xpath="//span[text()='Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)']")
	private WebElement samsungmobile1;
	@FindBy(xpath="//div[@id=\"apex_desktop\"]//descendant::span[@data-a-size=\"xl\"]")
	private WebElement price;
	@FindBy(xpath="//*[@id='submit.add-to-cart']/child::span")private WebElement addToCartbtn;
	@FindBy(xpath="//input[@class=\"a-button-input\" and @aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")private WebElement Cartbtn;
	
	@FindBy(xpath="//span[@class=\"a-button-text a-declarative\"]")private WebElement btn_qnty;
	@FindBy(xpath="//span[@class=\"a-truncate-full a-offscreen\"]//following-sibling::span")private WebElement txt_name;
	@FindBy(xpath="//div[@class=\"sc-badge-price-to-pay\"]//descendant::span")private WebElement txt_price;


	public AmazonProductPage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	 public void EnterSearchTextbox1() throws EncryptedDocumentException, IOException
     {
		 searchtextbox1.sendKeys(UtilityClass.readDataFromExcel(0, 0));
     }
	 
	 public void clickOnsubmitbtn1()
     {
		 submitbtn1.click();
     }

	 public String gettextasert()
     {
       	String act2=textasert.getText();
    	 return act2;
    	 }
     
	   public void clickOnSamsungMobile1(WebDriver driver)
	     {
	    	 UtilityClass.JavaScriptExcutor(driver,samsungmobile1);
	    	 samsungmobile1.click();
	     }
	   
	   public String getpriceasert()
	     {

	    	String act3=price.getText();
	    	 return act3;
	     }
	   
	   public void clickOnaddToCartbtn(WebDriver driver)
	     {
	    	 UtilityClass.JavaScriptExcutor(driver,addToCartbtn);
	    	 addToCartbtn.click();
	     }
	   
	   public void clickCartbtn(WebDriver driver) throws InterruptedException
	     {
	    	 Cartbtn.click();
	    	 Thread.sleep(3000);
	     }
	
	   public String verifyQuantity()
	      {
	    	  String act=btn_qnty.getText();
	    	  return act;
	      }
	   public String verifyName()
	      {
	    	  String act=txt_name.getText();
	    	  return act;
	      }
	   
	   public String verifyPrice()
	      {
	    	  String act=txt_price.getText();
	    	  
	    	  return act;
	      }
}
