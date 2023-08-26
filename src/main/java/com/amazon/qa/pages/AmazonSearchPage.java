package com.amazon.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.util.UtilityClass;

public class AmazonSearchPage 
{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtextbox;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submitbtn;
	@FindBy(xpath="//span[@class=\"a-color-state a-text-bold\"]")private WebElement textasert;
	@FindBy(xpath="//span[text()='(Refurbished) Samsung Galaxy M32 (Black, 6GB RAM, 128GB Storage)']")
	private WebElement samsungmobile;
	@FindBy(xpath="//span[text()='Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)']")
	private WebElement samsungmobile1;
	@FindBy(xpath="//*[@id='submit.add-to-cart']/child::span")private WebElement addToCartbtn;
	@FindBy(xpath="//form[@id='attach-view-cart-button-form']//span[@id='attach-sidesheet-view-cart-button-announce']")private WebElement Cartbtn;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement signOutbutton1;
	@FindBy(xpath="//span[text()='Sign Out']")private WebElement signOutbutton2;
	@FindBy(xpath="//div[@id=\"apex_desktop\"]//descendant::span[@data-a-size=\"xl\"]")
	private WebElement price;
	@FindBy(xpath="//iframe[@id=\"ape_Detail_ams-detail-right-v2_desktop_iframe\"]")private WebElement iframe;

	
	public AmazonSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
     public void EnterSearchTextbox() throws EncryptedDocumentException, IOException
     {
    	 searchtextbox.sendKeys(UtilityClass.readDataFromExcel(0, 0));
     }
     
     public void clickOnsubmitbtn()
     {
    	 submitbtn.click();
     }
     public String gettextasert()
     {
    	String act2=textasert.getText();
    	 return act2;
     }
     public void clickOnSamsungMobile(WebDriver driver)
     {
    	 UtilityClass.JavaScriptExcutor(driver,samsungmobile);
    	 samsungmobile.click();
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
    	// UtilityClass.JavaScriptExcutor2(driver);
    	 addToCartbtn.click();
     }
     public void clickCartbtn(WebDriver driver)
     {
    	 Actions act=new Actions(driver);
    	 act.moveToElement(Cartbtn).click().build().perform();
    	 
    	 //Cartbtn.click();
     }
     public void movetoelement2(WebDriver driver)
   	 {
  		Actions act=new Actions(driver);
  		act.moveToElement(signOutbutton1).perform();;
  	 }
      public void clickOnsignOutbutton2()
      {
     	 signOutbutton2.click();
      }
      
}
