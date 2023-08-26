package com.amazon.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage 
{
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement signInbutton1;
	@FindBy(xpath="//div[@id='nav-al-signin']//descendant::span")private WebElement signInbutton2;

	@FindBy(xpath="//label[@class=\"a-form-label\"]")private WebElement assetText1;
	@FindBy(xpath="//input[@id='ap_email']")private WebElement EmailOrMobilePhoneNumber;
	@FindBy(xpath="//input[@id='continue']")private WebElement continueButton;
	@FindBy(xpath="(//label[@class=\"a-form-label\"])[1]")private WebElement assetText2;
	@FindBy(xpath="//input[@id='ap_password']")private WebElement Password;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement signInButton;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")private WebElement assertusername;
	
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
     
	public void movetoelement(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(signInbutton1).perform();;
	}
	
	public void clickOnSignInButton() 
	{
		
		signInbutton2.click();	
	}
	
	public String AssetTextEmailOrMobileNumber()
	{    
	 	String actual=assetText1.getText();
	 	return actual;
	   
	}
	
	public void EnterEmailOrMobilePhoneNumber()
	{
		EmailOrMobilePhoneNumber.sendKeys("mitleshgawatre@gmail.com");
	}
	public void clickonContinueButton()
	{
		continueButton.click();
	}
	public String AssetTextPassword()
	{    
	 	String actual=assetText2.getText();
	 	return actual;
	   
	}
	public void enterPassword()
	{
		Password.sendKeys("tajmahal04");
	}
	
	public void clickOnSignInButton2()
	{
		signInButton.click();
	}
	public String AssertLoggedUserName()
	{
		String act=assertusername.getText();
		return act;
	}
}
