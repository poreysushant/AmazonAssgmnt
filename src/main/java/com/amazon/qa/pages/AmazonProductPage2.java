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
	@FindBy(xpath="//span[@class=\"a-color-state a-text-bold\"]")private WebElement textasertA2;

	@FindBy(xpath="//span[text()='Apple iPhone 14 Pro Max (256 GB) - Space Black']")private WebElement AppleMobile;
	@FindBy(xpath="//div[@id=\"apex_desktop\"]//descendant::span[@data-a-size=\"xl\"]")
	private WebElement price2;
	@FindBy(xpath="//*[@id=\"submit.add-to-cart\"]/descendant::input")private WebElement addToCartbtn2;
	@FindBy(xpath="//input[@class=\"a-button-input\" and @aria-labelledby=\"attach-sidesheet-view-cart-button-announce\"]")private WebElement Cartbtn2;
	@FindBy(xpath="//span[@class=\"a-button-text a-declarative\"]")private WebElement btn_qnty2;
	@FindBy(xpath="//span[@class=\"a-truncate-full a-offscreen\"]//following-sibling::span")private WebElement txt_name2;
	@FindBy(xpath="//div[@class=\"sc-badge-price-to-pay\"]//descendant::span")private WebElement txt_price2;

	
	
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
	 
	 public String gettextasertA2()
     {
       	String actA2=textasertA2.getText();
    	 return actA2;
     }
     
	 public void clickonAppleMobile(WebDriver driver)
     { 
    	 UtilityClass.JavaScriptExcutor(driver,AppleMobile);
    	 AppleMobile.click();
     }
	 
	 public String getpriceasert2()
     {

    	String actAP2=price2.getText();
    	 return actAP2;
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
	 
	 public String verifyQuantity2()
     {
   	  String act=btn_qnty2.getText();
   	  return act;
     }
	 
	   public String verifyName2()
	      {
	    	  String act=txt_name2.getText();
	    	  return act;
	      }
	   public String verifyPrice2()
	      {
	    	  String act=txt_price2.getText();
	    	  
	    	  return act;
	      }
	  
}
