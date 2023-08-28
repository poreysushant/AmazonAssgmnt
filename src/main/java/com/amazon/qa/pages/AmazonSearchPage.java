package com.amazon.qa.pages;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.util.UtilityClass;

public class AmazonSearchPage 
{
	@FindBy(xpath="(//span[text()='Samsung Galaxy M32 Prime Edition (Black, 6GB RAM, 128GB)'])[1]")
	private WebElement textassert2;

	
	public AmazonSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

     public String gettextassert2()
     {
    	 
    	String act4=textassert2.getText();
    	 return act4;
     }
     
    

      
      
}
