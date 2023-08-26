package com.amazon.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonProductPage 
{
	@FindBy(xpath="//span[text()='(Refurbished) Samsung Galaxy M32 (Light Blue, 6GB RAM, 128GB Storage)']")private WebElement mobile2;

	
	public AmazonProductPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
